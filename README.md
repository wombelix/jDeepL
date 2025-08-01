<!--
 SPDX-FileCopyrightText: 2023 Dominik Wombacher <dominik@wombacher.cc>
 SPDX-License-Identifier: CC-BY-SA-4.0
-->

# jDeepL

Unofficial DeepL App / GUI for Linux based on JavaFX.

Developed and tested on openSUSE Tumbleweed, KDE Plasma and Java 17.

[![REUSE status](https://api.reuse.software/badge/git.sr.ht/~wombelix/jDeepL)](https://api.reuse.software/info/git.sr.ht/~wombelix/jDeepL)

## Table of Contents

* [Requirements](#requirements)
* [Features](#features)
* [Releases](#releases)
* [Build](#build)
* [Source](#source)
* [Contribute](#contribute)
* [License](#license)

## Requirements

Due to the fact that this is an unofficial client which uses the regular [DeepL API](https://www.deepl.com/pro-api?cta=header-pro-api/), you need your own API Key.

`DEEPL API FREE` is already sufficient and provides a *500,000 character limit* per month at no cost, which should be enough for personal use.

**Java Requirements:**
- Java 17 or later

## Features

Limited feature set and just a simple optic compared to the official Windows or Mac App.

jDeepL supports the Free and Pro Version of the DeepL API, the correct API URL will be picked automatically based on the entered API Key.

The Shortcut `CTRL + C + C`, similar to the DeepL Windows App, will:
* Copy the selected text
* Restore the jDeepL Window if it's minimized or not in Focus
* Paste the earlier copied text
* Trigger the Translation

## Releases

There is no automated release process in place yet, I'm also still testing the most suitable packaging and Distribution format.

For the time being, I'm going to manually publish new releases on my personal Nextcloud instance: https://hub.xlii.cc/s/an7E9E9bgFBpRG3

Latest version: `v0.7.4` (SHA256 checksum: `206c13ec820451096bdf07f29e336c6827c750db11554d9dcc68812c8b56c796`)

## Build

To build the code, ensure you have Java 17 or later installed.
You can use the package manager of your Linux Distribution or try [sdkman](https://sdkman.io).

You also need [Apache Maven](https://maven.apache.org/install.html), either use the manual installation method,
your package manager or the version shipped with your IDE.

The project is pre-configured to compile a fat jar file by running `mvn compile package`.
This command will create the file `shade/jDeepL.jar`, to launch `jDeepL` run `java -jar shade/jDeepL.jar`.

You can also copy the `.jar` file to any other location you prefer and run it from there.

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

Just pick the workflow or platform you prefer and are most comfortable with.

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
