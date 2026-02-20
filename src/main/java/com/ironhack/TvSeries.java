package com.ironhack;

public class TvSeries extends Video{
    private int episodes;

    public TvSeries(int duration, String title, int episodes) {
        super(duration, title);
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return "This Video's title: " + getTitle() + " | duration: "  + getDuration() + " min | episodes: " + getEpisodes();
    }
}
