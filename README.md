<!--
 SPDX-FileCopyrightText: 2025 Dominik Wombacher <dominik@wombacher.cc>
 SPDX-License-Identifier: CC-BY-SA-4.0
-->

# jDeepL

Unofficial DeepL App / GUI for Linux based on JavaFX.

Developed and tested on openSUSE Tumbleweed with KDE Plasma 6 and Java 17.

[![REUSE status](https://api.reuse.software/badge/git.sr.ht/~wombelix/jDeepL)](https://api.reuse.software/info/git.sr.ht/~wombelix/jDeepL)
[![builds.sr.ht status](https://builds.sr.ht/~wombelix/jDeepL.svg)](https://builds.sr.ht/~wombelix/jDeepL?)
[![Build and Release](https://github.com/wombelix/jDeepL/actions/workflows/release.yml/badge.svg)](https://github.com/wombelix/jDeepL/actions/workflows/release.yml)

## Quick Start

Download the latest version from [GitHub](https://github.com/wombelix/jDeepL/releases)
and run it with `java -jar jDeepL-vX.X.X.jar`.

You'll need a DeepL API key from [DeepL's website](https://www.deepl.com/en/pro-api#api-pricing).
Select the "DeepL API Free" option which gives you 500,000
characters per month at no cost, which should be enough
for personal use.

The application will ask for your API key on first launch.

## Table of Contents

* [Quick Start](#quick-start)
* [Requirements](#requirements)
* [Features](#features)
* [Installation](#installation)
* [Build](#build)
* [Source](#source)
* [Contribute](#contribute)
* [License](#license)

## Requirements

Due to the fact that this is an unofficial client which uses
the regular
[DeepL API](https://www.deepl.com/pro-api?cta=header-pro-api/),
you need your own API Key.

`DEEPL API FREE` is already sufficient and provides a
*500,000 character limit* per month at no cost,
which should be enough for personal use.

**Java Requirements:** Java 17 or later

## Features

Limited feature set and just a simple optic compared to the
official Windows or Mac App.

jDeepL supports the Free and Pro Version of the DeepL API, the
correct API URL will be picked automatically based on the
entered API Key.

The Shortcut `CTRL + C + C`, similar to the DeepL
Windows App, will:

* Copy the selected text
* Restore the jDeepL Window if it's minimized or not in Focus
* Paste the earlier copied text
* Trigger the Translation

## Installation

Pre-built releases are available on
[GitHub](https://github.com/wombelix/jDeepL/releases).

The JAR file is self-contained with all dependencies included,
so just download and run with `java -jar jDeepL-vX.X.X.jar`.

## Build

To build the code, ensure you have Java 17 or later installed.
You can use the package manager of your Linux Distribution or
try [sdkman](https://sdkman.io).

You also need [Apache Maven](https://maven.apache.org/install.html),
either use the manual installation method, your package manager
or the version shipped with your IDE. Alternatively, you can
install the Maven Wrapper with `mvn wrapper:wrapper`
after installing Maven.

The project creates a self-contained JAR file by running
`mvn compile package`.
This command will create the file `shade/jDeepL.jar`,
to launch jDeepL run `java -jar shade/jDeepL.jar`.

You can copy the JAR file to any location you prefer and
run it from there.

## Source

The primary location is:
[git.sr.ht/~wombelix/jDeepL](https://git.sr.ht/~wombelix/jDeepL)

Mirrors are available on
[Codeberg](https://codeberg.org/wombelix/jDeepL),
[Gitlab](https://gitlab.com/wombelix/jDeepL)
and
[Github](https://github.com/wombelix/jDeepL).

## Contribute

Please don't hesitate to provide Feedback,
open an Issue or create a Pull / Merge Request.

Just pick the workflow or platform you prefer and are
most comfortable with.

Feedback, bug reports or patches to my sr.ht list
[~wombelix/inbox@lists.sr.ht](https://lists.sr.ht/~wombelix/inbox) or via
[Email and Instant Messaging](https://dominik.wombacher.cc/pages/contact.html)
are also always welcome.

## License

Unless otherwise stated: `GNU General Public License v3.0 or later`

All files contain license information either as
`header comment` or `corresponding .license` file.

[REUSE](https://reuse.software) from the [FSFE](https://fsfe.org/)
implemented to verify license and copyright compliance.
