package com.example.screens;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;




import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class DetailsActivity extends AppCompatActivity {




    TextView detailsName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        detailsName=findViewById(R.id.detailsName);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            int number = extras.getInt("number");
            // Do something with the name and number


            String detailsText = "Name: " + name + "\nNumber: " + number;
            detailsName.setText(detailsText);


        }




    }
}
