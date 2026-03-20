package fr.ensai.mediaplayer;

public abstract class Media {
    protected String title;
    protected int duration;
    protected String content;
    protected int year;

    public Media(String title, int duration, String content, int year) {
        this.title = title;
        this.duration = duration;
        this.content = content;
        this.year = year;
    }

    public void play() {
        System.out.println("Now playing " + this.toString());
        for (String word: this.content.split(" ")) {
            try {
                Thread.sleep(100);
                System.out.print(word + " ");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread was interrupted");
            }
        }
        System.out.println("");
    }
}
