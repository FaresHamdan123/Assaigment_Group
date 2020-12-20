package com.example.assaigment_group;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecoundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);
        ImageView imageView = findViewById(R.id.image);
        TextView name = findViewById(R.id.Name);
        TextView edition = findViewById(R.id.Edition);
        TextView ISBN = findViewById(R.id.ISBN);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            Book book = (Book) getIntent().getSerializableExtra("Book");
            if (book != null) {
                name.setText(book.getName());
                edition.setText(book.getEdition());
                ISBN.setText(book.getISBN());
                imageView.setImageResource(book.getImageID());
            } else {
                startActivity(new Intent(SecoundActivity.this, MainActivity.class));
            }
        }
    }
}