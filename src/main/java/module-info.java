module cc.wombacher.dominik.jdeepl {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.prefs;


    opens cc.wombacher.dominik.jdeepl to javafx.fxml;
    exports cc.wombacher.dominik.jdeepl;
}