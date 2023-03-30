package com.buanangelica.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView PlacesActivity;
    CardView ToDoListActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlacesActivity = findViewById(R.id.card_view_places);
        ToDoListActivity = findViewById(R.id.card_view_todolist);

        PlacesActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPlacesActivity = new Intent(MainActivity.this, PlacesActivity.class);
                        startActivity(intentPlacesActivity);
            }
        });

        ToDoListActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentToDoListActivity = new Intent(MainActivity.this, ToDoListActivity.class);
                startActivity(intentToDoListActivity);
            }
        });







    }


}