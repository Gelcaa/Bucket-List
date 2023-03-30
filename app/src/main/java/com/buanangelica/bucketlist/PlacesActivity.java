package com.buanangelica.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bucket_list_layout);

        RecyclerView list = findViewById(R.id.recycler_view_bucket_list);

        Project[] projects = {
                new Project("Japan","Enjoy the tech life and tourist spots in Japan ",R.drawable.tokyo),
                new Project("Korea","Enjoy the street foods and party life in Seoul",R.drawable.korea),
                new Project("Greenland","watch the northern Lights in Greenland!",R.drawable.greenland)
        };

        ProjectAdapter adapter = new ProjectAdapter(projects);
        list.setAdapter(adapter);


    }


}