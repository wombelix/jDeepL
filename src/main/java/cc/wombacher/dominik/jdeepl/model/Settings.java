/*
 * SPDX-FileCopyrightText: 2022 Dominik Wombacher <dominik@wombacher.cc>
 *
 * SPDX-License-Identifier: GPL-3.0-or-later
 */

package cc.wombacher.dominik.jdeepl.model;

import java.util.prefs.Preferences;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Settings {
    private Preferences prefs;
    private String apiUrl;
    private String apiType;
    private static Settings instance = null;

    public Settings() {
        this.prefs = Preferences.userRoot().node("cc/wombacher/dominik/jdeepl");
        setApiUrlAndType(getApiKey());
    }

    public static Settings getInstance() {
        if (instance == null) {
            return new Settings();
        }
        else {
            return instance;
        }
    }

    private void setApiUrlAndType(String apiKey) {
        this.apiUrl = mapApiKeyToUrl(apiKey);
        this.apiType = mapApiKeyToType(apiKey);
    }

    public String mapApiKeyToUrl(String apiKey) {
        if (apiKey.endsWith(":fx")) {
            return "https://api-free.deepl.com/v2/";
        } else {
            return "https://api.deepl.com/v2/";
        }
    }

    public String mapApiKeyToType(String apiKey) {
        if (apiKey.endsWith(":fx")) {
            return "DeepL API Free";
        } else {
            return "DeepL API Pro";
        }
    }

    public void setApiKey(String apiKey) {
        this.prefs.put("apikey", apiKey);
        setApiUrlAndType(getApiKey());
    }

    public String getApiKey() {
        return this.prefs.get("apikey", "n/a");
    }

    public String getApiUrl() {
        return this.apiUrl;
    }

    public String getApiType() {
        return this.apiType;
    }

    public ObservableList getSourceLang() {
        ObservableList<TranslationLanguage> sourceLang = FXCollections.observableArrayList();
        sourceLang.addAll(
                new TranslationLanguage("BG", "Bulgarian"),
                new TranslationLanguage("CS", "Czech"),
                new TranslationLanguage("DA", "Danish"),
                new TranslationLanguage("DE", "German"),
                new TranslationLanguage("EL", "Greek"),
                new TranslationLanguage("EN", "English"),
                new TranslationLanguage("ES", "Spanish"),
                new TranslationLanguage("ET", "Estonian"),
                new TranslationLanguage("FI", "Finnish"),
                new TranslationLanguage("FR", "French"),
                new TranslationLanguage("HU", "Hungarian"),
                new TranslationLanguage("IT", "Italian"),
                new TranslationLanguage("JA", "Japanese"),
                new TranslationLanguage("LT", "Lithuanian"),
                new TranslationLanguage("LV", "Latvian"),
                new TranslationLanguage("NL", "Dutch"),
                new TranslationLanguage("PL", "Polish"),
                new TranslationLanguage("PT", "Portuguese (all varieties)"),
                new TranslationLanguage("RO", "Romanian"),
                new TranslationLanguage("RU", "Russian"),
                new TranslationLanguage("SK", "Slovak"),
                new TranslationLanguage("SL", "Slovenian"),
                new TranslationLanguage("SV", "Swedish"),
                new TranslationLanguage("ZH", "Chinese")
        );
        return sourceLang;
    }

    public ObservableList getTargetLang() {
        ObservableList<TranslationLanguage> targetLang = FXCollections.observableArrayList();
        targetLang.addAll(
                new TranslationLanguage("BG", "Bulgarian"),
                new TranslationLanguage("CS", "Czech"),
                new TranslationLanguage("DA", "Danish"),
                new TranslationLanguage("DE", "German"),
                new TranslationLanguage("EL", "Greek"),
                new TranslationLanguage("EN-GB", "English (British)"),
                new TranslationLanguage("EN-US", "English (American)"),
                new TranslationLanguage("ES", "Spanish"),
                new TranslationLanguage("ET", "Estonian"),
                new TranslationLanguage("FI", "Finnish"),
                new TranslationLanguage("FR", "French"),
                new TranslationLanguage("HU", "Hungarian"),
                new TranslationLanguage("IT", "Italian"),
                new TranslationLanguage("JA", "Japanese"),
                new TranslationLanguage("LT", "Lithuanian"),
                new TranslationLanguage("LV", "Latvian"),
                new TranslationLanguage("NL", "Dutch"),
                new TranslationLanguage("PL", "Polish"),
                new TranslationLanguage("PT-PT", "Portuguese (all varieties except Brazilian)"),
                new TranslationLanguage("PT-BR", "Portuguese (Brazilian)"),
                new TranslationLanguage("RO", "Romanian"),
                new TranslationLanguage("RU", "Russian"),
                new TranslationLanguage("SK", "Slovak"),
                new TranslationLanguage("SL", "Slovenian"),
                new TranslationLanguage("SV", "Swedish"),
                new TranslationLanguage("ZH", "Chinese")
        );
        return targetLang;
    }
}
