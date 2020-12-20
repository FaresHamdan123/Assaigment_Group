package com.example.assaigment_group;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;

public class MainActivity extends AppCompatActivity implements ClickListener {

    private Book[] books;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        books = getBooks();
        RecyclerView recycler = (RecyclerView) findViewById(R.id.recyclerView);
        recycler.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter(this, books);
        recycler.setAdapter(adapter);
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MainActivity.this, SecoundActivity.class);
        intent.putExtra("Book", books[position]);
        startActivity(intent);
    }

    public Book[] getBooks() {
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