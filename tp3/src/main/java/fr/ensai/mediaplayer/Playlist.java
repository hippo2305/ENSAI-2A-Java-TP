package fr.ensai.mediaplayer;

import java.util.List;
import java.util.ArrayList;
import lombok.Getter;

public class Playlist {
    private String name;
    private List<Media> mediaList;
    @Getter private int totalDuration;

    public Playlist(String name) {
        this.name = name;
        this.mediaList = new ArrayList<>();
        this.totalDuration = 0;
    }

    public Playlist(Playlist another) {
        this.name = another.name;
        this.mediaList = another.mediaList;
        this.totalDuration = another.totalDuration;
    }

    public int getPlaylistSize(){
        return this.mediaList.size();
    }

    public void updateTotalDuration() {
        this.totalDuration = 0;
        for(Media i: this.mediaList) {
            this.totalDuration += i.getDuration();
        }
    }

    public void addMedia(Media media) {
        this.mediaList.add(media);
        this.updateTotalDuration();
    }

    public void removeMedia(Media media) {
        this.mediaList.remove(media);
        this.updateTotalDuration();
    }

    public void removeMedia(int index) {
        this.mediaList.remove(index);
        this.updateTotalDuration();
    }

    @Override
    public String toString() {
        return String.format("Playlist %s of %s medias (Duration : %s seconds)", this.name, this.mediaList.size(), this.totalDuration);
    }
}
