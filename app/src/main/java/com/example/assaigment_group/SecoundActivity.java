package com.example.assaigment_group;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecoundActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView Name;
    private TextView Edition;
    private TextView ISBN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);
        imageView=findViewById(R.id.image);
        Name=findViewById(R.id.Name);
        Edition=findViewById(R.id.Edition);
        ISBN=findViewById(R.id.ISBN);

        Bundle extras = getIntent().getExtras();
        if(extras!=null){
            Name.setText(extras.getString("Name"));
            Edition.setText(extras.getString("Edition"));
            ISBN.setText(extras.getString("ISBN"));
            imageView.setImageResource(extras.getInt("image"));
        }

    }
}