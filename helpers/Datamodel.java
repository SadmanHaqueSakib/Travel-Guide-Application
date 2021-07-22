package com.example.travelmania.helpers;

public class Datamodel {
    int image;
    String header;

    public Datamodel(int image, String header) {
        this.image = image;
        this.header = header;
    }
    public int getImage() {
        return image;
    }


    public String getHeader() {
        return header;
    }

}
