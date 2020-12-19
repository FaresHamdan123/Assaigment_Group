package com.example.assaigment_group;

public class Pizza {
    private String name;
    private int imageID;
    private String Edition;
    private String ISBN;

    public static final Pizza[] pizzas = {
            new Pizza("Publication Manual of the American Psychological Association", R.drawable.one, "7th", "9781433832185, 1433832186"),
            new Pizza("Interactive: Leadership: Theory and Practice Interactive eBook", R.drawable.two, "8th", "9781544325194, 1544325193"),
            new Pizza("Gendered Voices, Feminist Visions", R.drawable.three, "7th", "9780190924935, 0190924934"),
            new Pizza("The Color of Law: A Forgotten History of How Our Government Segregated America", R.drawable.four, "7th", "9781631492860, 1631492861"),
            new Pizza("How to Be an Antiracist", R.drawable.five, "7th", "9780525509295, 0525509291"),
            new Pizza("Me and White Supremacy", R.drawable.sex, "7th", "9781728209814, 1728209811"),
            new Pizza("World Architecture", R.drawable.seven, "2nd", "9780190646479, 0190646470"),
            new Pizza("Communication Pathways", R.drawable.eight, "2nd", "9781644851623, 1644851628"),
            new Pizza("The Feynman Lectures on Physics, boxed set: The New Millennium Edition New Millennium ed. Edition", R.drawable.nine, "7th", "9781524856223, 1244521626"),
            new Pizza("Baby University Board Book Set: A Science for Toddlers Board Book Set (Science Gifts for Kids) (Baby University Board Book Sets)", R.drawable.ten, "7th", "9781522315423, 1135145714")

    };

    private Pizza(String name, int imageID, String Edition, String ISBN) {
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
