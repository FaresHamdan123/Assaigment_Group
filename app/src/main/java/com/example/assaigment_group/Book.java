package com.example.assaigment_group;

import java.io.Serializable;

public class Book  implements Serializable {
    private String name;
    private int imageID;
    private String Edition;
    private String ISBN;

    public Book(String name, int imageID, String Edition, String ISBN) {
        this.name = name;
        this.imageID = imageID;
        this.Edition = Edition;
        this.ISBN = ISBN;
    }

    public String getName(){return name;}
    public int getImageID(){return imageID;}
    public String getEdition(){return Edition;}
    public String getISBN(){return ISBN;}
}
