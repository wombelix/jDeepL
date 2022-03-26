module cc.wombacher.dominik.jdeepl {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.prefs;
    requires java.net.http;
    requires retrofit2;
    requires retrofit2.converter.jackson;
    requires com.fasterxml.jackson.annotation;
    requires com.github.kwhat.jnativehook;
    requires FXTrayIcon;

    opens cc.wombacher.dominik.jdeepl;
    exports cc.wombacher.dominik.jdeepl;
    exports cc.wombacher.dominik.jdeepl.model;
    opens cc.wombacher.dominik.jdeepl.model;
    exports cc.wombacher.dominik.jdeepl.controller;
    opens cc.wombacher.dominik.jdeepl.controller;
}