package com.example.home_worck_2.data.model;


import com.google.gson.annotations.SerializedName;

public class Film {

        @SerializedName("id")
        private String id;

        @SerializedName("title")
        private String title;

        @SerializedName("producer")
        private String producer;

        @SerializedName("director")
        private String director;

        @SerializedName("original_title")
        private String originalTitle;

        @SerializedName("release_date")
        private String releaseDate;

        @SerializedName("rt_score")
        private String rtScore;

        @SerializedName("running_time")
        private String runningTime;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getProducer() {
            return producer;
        }

        public void setProducer(String producer) {
            this.producer = producer;
        }

        public String getDirector() {
            return director;
        }

        public void setDirector(String director) {
            this.director = director;
        }

        public String getOriginalTitle() {
            return originalTitle;
        }

        public void setOriginalTitle(String originalTitle) {
            this.originalTitle = originalTitle;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        public String getRtScore() {
            return rtScore;
        }

        public void setRtScore(String rtScore) {
            this.rtScore = rtScore;
        }

        public String getRunningTime() {
            return runningTime;
        }

        public void setRunningTime(String runningTime) {
            this.runningTime = runningTime;
        }

        @Override
        public String toString() {
            return "Film{" +
                    "id='" + id + '\'' +
                    ", title='" + title + '\'' +
                    ", producer='" + producer + '\'' +
                    ", director='" + director + '\'' +
                    ", originalTitle='" + originalTitle + '\'' +
                    ", releaseDate='" + releaseDate + '\'' +
                    ", rtScore='" + rtScore + '\'' +
                    ", runningTime='" + runningTime + '\'' +
                    '}';
        }
    }

