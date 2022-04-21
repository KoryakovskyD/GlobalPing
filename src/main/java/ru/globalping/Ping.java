package ru.globalping;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import ru.globalping.model.Entity;

import java.io.FileInputStream;

public class Ping extends Application {

    private static String dirPngGreen="C:\\png\\green.png";
    private static String dirPngRed="C:\\png\\red.png";
    private String[] list = new String[] {"192.168.62.1", "192.168.62.2", "192.168.62.3","192.168.62.4", "192.168.62.66"};

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane root = new GridPane();
        Image imageGreen = new Image(new FileInputStream(dirPngGreen));
        Image imageRed = new Image(new FileInputStream(dirPngRed));

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

            root.add(host, 1, i);
            root.add(imageView, 2, i);
            i++;
        }


        Scene scene = new Scene(root, 160, 300);

        primaryStage.setTitle("Hello!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
