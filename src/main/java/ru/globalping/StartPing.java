package ru.globalping;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class StartPing extends Stage {
    public void start() throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLPing.fxml"));
        Scene scene = new Scene(root);
        setScene(scene);
        show();
    }
}
