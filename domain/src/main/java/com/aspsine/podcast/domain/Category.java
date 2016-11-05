package com.aspsine.podcast.domain;

import java.util.List;

/**
 * Created by aspsine on 16/9/12.
 */

public class Category {

    private String id;

    private String name;

    private List<Podcast> podcasts;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Podcast> getPodcasts() {
        return podcasts;
    }

    public void setPodcasts(List<Podcast> podcasts) {
        this.podcasts = podcasts;
    }
}
