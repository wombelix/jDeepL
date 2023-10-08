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

# Contribution

The primary location of the Source Code is: https://git.sr.ht/~wombelix/jDeepL

Mirrors of the repository are available on 
[Codeberg](https://codeberg.org/wombelix/jDeepL), 
[Gitlab](https://gitlab.com/wombelix/jDeepL) and 
[Github](https://github.com/wombelix/jDeepL).

Please don't hesitate to provide Feedback, open an Issue or create an Pull / Merge Request.

Just pick the workflow or platform you prefer and are most comfortable with.

Feedback, Bug Reports or Patches via [eMail](https://dominik.wombacher.cc/pages/contact.html) are also always welcome.

# License

Unless otherwise stated: `GNU General Public License v3.0 or later`

All files contain license information either as `header comment` or `corresponding .license` file.

[REUSE](https://reuse.software) from the [FSFE](https://fsfe.org/) implemented to verify license and copyright compliance.
