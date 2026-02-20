package com.ironhack;

public class Movie extends Video{
    private double rating;

    public Movie(int duration, String title, double rating) {
        super(duration, title);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String getInfo(){
        return "This Video's title: " + getTitle() + " | duration: "  + getDuration() + " min | rating: " + getRating();

    }
}
