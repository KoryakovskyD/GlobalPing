package ru.globalping.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import ru.globalping.Ping;
import ru.globalping.StartPing;

import java.net.URL;
import java.util.ResourceBundle;

public class MainFrameController implements Initializable {

    @FXML
    public ChoiceBox choiceBox;

    public void handleButtonAction(ActionEvent actionEvent) {
        Stage stage = new Stage();
        try {
            Ping ping = new Ping();
            ping.start(stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            ObservableList<String> list = FXCollections.observableArrayList("Olymp-G", "Ariadna", "Borey-055A", "Rubicon-B2");
            choiceBox.setItems(list);
    }
}