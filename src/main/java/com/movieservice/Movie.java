package com.movieservice;

import java.util.List;

public class Movie {
    private String title;
    private int minutes;
    private String genre;
    private float rating;
    private int metascore;
    private String description;
    private int votes;
    private double gross;
    private String year;
    private List<Credit> credits;

    public Movie() {
    }

    public Movie(String title, int minutes, String genre, float rating, int metascore, String description, int votes, double gross, String year, List<Credit> credits) {
        this.title = title;
        this.minutes = minutes;
        this.rating = rating;
        this.metascore = metascore;
        this.description = description;
        this.votes = votes;
        this.gross = gross;
        this.year = year;
        this.genre= genre;
        this.credits = credits;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public float getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getMetascore() {
        return metascore;
    }

    public void setMetascore(int metascore) {
        this.metascore = metascore;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }

    public double getGross() {
        return gross;
    }

    public void setGross(double gross) {
        this.gross = gross;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public List<Credit> getCredits() {
        return credits;
    }

    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }
}
