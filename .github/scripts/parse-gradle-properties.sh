#!/bin/bash
set -euo pipefail

file=${1:-gradle.properties}
ignore_keys=${2:-org.gradle}

parse_properties_file() {
	if [[ ! -f "$file" ]]; then
		echo "Properties file not found: $file" >&2
		exit 1
	fi

	while IFS='=' read -r key value || [[ -n "$key" ]]; do
		key=$(echo "$key" | awk '{$1=$1;print}')
		value=$(echo "${value:-}" | awk '{$1=$1;print}')

		if [[ -z "$key" || "$key" =~ ^# ]]; then
			continue
		fi

		for i in ${ignore_keys//,/ }; do [[ "$key" == "$i"* ]] && continue 2; done

		output_key=$(echo "$key" | tr '[:lower:]' '[:upper:]' | tr -c '[:alnum:]' '_')
		output_key=$(echo "$output_key" | sed 's/_$//')

		echo "${output_key}=${value}"
	done < "$file"
}

parse_properties_file