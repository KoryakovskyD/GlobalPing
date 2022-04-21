module ru.globalping {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.globalping to javafx.fxml;
    exports ru.globalping;
    exports ru.globalping.controllers;
    opens ru.globalping.controllers to javafx.fxml;
}