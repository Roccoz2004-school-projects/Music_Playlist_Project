package dev.rocco.activity2;

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
    private double time;

    /**
     * Constructor for objects of class Song
     */


    public Song(String t, String a, String g, double m) {
        // initialise instance variables
        title = t;
        artist = a;
        genre = g;
        time = m;
    }

    public String getGenre() {
        return genre;
    }

    public double getTime() {
        return time;
    }

    public void play() {
        System.out.println("Title: " + title);
    }
    public void play(int x) {

    }
}