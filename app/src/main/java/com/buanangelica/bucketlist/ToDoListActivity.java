package com.buanangelica.bucketlist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class ToDoListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bucket_list_layout);

        RecyclerView list = findViewById(R.id.recycler_view_bucket_list);

        Project[] projects = {
                new Project("Graduate","Graduate from college with flying colors! ",R.drawable.todolist),
                new Project("Masteral","Take a masteral degree in foreign countries",R.drawable.todolist),
                new Project("Explore","Explore the world and enjoy every moment!",R.drawable.todolist),
                new Project("Graduate","Graduate from college with flying colors! ",R.drawable.todolist),
                new Project("Masteral","Take a masteral degree in foreign countries",R.drawable.todolist),
                new Project("Explore","Explore the world and enjoy every moment!",R.drawable.todolist),
                new Project("Graduate","Graduate from college with flying colors! ",R.drawable.todolist),
                new Project("Masteral","Take a masteral degree in foreign countries",R.drawable.todolist),
                new Project("Explore","Explore the world and enjoy every moment!",R.drawable.todolist)
        };

        ProjectAdapter adapter = new ProjectAdapter(projects);
        list.setAdapter(adapter);


    }


}
