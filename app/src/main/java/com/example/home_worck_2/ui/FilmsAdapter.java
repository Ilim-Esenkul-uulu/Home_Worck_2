package com.example.home_worck_2.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.home_worck_2.R;
import com.example.home_worck_2.data.model.Film;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class FilmsAdapter extends RecyclerView.Adapter<FilmsAdapter.FilmsVH> {

    private List<Film> filmList = new ArrayList<>();
    private OnItemClickListener clickListener;

    public void setClickListener(OnItemClickListener clickListener) {
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public FilmsVH onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.films_model, parent, false);
        return new FilmsVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull FilmsAdapter.FilmsVH holder, int position) {
        holder.onBind(filmList.get(position));
    }

    @Override
    public int getItemCount() {
        return filmList.size();
    }

    public void addToList(List<Film> films) {
        this.filmList = films;
        notifyDataSetChanged();
    }

    public class FilmsVH extends RecyclerView.ViewHolder {
        private TextView title;
        private TextView director;
        public FilmsVH(@NonNull @NotNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(v -> clickListener.onItemClick(filmList.get(getAdapterPosition())));
            title = itemView.findViewById(R.id.title_txt);
            director = itemView.findViewById(R.id.director_txt);
        }

        public void onBind(Film film) {
            title.setText(film.getTitle());
            director.setText(film.getDirector());
        }
    }

    interface OnItemClickListener{
        void onItemClick(Film film);
    }
}
