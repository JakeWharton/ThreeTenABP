#!/usr/bin/env bash

set -e

mkdir temp
pushd temp

# Download the latest release jar
wget --trust-server-names "https://search.maven.org/remote_content?g=org.threeten&a=threetenbp&v=LATEST"
ls

# Extract its version
file="$(ls)"
version="${file#threetenbp-}"
version="${version%.jar}"

# Unzip its contents
unzip "$file"

rm ../threetenabp/src/main/assets/org/threeten/bp/TZDB.dat
mv org/threeten/bp/TZDB.dat ../threetenabp/src/main/assets/org/threeten/bp/

popd
rm -r temp

sed -i '' -E "s/threetenbp:[^:]+:no-tzdb/threetenbp:${version}:no-tzdb/" build.gradle
