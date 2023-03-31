package com.buanangelica.bucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

class ProjectAdapter extends RecyclerView.Adapter<ProjectAdapter.ProjectViewHolder> {
   private Project[] projects;

   public ProjectAdapter(Project[] projects) {
       this.projects = projects;
   }

   @Override
   public int getItemCount(){
       return projects.length;
    }

    @NonNull
    @Override
    public ProjectViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent,false);
        return new ProjectViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProjectViewHolder holder, int position) {
        holder.bind(projects[position]);
    }



static class ProjectViewHolder extends RecyclerView.ViewHolder{
       private TextView MainPlace;
       private TextView DescriptionPlace;
        private ImageView ImagePlace;
        private RatingBar RatingBar;
    public ProjectViewHolder(@NonNull View itemView) {
        super(itemView);
        MainPlace = itemView.findViewById(R.id.text_view_main);
        DescriptionPlace = itemView.findViewById(R.id.text_view_definition);
        ImagePlace = itemView.findViewById(R.id.image_view_display);
        RatingBar = itemView.findViewById(R.id.rating_bar);
    }


    public void bind (Project project){
        MainPlace.setText(project.name);
        DescriptionPlace.setText(project.description);
        ImagePlace.setImageResource(project.image);
        RatingBar.setRating(project.decimalValue);
    }







}

}
