package com.ironhack;

public abstract class Video {
    private String title;
    private int duration;

    public abstract String getInfo();

    public Video(int duration, String title) {
        this.duration = duration;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
