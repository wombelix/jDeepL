package cc.wombacher.dominik.jdeepl;

import java.util.prefs.Preferences;
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
}
