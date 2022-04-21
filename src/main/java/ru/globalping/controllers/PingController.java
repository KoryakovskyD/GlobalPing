package ru.globalping.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import ru.globalping.AbstractPingHosts;
import ru.globalping.model.Entity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class PingController implements Initializable {
    private static String dirPngGreen="C:\\png\\green.png";
    private static String dirPngRed="C:\\png\\red.png";
    private String[] list = new String[] {"192.168.62.1", "192.168.62.2", "192.168.62.3","192.168.62.4", "192.168.62.66"};

    @FXML
    GridPane gridPane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        Image imageGreen = null;
        try {
            imageGreen = new Image(new FileInputStream(dirPngGreen));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image imageRed = null;
        try {
            imageRed = new Image(new FileInputStream(dirPngRed));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

            int i = 0;
            for (String str: list) {

                Entity entity;

                if (AbstractPingHosts.PingFunc(str))
                    entity = new Entity(str, imageGreen);
                else
                    entity = new Entity(str, imageRed);

                Label host = new Label(entity.getIp());
                host.setFont(new Font("Serif", 18));
                ImageView imageView = new ImageView(entity.getImage());

                gridPane.add(host, 1, i);
                gridPane.add(imageView, 2, i);
                i++;
            }
    }
}