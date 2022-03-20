module cc.wombacher.dominik.jdeepl {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.prefs;
    requires java.net.http;
    requires org.json;
    requires com.fasterxml.jackson.databind;


    opens cc.wombacher.dominik.jdeepl to javafx.fxml;
    exports cc.wombacher.dominik.jdeepl;
}