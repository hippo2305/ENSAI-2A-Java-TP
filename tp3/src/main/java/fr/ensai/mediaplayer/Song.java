package fr.ensai.mediaplayer;

import java.util.Objects;
import java.util.List;

/**
 * Represents a song with essential attributes.
 */
public class Song extends Media {
    private List<Genre> genres;
    private Artist singer;
    private Artist author = null;
    private Artist composer = null;
    /**
     * Constructs a new Song object.
     *
     * @param title    The title of the song.
     * @param duration The duration of the song in seconds.
     * @param content  The lyrics of the song.
     * @param year     The year the song was released.
     * @param genre    The genre of the song
     * @param singer   The singer of the song.
     * @param author   The author of the song.
     * @param composer The composer of the song.
     */
    public Song(String title, int duration, String content, int year, List<Genre> genres, Artist singer, Artist author, Artist composer) {
        super(title, duration, content, year);
        this.genres = genres;
        this.singer = singer;
        this.author = author;
        this.composer = composer;
    }

    /**
     * String representation of the Song.
     */
    @Override
    public String toString() {
        return String.format("Song %s by %s", this.title, this.singer);
    }
    
    /**
     * Indicates whether some other object is "equal to" this one. Two Song
     * objects are considered equal if they have the same title, singer, and year.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;
        Song otherSong = (Song) o;
        return this.year == otherSong.year &&
                Objects.equals(this.title, otherSong.title) &&
                Objects.equals(this.singer, otherSong.singer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.title, this.singer, this.year);
    }

}