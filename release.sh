#!/bin/bash

# SPDX-FileCopyrightText: 2025 Dominik Wombacher <dominik@wombacher.cc>
#
# SPDX-License-Identifier: CC0-1.0

# Get next release version and append 'v'
export RELVER=v`./mvnw semantic-gitlog:derive | grep "NEXT_VERSION:==" | grep -o '[^\=\=]\+$'`

# Generate Changelogs and bump version in pom.xml
./mvnw semantic-gitlog:changelog

# Add and commit Changelog and pom file
git add CHANGELOG.md CHANGELOG.json pom.xml
git commit -m "docs: pom.xml version bumped, Changelogs generated for Release $RELVER"

# Tag Release
git tag $RELVER

# Push main branch with skip-ci to avoid triggering workflows
git push origin main -o skip-ci

# Push tag (triggers sr.ht build git mirroring)
git push origin $RELVER
