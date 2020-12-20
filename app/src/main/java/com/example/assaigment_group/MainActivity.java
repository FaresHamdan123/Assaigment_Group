package com.example.assaigment_group;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ClickListener{

    private Book[] books;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        books=getBooks();
        RecyclerView recycler = (RecyclerView)findViewById(R.id.recyclerView);
        String[] captions = new String[Book.pizzas.length];
        int[] imageIds = new int[Book.pizzas.length];
        String[] Edition = new String[Book.pizzas.length];
        String[] ISBN = new String[Book.pizzas.length];

        for (int i = 0; i < captions.length; i++) {
            captions[i] = Book.pizzas[i].getName();
            imageIds[i] = Book.pizzas[i].getImageID();
            Edition[i] = Book.pizzas[i].getEdition();
            ISBN[i] = Book.pizzas[i].getISBN();
        }

        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, Edition, imageIds, ISBN,this);
        recycler.setAdapter(adapter);
    }

    @Override
    public void onItemClick(int position) {
       Intent intent = new Intent(MainActivity.this,SecoundActivity.class);
       intent.putExtra("Name",books[position].getName());
       intent.putExtra("Edition",books[position].getEdition());
       intent.putExtra("ISBN",books[position].getISBN());
       intent.putExtra("image",books[position].getImageID());
       startActivity(intent);
    }

    public  Book[] getBooks () {
            return new Book[]{
                    new Book("Publication Manual of the American Psychological Association", R.drawable.one, "7th", "9781433832185, 1433832186"),
                    new Book("Interactive: Leadership: Theory and Practice Interactive eBook", R.drawable.two, "8th", "9781544325194, 1544325193"),
                    new Book("Gendered Voices, Feminist Visions", R.drawable.three, "7th", "9780190924935, 0190924934"),
                    new Book("The Color of Law: A Forgotten History of How Our Government Segregated America", R.drawable.four, "7th", "9781631492860, 1631492861"),
                    new Book("How to Be an Antiracist", R.drawable.five, "7th", "9780525509295, 0525509291"),
                    new Book("Me and White Supremacy", R.drawable.sex, "7th", "9781728209814, 1728209811"),
                    new Book("World Architecture", R.drawable.seven, "2nd", "9780190646479, 0190646470"),
                    new Book("Communication Pathways", R.drawable.eight, "2nd", "9781644851623, 1644851628"),
                    new Book("The Feynman Lectures on Physics, boxed set: The New Millennium Edition New Millennium ed. Edition", R.drawable.nine, "7th", "9781524856223, 1244521626"),
                    new Book("Baby University Board Book Set: A Science for Toddlers Board Book Set (Science Gifts for Kids) (Baby University Board Book Sets)", R.drawable.ten, "7th", "9781522315423, 1135145714")
            };
    }
}