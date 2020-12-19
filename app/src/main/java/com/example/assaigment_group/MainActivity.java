package com.example.assaigment_group;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recycler = (RecyclerView)findViewById(R.id.pizza_recycler);
        String[] captions = new String[Pizza.pizzas.length];
        int[] ids = new int[Pizza.pizzas.length];
        String[] Edition = new String[Pizza.pizzas.length];
        String[] ISBN = new String[Pizza.pizzas.length];

        for (int i = 0; i < captions.length; i++) {
            captions[i] = Pizza.pizzas[i].getName();
            ids[i] = Pizza.pizzas[i].getImageID();
            Edition[i] = Pizza.pizzas[i].getEdition();
            ISBN[i] = Pizza.pizzas[i].getISBN();

        }

        recycler.setLayoutManager(new LinearLayoutManager(this));
        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(captions, Edition, ids, ISBN);
        recycler.setAdapter(adapter);


    }
}