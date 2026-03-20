package fr.ensai.mediaplayer;

/**
 * Represents a media item with common attributes.
 */
<<<<<<< HEAD
abstract class Media {
=======
public abstract class Media {
>>>>>>> a69da6e1632c51513e64a4b94eab350cab59ccc6
    protected String title;
    protected int duration;
    protected int year;

    /**
     * Constructs a new Media object.
     *
     * @param title    The title of the media.
     * @param duration The duration of the media in seconds.
     * @param year     The year the media was released.
     */
<<<<<<< HEAD
    public Media(String title, int duration, int year) {
=======
    protected Media(String title, int duration, int year) {
>>>>>>> a69da6e1632c51513e64a4b94eab350cab59ccc6
        this.title = title;
        this.duration = duration;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public int getDuration() {
        return this.duration;
    }

    /**
<<<<<<< HEAD
     * Abstract method to simulate playing the media item.
     */
    public abstract void play();

}
=======
     * Abstract method to get lyrics or subtitles.
     */
    protected abstract String getText();

    /**
     * Plays the Media by printing text with a small delay between each word.
     */
    public void play() {
        System.out.println("*".repeat(50));
        System.out.println("* " + this);
        System.out.println("*".repeat(50));

        String text = getText();

        if (text == null) {
            System.out.println("No content available.");
            return;
        }

        for (String word : text.split(" ")) {
            System.out.print(word + " ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread was interrupted");
                return;
            }
        }
        System.out.println();
    }
}
>>>>>>> a69da6e1632c51513e64a4b94eab350cab59ccc6
