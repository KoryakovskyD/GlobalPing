package ru.globalping.model;

import javafx.scene.image.Image;

public class Entity {
    private String ip;
    private Image image;

    public Entity(String ip, Image image) {
        this.ip = ip;
        this.image = image;
    }

    public String getIp() {
        return ip;
    }

    public Image getImage() {
        return image;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}

