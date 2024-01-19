                    changelog=$(cat CHANGELOG.md)
                    tag=2.0.0

                    list=$(echo "$changelog" | sed -n "/^## $tag/,/^## [0-9]/p" | sed -e '1d;$d' -e '/^$/d')

                    echo "$list" > RELEASE_CHANGELOG.md