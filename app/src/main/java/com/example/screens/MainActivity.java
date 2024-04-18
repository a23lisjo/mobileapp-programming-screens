package com.example.screens;






import static androidx.core.content.ContextCompat.startActivity;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button goToDetailsActivityButton = findViewById(R.id.goToDetailsActivityButton);
        goToDetailsActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
                intent.putExtra("name", "Daniel"); // Optional
                intent.putExtra("number", 1); // Optional
                startActivity(intent);
            }
        });


    }


}
