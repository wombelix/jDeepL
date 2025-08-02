<!--
 SPDX-FileCopyrightText: 2022 Dominik Wombacher <dominik@wombacher.cc>

 SPDX-License-Identifier: CC0-1.0
-->
# Changelog

## 0.8.0 (2025-08-02)

### Bug Fixes

- Use Height / Width as defined in FXML ([6bf8da2d](https://git.sr.ht/~wombelix/jDeepL/commit/?id=6bf8da2d85f79ef866435ea1b62f1e51bc1ff3f6))
- unused reuse commands removed from release.sh ([793dc739](https://git.sr.ht/~wombelix/jDeepL/commit/?id=793dc739b75559204a7cfb63f1fc82e590aa61e9))
- correct typo in Usage.java variable name ([2f2a81bb](https://git.sr.ht/~wombelix/jDeepL/commit/?id=2f2a81bbfcd3f2aaa649d6445a0746af40c3f311))


### Features

- **apikey**: Show API Key Type (Pro/Free) in Output ([5c8facdc](https://git.sr.ht/~wombelix/jDeepL/commit/?id=5c8facdc6f41f2c0116b0d3e449f75f26c7a163f))
- **release.sh**: Add spdx license header to CHANGELOG.json after generation, push to origin and mirror ([10da77c1](https://git.sr.ht/~wombelix/jDeepL/commit/?id=10da77c1052dc7bbfa7dc483db22075e3cee4a38))
- **reuse**: SPDX compatible License Header added to all files ([0a7cc699](https://git.sr.ht/~wombelix/jDeepL/commit/?id=0a7cc6998f2eab8fdf69627b5250f2ee73a9eaf9))
- Save and Load API Key (presistent) ([1eacc742](https://git.sr.ht/~wombelix/jDeepL/commit/?id=1eacc7421b055c3821f700d5b108b4523644ce1a))
- Read API Key on start, Option to set a new Key ([22e71ac8](https://git.sr.ht/~wombelix/jDeepL/commit/?id=22e71ac8120fd1190ea25f32e6ef5e7973b9a054))
- Select Source and Target Translation Language ([05cfb368](https://git.sr.ht/~wombelix/jDeepL/commit/?id=05cfb368783b929ddc29779746c810c499795a8d))
- DeepL Service definition and 'usage' Endpoint Model ([f99d9d0b](https://git.sr.ht/~wombelix/jDeepL/commit/?id=f99d9d0bff661fef8c492c8d48f6e5f580af3f8e))
- verify API Key before save, show message in case of error ([d1bcdd0d](https://git.sr.ht/~wombelix/jDeepL/commit/?id=d1bcdd0d2fbd9404eb201a3b8158136ed6c5ba5b))
- perform translation from chooseable source and target language ([c94f036a](https://git.sr.ht/~wombelix/jDeepL/commit/?id=c94f036a88781ec86d50f3096be3ae70642db8ae))
- Listen for Keyboard Shortcut, default: Ctrl + C + C ([40d63d5e](https://git.sr.ht/~wombelix/jDeepL/commit/?id=40d63d5e942a78ac83cf6bb17a98227bb91bc8d6))
- close to and open from system tray ([0319cd88](https://git.sr.ht/~wombelix/jDeepL/commit/?id=0319cd88feb62bce6bd7c0648464b51f87ce80cf))
- KeyboardListener to Controller, usage if Dispatcher Service, Basic functionality to react on Hotkey and paste Clipboard ([7131ebd9](https://git.sr.ht/~wombelix/jDeepL/commit/?id=7131ebd9b07fd305497fffca7644a1fd0e793aa4))
- reuse config and copy of used Licenses added to the project ([6583ee90](https://git.sr.ht/~wombelix/jDeepL/commit/?id=6583ee905935bccd74808bc9b70e6e5f9e582213))
- add version to window title ([5f65a6f5](https://git.sr.ht/~wombelix/jDeepL/commit/?id=5f65a6f5df8057993a979cb42703d680f928ddca))


### Code Refactoring

- Settings moved to separate View and Controller ([3f0b08bb](https://git.sr.ht/~wombelix/jDeepL/commit/?id=3f0b08bbad55b5f09338bde2d031f8343a5547a2))
- status before moving to retrofit ([ffb7d108](https://git.sr.ht/~wombelix/jDeepL/commit/?id=ffb7d108c4b63d8d6afba7ef00e8c3f5c55e93fc))
- remove obsolete class DeepLRestAPI ([39004264](https://git.sr.ht/~wombelix/jDeepL/commit/?id=3900426453780a5046deae93b2f456238aa385ec))
- api and type logic moved to Settings Class ([dd25edd8](https://git.sr.ht/~wombelix/jDeepL/commit/?id=dd25edd8d490b0d9ec4c517ad826161369e76a3b))
- rename models > model, move Controller classes into controller package ([0415f268](https://git.sr.ht/~wombelix/jDeepL/commit/?id=0415f2684ee602411cf76b781ad901494a8b5a51))
- Rename to align with new project structure ([a3277b79](https://git.sr.ht/~wombelix/jDeepL/commit/?id=a3277b792aaeddd2fb4898432fdecb3e6ce78265))
- Settings changed to singleton ([65c8c6f0](https://git.sr.ht/~wombelix/jDeepL/commit/?id=65c8c6f03efe8681babb42082b6916b322667318))
- renaming and alignment with new project structure ([dc5be9f6](https://git.sr.ht/~wombelix/jDeepL/commit/?id=dc5be9f633032806e5f0003c58ddeaa131f5e05d))
- Move API Calls into own Class, adjust related code to restore functionality ([d0ff89be](https://git.sr.ht/~wombelix/jDeepL/commit/?id=d0ff89becfca342b557b791ad8c67c5f83481ed0))


### Chores

- **CHANGELOG**: License Header adjusted, detached license file added for CHANGELOG.json ([81fc6e50](https://git.sr.ht/~wombelix/jDeepL/commit/?id=81fc6e5070e4ad0b9e3491f88c980ebe8ce30166))
- **gitignore**: Exclude .mvn/wrapper/maven-wrapper.jar ([f26f9577](https://git.sr.ht/~wombelix/jDeepL/commit/?id=f26f95772c6dcd208b6b35ed77ffe15651f6e794))
- **gitignore**: exclude everything IntelliJ and MVN related ([760ba78f](https://git.sr.ht/~wombelix/jDeepL/commit/?id=760ba78f7f3ed43732200d86c4a6ba54f9c25889))
- **gitignore**: exclude gitlogBackup files ([b9b1ce7d](https://git.sr.ht/~wombelix/jDeepL/commit/?id=b9b1ce7df823c3eeb3df5297c7bc4eacdd0a2002))
- Default IntelliJ .gitignore added ([4f0d0de1](https://git.sr.ht/~wombelix/jDeepL/commit/?id=4f0d0de1a508db5e223263df9d85deae02015352))
- Initial State based on IntelliJ JavaFX App Template ([11126a60](https://git.sr.ht/~wombelix/jDeepL/commit/?id=11126a607f04257d120b78280b7e2aa5155f55ba))
- references to deleted classes removed ([991aa8c9](https://git.sr.ht/~wombelix/jDeepL/commit/?id=991aa8c930a55d320b64938250c52e6cfff2cccc))
- removal of files newly added to .gitignore ([a78eb39d](https://git.sr.ht/~wombelix/jDeepL/commit/?id=a78eb39d242f570e31cb3a17a06db84a6d35bf65))
- bump copyright year, adjust newlines in license headers ([32f43316](https://git.sr.ht/~wombelix/jDeepL/commit/?id=32f43316e13868b4f6442a4ff478e62c4071928f))
- minor reformatting based on pre-commit hook findings ([2b27b09c](https://git.sr.ht/~wombelix/jDeepL/commit/?id=2b27b09ccbd1b553a2286743219df40f0d3364b8))


### Styles

- Title added to Settings Window, Type changed to Modal ([f02bbd62](https://git.sr.ht/~wombelix/jDeepL/commit/?id=f02bbd6284a1f87b0a82d23cb3645fb0031c998c))
- Show only API Type instead Key on Main Window ([bf14ba1f](https://git.sr.ht/~wombelix/jDeepL/commit/?id=bf14ba1fcd9aab31c57cb58e8e09c4f76121c139))
- button positions and alignment changed ([6b7c2237](https://git.sr.ht/~wombelix/jDeepL/commit/?id=6b7c223744581e3209ac1fabea58b2e790308ef0))


### Documentation

- **CHANGELOG.md.mustache**: License information added, avoid html escaping in commitURL ([4800eb61](https://git.sr.ht/~wombelix/jDeepL/commit/?id=4800eb61d2caa339f99df87539e69349835b117f))
- **README**: Initial version added ([6c9f41be](https://git.sr.ht/~wombelix/jDeepL/commit/?id=6c9f41be3895fe50a063c334af306931de6f6463))
- **README**: reuse urls changed, minor wording adjustments and typo fixes ([f712878f](https://git.sr.ht/~wombelix/jDeepL/commit/?id=f712878fd3f94462349a57d7b745cb9c7a97df43))
- **README**: Section added how to build the code and run 'jDeepL' ([0975d9e9](https://git.sr.ht/~wombelix/jDeepL/commit/?id=0975d9e9b1dac627db049b18518e11551802c65d))
- **README**: Section added about 'jDeepL' releases, including download url and latest version ([7be02ff6](https://git.sr.ht/~wombelix/jDeepL/commit/?id=7be02ff6847ccd60f44ff2f30e4afa73a229a7a6))
- pom.xml version bumped, Changelogs generated for Release v0.6.3 ([5245322f](https://git.sr.ht/~wombelix/jDeepL/commit/?id=5245322ffa493b78db4060c74740e70082a813f8))
- pom.xml version bumped, Changelogs generated for Release v0.7.2 ([5388abef](https://git.sr.ht/~wombelix/jDeepL/commit/?id=5388abef5cef29185aa02ae456fdfdbbaa564d3a))
- pom.xml version bumped, Changelogs generated for Release v0.7.4 ([a0801cbd](https://git.sr.ht/~wombelix/jDeepL/commit/?id=a0801cbde9f606aa4a23fe459c5682b7c68ed799))
- update README.md structure and outdated information ([300cf4bb](https://git.sr.ht/~wombelix/jDeepL/commit/?id=300cf4bbcdf492063f90f7a3668c583adbb0038d))
- improve README with Quick Start and better documentation ([ae4d56b4](https://git.sr.ht/~wombelix/jDeepL/commit/?id=ae4d56b4e9f95101dc8e146d1be06479b4b791ce))


### Build System

- **gha**: workflow to build and release pre-compiled .jar based on git tag ([ea3e2ab3](https://git.sr.ht/~wombelix/jDeepL/commit/?id=ea3e2ab3607a363c907c38b294cf7d6e3fad7bb5))
- **idea**: Initial state based on IntelliJ Template ([70355edc](https://git.sr.ht/~wombelix/jDeepL/commit/?id=70355edcbdc8672751f3776c5a44f8185930a344))
- **module-info**: require java.prefs ([bc8b676e](https://git.sr.ht/~wombelix/jDeepL/commit/?id=bc8b676e90bb66b3ac105cc8ae1a30e96f9026ae))
- **module-info**: require retrofit2 and jackson, open to unnamed modules ([53953433](https://git.sr.ht/~wombelix/jDeepL/commit/?id=539534339ffa5183821a3c854f3250eeb5da2c37))
- **mvn**: Initial state based on IntelliJ Template, Version set to 0.0.1 ([cf3ce354](https://git.sr.ht/~wombelix/jDeepL/commit/?id=cf3ce354b46a3c95fd43196f84eda4aaa1e5b414))
- **pom.xml**: jlink related configuration removed, value for 'mainClass' moved into shared parameter ([0fd3448c](https://git.sr.ht/~wombelix/jDeepL/commit/?id=0fd3448c209a0da572ef3f785f7be342713ccecb))
- **pom.xml**: bump retrofit2 to v2.12.0 ([2bac6d55](https://git.sr.ht/~wombelix/jDeepL/commit/?id=2bac6d55cfabe412de4dce482d88ee683039a137))
- **pom.xml**: fix maven shade plugin warnings ([d45a62fe](https://git.sr.ht/~wombelix/jDeepL/commit/?id=d45a62fe13f1b8ae0f0f46355ee84d05e3dfd4ae))
- **pre-commit**: add pre-commit hooks ([be707ef3](https://git.sr.ht/~wombelix/jDeepL/commit/?id=be707ef3f05b4ca8eec44e2301c8a431a7ee7903))
- **release.sh**: updated, handles changelog and tagging, build migrated to GitHub Action ([16d7edf9](https://git.sr.ht/~wombelix/jDeepL/commit/?id=16d7edf9e1be8a72a4931d7c0ffd3848bf5d685e))
- **sr.ht**: manifest to perform git mirroring ([d7b4f821](https://git.sr.ht/~wombelix/jDeepL/commit/?id=d7b4f8219a86f894e455c8a411aca3277190b617))
- **sr.ht**: fix typo in repo name ([68087274](https://git.sr.ht/~wombelix/jDeepL/commit/?id=68087274039d1f2fd926a6ca974cd9450c4e2fa0))
- **sr.ht**: fix missing cd into src folder ([57767bf9](https://git.sr.ht/~wombelix/jDeepL/commit/?id=57767bf9c7c26be37cfe803565d4a4d8326141fe))
- maven dependencies for retrofit2 and jackson added ([c794eb26](https://git.sr.ht/~wombelix/jDeepL/commit/?id=c794eb2640aec48552515e2dc7bfde5dfb171c01))
- semantic-gitlog plugin added and configured ([d4620782](https://git.sr.ht/~wombelix/jDeepL/commit/?id=d4620782bd84a3d4e24dc49a722cd493e5690171))
- release.sh added, triggers changelog generation, version bump and tagging ([fb8e1b7f](https://git.sr.ht/~wombelix/jDeepL/commit/?id=fb8e1b7f6df3bdbe8b3352b1d0206e06683f4600))
- bump gitlog plugin version, change scm url ([17525f98](https://git.sr.ht/~wombelix/jDeepL/commit/?id=17525f98b66574f762743680907ed2d45af515bb))
- use jlink and shade to create fat jar ([0a67423f](https://git.sr.ht/~wombelix/jDeepL/commit/?id=0a67423f7773e38ef86e3f0855eb83ff116727f8))
- exclude temporary build files/folders from git ([fcccfdbf](https://git.sr.ht/~wombelix/jDeepL/commit/?id=fcccfdbf40d0f42e98e512ab410177856e114526))
- upgrade to Java 17 LTS ([1ac39a57](https://git.sr.ht/~wombelix/jDeepL/commit/?id=1ac39a572ae6ee300a19887e83c18d0c28f236ef))
- upgrade JavaFX to 21.0.8 LTS ([eda80e9f](https://git.sr.ht/~wombelix/jDeepL/commit/?id=eda80e9fb72cbeb74738735f672c4a32bcafaa70))
- update jackson-annotations to 2.19.2 ([9c24c149](https://git.sr.ht/~wombelix/jDeepL/commit/?id=9c24c1491da0ea2a883712388c0b2bf2b52635e2))
- update FXTrayIcon to 4.2.3 and fix deprecation ([cc38e93a](https://git.sr.ht/~wombelix/jDeepL/commit/?id=cc38e93aae5b16acd6afe8de1a093397164f206a))
- update JUnit to 5.13.4 ([99cca88a](https://git.sr.ht/~wombelix/jDeepL/commit/?id=99cca88a8e2d4a4762831ddceb81094485d1cad7))
- update semantic-gitlog to 0.8.20 ([7c4c8500](https://git.sr.ht/~wombelix/jDeepL/commit/?id=7c4c85005d9aadf312fef862ad5fe7adaf09e627))
- update Maven plugins to latest versions ([6fa46c17](https://git.sr.ht/~wombelix/jDeepL/commit/?id=6fa46c17b99a8f534d5b78d1ad80563af59c8bb5))


### Others

- bump version of FXTrayIcon and retrofit2 ([f81493b1](https://git.sr.ht/~wombelix/jDeepL/commit/?id=f81493b1dbc015f4454b0e5b40f323920641a028))
