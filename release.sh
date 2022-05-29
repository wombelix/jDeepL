#!/bin/bash

# SPDX-FileCopyrightText: 2022 Dominik Wombacher <dominik@wombacher.cc>
#
# SPDX-License-Identifier: GPL-3.0-or-later

# Get next release version and append 'v'
export RELVER=v`./mvnw semantic-gitlog:derive | grep "NEXT_VERSION:==" | grep -o '[^\=\=]\+$'`

# Generate Changelogs and bump version in pom.xml
./mvnw semantic-gitlog:changelog

# Ensure spdx / reuse compliant license information are added to generated CHANGELOG.json
reuse addheader --license CC0-1.0 --copyright-style spdx --year 2022 --copyright "Dominik Wombacher <dominik@wombacher.cc>" CHANGELOG.json

# Add and commit Changelog and pom file
git add CHANGELOG.md CHANGELOG.json CHANGELOG.json.license pom.xml
git commit -m "docs: pom.xml version bumped, Changelogs generated for Release $RELVER"

# Tag Release
git tag $RELVER

# Push Release Origin
git push origin main
git push origin $RELVER

# Push Release to Mirrors
git push mirror main
git push mirror $RELVER
