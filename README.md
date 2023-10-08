<!--
 SPDX-FileCopyrightText: 2023 Dominik Wombacher <dominik@wombacher.cc>
 SPDX-License-Identifier: CC-BY-SA-4.0
-->
# jDeepL

Unofficial DeepL App / GUI for Linux based on JavaFX.

Developed and tested on openSUSE Tumbleweed, KDE Plasma and OpenJDK 11.

[![REUSE status](https://api.reuse.software/badge/git.sr.ht/~wombelix/jDeepL)](https://api.reuse.software/info/git.sr.ht/~wombelix/jDeepL)

# Table of Content

* [Requirements](#requirements)
* [Features](#features)
* [Releases](#releases)
* [Build](#build)
* [Contribution](#contribution)
* [License](#license)

# Requirements

Due to the fact that this is an unofficial client which use the regular [DeepL API](https://www.deepl.com/pro-api?cta=header-pro-api/), you need a own API Key.

`DEEPL API FREE` is already sufficient and provides a *500,000 character limit* per month at no cost, which should be enough for personal use.

# Features

Limited feature set and just a simple optic compared to the official Windows or Mac App.

jDeepL supports the Free and Pro Version of the DeepL API, the correct API URL will be picked automatically based on the entered API Key.

The Shortcut `CTRL + C + C`, similar to the DeepL Windows App, will:
* Copy the selected text
* Restore the jDeepL Window if it's minimized or not in Focus
* Paste the earlier copied text
* Trigger the Translation

# Releases

There is no automated release process in place yet, I'm also still testing the most suitable packaging and Distribution format.

For the time being, I'm going to manually publish new releases on my personal Nextcloud instance: https://hub.xlii.cc/s/an7E9E9bgFBpRG3

Latest version: `v0.7.4` (SHA256 checksum: `206c13ec820451096bdf07f29e336c6827c750db11554d9dcc68812c8b56c796`)

# Build

Clone the repository from your preferred location (Primary: [sourcehut](https://git.sr.ht/~wombelix/jDeepL) / 
Mirror: [codeberg](https://codeberg.org/wombelix/jDeepL), [gitlab](https://gitlab.com/wombelix/jDeepL), [github](https://github.com/wombelix/jDeepL)).

To build the code, ensure you have a SDK in version 11 installed, 
you can use the package manager of your Linux Distribution or try [sdkman](https://sdkman.io).

You also need [Apache Maven](https://maven.apache.org/install.html), either use the manual installation method, 
your package manager or the version shipped with your IDE.

The Project is pre-configured to compile a fat jar file by running `mvn compile package`. 
This command will create the file `shade/jDeepL.jar`, to launch `jDeepL` run `java -jar shade/jDeepL.jar`.

You can for sure also copy the `.jar` file to any other location you prefer and run it from there.

# Contribution

The primary location of the Source Code is: https://git.sr.ht/~wombelix/jDeepL

Mirrors of the repository are available on 
[Codeberg](https://codeberg.org/wombelix/jDeepL), 
[Gitlab](https://gitlab.com/wombelix/jDeepL) and 
[Github](https://github.com/wombelix/jDeepL).

Please don't hesitate to provide Feedback, open an Issue or create an Pull / Merge Request.

Just pick the workflow or platform you prefer and are most comfortable with.

Feedback, Bug Reports or Patches via [Email](https://dominik.wombacher.cc/pages/contact.html) are also always welcome.

# License

Unless otherwise stated: `GNU General Public License v3.0 or later`

All files contain license information either as `header comment` or `corresponding .license` file.

[REUSE](https://reuse.software) from the [FSFE](https://fsfe.org/) implemented to verify license and copyright compliance.
