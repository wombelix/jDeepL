package cc.wombacher.dominik.jdeepl;

import java.util.prefs.Preferences;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Settings {
    private Preferences prefs;

    public Settings() {
        this.prefs = Preferences.userRoot().node("cc/wombacher/dominik/jdeepl");
    }
    public void setApiKey(String apiKey) {
        this.prefs.put("apikey", apiKey);
    }

    public String getApiKey() {
        return this.prefs.get("apikey", "n/a");
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
