package fr.ensai.mediaplayer;

/**
 * Represents a podcast with essential attributes.
 */
public class Podcast extends Media {
    private Artist host;
    private String topic;
    /**
     * Constructs a new Podcast object.
     *
     * @param title    The title of the podcast.
     * @param duration The duration of the podcast in seconds.
     * @param content  The subtitles of the podcast.
     * @param year     The year the podcast was released.
     * @param host     The host of the podcast.
     * @param topic    The topic of the podcast.
     */
    public Podcast(String title, int duration, String content, int year, Artist host, String topic) {
        super(title, duration, content, year);
        this.host = host;
        this.topic = topic;
    }

    /**
     * String representation of the Podcast.
     */
    @Override
    public String toString() {
        return String.format("%s : a podcast about %s by %s", this.title, this.topic, this.host);
    }
}