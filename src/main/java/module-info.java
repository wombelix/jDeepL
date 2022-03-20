module cc.wombacher.dominik.jdeepl {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.prefs;
    requires java.net.http;
    requires retrofit2;
    requires retrofit2.converter.jackson;
    requires com.fasterxml.jackson.annotation;

    opens cc.wombacher.dominik.jdeepl;
    exports cc.wombacher.dominik.jdeepl;
    exports cc.wombacher.dominik.jdeepl.models;
    opens cc.wombacher.dominik.jdeepl.models;
}