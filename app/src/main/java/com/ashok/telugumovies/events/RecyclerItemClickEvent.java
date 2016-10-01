package com.ashok.telugumovies.events;

/**
 * Created by ashok on 9/30/16.
 */
public class RecyclerItemClickEvent {

    String url;

    public RecyclerItemClickEvent(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
