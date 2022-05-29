<!--
SPDX-FileCopyrightText: 2022 Dominik Wombacher <dominik@wombacher.cc>

SPDX-License-Identifier: CC0-1.0
-->

# Changelog

## 0.6.3 (2022-05-29)

### Bug Fixes

- Use Height / Width as defined in FXML ([6bf8da2d](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=6bf8da2d85f79ef866435ea1b62f1e51bc1ff3f6))


### Features

- **apikey**: Show API Key Type (Pro/Free) in Output ([5c8facdc](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=5c8facdc6f41f2c0116b0d3e449f75f26c7a163f))
- **reuse**: SPDX compatible License Header added to all files ([0a7cc699](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=0a7cc6998f2eab8fdf69627b5250f2ee73a9eaf9))
- Save and Load API Key (presistent) ([1eacc742](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=1eacc7421b055c3821f700d5b108b4523644ce1a))
- Read API Key on start, Option to set a new Key ([22e71ac8](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=22e71ac8120fd1190ea25f32e6ef5e7973b9a054))
- Select Source and Target Translation Language ([05cfb368](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=05cfb368783b929ddc29779746c810c499795a8d))
- DeepL Service definition and 'usage' Endpoint Model ([f99d9d0b](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=f99d9d0bff661fef8c492c8d48f6e5f580af3f8e))
- verify API Key before save, show message in case of error ([d1bcdd0d](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=d1bcdd0d2fbd9404eb201a3b8158136ed6c5ba5b))
- perform translation from chooseable source and target language ([c94f036a](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=c94f036a88781ec86d50f3096be3ae70642db8ae))
- Listen for Keyboard Shortcut, default: Ctrl + C + C ([40d63d5e](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=40d63d5e942a78ac83cf6bb17a98227bb91bc8d6))
- close to and open from system tray ([0319cd88](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=0319cd88feb62bce6bd7c0648464b51f87ce80cf))
- KeyboardListener to Controller, usage if Dispatcher Service, Basic functionality to react on Hotkey and paste Clipboard ([7131ebd9](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=7131ebd9b07fd305497fffca7644a1fd0e793aa4))
- reuse config and copy of used Licenses added to the project ([6583ee90](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=6583ee905935bccd74808bc9b70e6e5f9e582213))


### Code Refactoring

- Settings moved to separate View and Controller ([3f0b08bb](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=3f0b08bbad55b5f09338bde2d031f8343a5547a2))
- status before moving to retrofit ([ffb7d108](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=ffb7d108c4b63d8d6afba7ef00e8c3f5c55e93fc))
- remove obsolete class DeepLRestAPI ([39004264](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=3900426453780a5046deae93b2f456238aa385ec))
- api and type logic moved to Settings Class ([dd25edd8](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=dd25edd8d490b0d9ec4c517ad826161369e76a3b))
- rename models > model, move Controller classes into controller package ([0415f268](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=0415f2684ee602411cf76b781ad901494a8b5a51))
- Rename to align with new project structure ([a3277b79](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=a3277b792aaeddd2fb4898432fdecb3e6ce78265))
- Settings changed to singleton ([65c8c6f0](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=65c8c6f03efe8681babb42082b6916b322667318))
- renaming and alignment with new project structure ([dc5be9f6](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=dc5be9f633032806e5f0003c58ddeaa131f5e05d))
- Move API Calls into own Class, adjust related code to restore functionality ([d0ff89be](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=d0ff89becfca342b557b791ad8c67c5f83481ed0))


### Chores

- **gitignore**: Exclude .mvn/wrapper/maven-wrapper.jar ([f26f9577](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=f26f95772c6dcd208b6b35ed77ffe15651f6e794))
- **gitignore**: exclude everything IntelliJ and MVN related ([760ba78f](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=760ba78f7f3ed43732200d86c4a6ba54f9c25889))
- **gitignore**: exclude gitlogBackup files ([b9b1ce7d](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=b9b1ce7df823c3eeb3df5297c7bc4eacdd0a2002))
- Default IntelliJ .gitignore added ([4f0d0de1](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=4f0d0de1a508db5e223263df9d85deae02015352))
- Initial State based on IntelliJ JavaFX App Template ([11126a60](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=11126a607f04257d120b78280b7e2aa5155f55ba))
- references to deleted classes removed ([991aa8c9](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=991aa8c930a55d320b64938250c52e6cfff2cccc))
- removal of files newly added to .gitignore ([a78eb39d](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=a78eb39d242f570e31cb3a17a06db84a6d35bf65))


### Styles

- Title added to Settings Window, Type changed to Modal ([f02bbd62](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=f02bbd6284a1f87b0a82d23cb3645fb0031c998c))
- Show only API Type instead Key on Main Window ([bf14ba1f](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=bf14ba1fcd9aab31c57cb58e8e09c4f76121c139))
- button positions and alignment changed ([6b7c2237](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=6b7c223744581e3209ac1fabea58b2e790308ef0))


### Documentation

- **CHANGELOG.md.mustache**: License information added, avoid html escaping in commitURL ([4800eb61](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=4800eb61d2caa339f99df87539e69349835b117f))


### Build System

- **idea**: Initial state based on IntelliJ Template ([70355edc](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=70355edcbdc8672751f3776c5a44f8185930a344))
- **module-info**: require java.prefs ([bc8b676e](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=bc8b676e90bb66b3ac105cc8ae1a30e96f9026ae))
- **module-info**: require retrofit2 and jackson, open to unnamed modules ([53953433](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=539534339ffa5183821a3c854f3250eeb5da2c37))
- **mvn**: Initial state based on IntelliJ Template, Version set to 0.0.1 ([cf3ce354](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=cf3ce354b46a3c95fd43196f84eda4aaa1e5b414))
- maven dependencies for retrofit2 and jackson added ([c794eb26](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=c794eb2640aec48552515e2dc7bfde5dfb171c01))
- semantic-gitlog plugin added and configured ([d4620782](https://dominik.wombacher.cc/~git/jDeepL/commit/?id=d4620782bd84a3d4e24dc49a722cd493e5690171))

