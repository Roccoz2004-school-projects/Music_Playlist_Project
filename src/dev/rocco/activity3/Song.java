package dev.rocco.activity3;

/**
 * Using music to motivate dynamic data structures.
 *
 * @author Mr. B
 * @version (a version number or a date)
 */
public class Song {
    // instance variables - replace the example below with your own
    private String title;
    private String artist;
    private String genre;
    private String time;

    /**
     * Constructor for objects of class Song
     *
     */


    public String mySong(String t, String a, String g, String m) {
        // initialise instance variables
        title = t;
        artist = a;
        genre = g;
        time = m;
        String[] array = {t,a,g,m};
        String info = "(" + t + ": " + a + ")";
        return info;
    }

    public String getGenre() {
        return genre;
    }

    public double getTime() {
        return Double.parseDouble(time);
    }

    public void play() {
        System.out.println("Title: " + title);
    }
    public String play(String x) {
        return x;
    }
}