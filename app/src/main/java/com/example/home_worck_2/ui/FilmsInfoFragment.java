package com.example.home_worck_2.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.home_worck_2.R;
import com.example.home_worck_2.data.model.Film;
import com.example.home_worck_2.data.remote.RetrofitBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FilmsInfoFragment extends Fragment {

    private String id;
    private TextView title;
    private TextView originalTitle;
    private TextView director;
    private TextView producer;
    private TextView releaseDate;
    private TextView rtScore;
    private TextView runningTime;

    public FilmsInfoFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) id = getArguments().getString("film") ;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_films_info, container, false);
        initUi(view);
        openFilmFrag();
        return view;
    }

    private void initUi(View view) {
        title = view.findViewById(R.id.film_title_txt);
        originalTitle = view.findViewById(R.id.film_original_title_txt);
        director = view.findViewById(R.id.director_txt);
        producer = view.findViewById(R.id.film_producer_txt);
        releaseDate = view.findViewById(R.id.film_release_date_txt);
        rtScore = view.findViewById(R.id.film_rt_score_txt);
        runningTime = view.findViewById(R.id.film_running_time_txt);

    }

    private void openFilmFrag() {
        RetrofitBuilder.getInstance().getFilms(id).enqueue(new Callback<Film>() {

            @Override
            public void onResponse(Call<Film> call, Response<Film> response) {
                if (response.isSuccessful() && response.body() != null){
                    title.setText(response.body().getTitle());
                    originalTitle.setText(response.body().getOriginalTitle());
//                    director.setText(response.body().getDirector());
                    producer.setText(response.body().getProducer());
                    releaseDate.setText(response.body().getReleaseDate());
                    rtScore.setText(response.body().getRtScore());
                    runningTime.setText(response.body().getRunningTime());
                }
            }

            @Override
            public void onFailure(Call<Film> call, Throwable t) {
            }
        });
    }
}