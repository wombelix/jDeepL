package cc.wombacher.dominik.jdeepl;

import com.github.kwhat.jnativehook.keyboard.NativeKeyEvent;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

public class KeyboardListener implements NativeKeyListener {
    private StringBuilder shortcutBuffer;
    private final String CONTROLKEY;
    private final String KEYS;
    private final String SHORTCUT;

    public KeyboardListener() {
        this("Ctrl", "CC");
    }
    public KeyboardListener(String controlKeys, String keys) {
        this.shortcutBuffer = new StringBuilder();
        this.CONTROLKEY = controlKeys;
        this.KEYS = keys;
        this.SHORTCUT = this.CONTROLKEY + this.KEYS;
    }

    public void nativeKeyPressed(NativeKeyEvent e) {
        if (NativeKeyEvent.getKeyText(e.getKeyCode()).equals(CONTROLKEY) ||
                this.shortcutBuffer.length() > SHORTCUT.length()) {
            this.shortcutBuffer.setLength(0);
        }
        this.shortcutBuffer.append(NativeKeyEvent.getKeyText(e.getKeyCode()));
        if (this.shortcutBuffer.toString().equals(SHORTCUT)) {
            // To do
        }
    }

    public void nativeKeyReleased(NativeKeyEvent e) {}
    public void nativeKeyTyped(NativeKeyEvent e) {}
}
