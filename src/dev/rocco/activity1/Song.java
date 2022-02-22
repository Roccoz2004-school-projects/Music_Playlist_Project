package dev.rocco.activity1;

public class Song
{
    // instance variables - replace the example below with your own
    private String title;
    private String artist;
    private double time;
    private String genre;

    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        title = "Chopsticks";
        artist = "anonymous";
        time = 0.0;
    }

    public Song(String t, String a, String g, double m)
    {
        // initialise instance variables
        title = t;
        artist = a;
        time = m;
        genre = g;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return	the sum of x and y
     */
    public void play()
    {
        if (artist.equals("Beatles")) {
            System.out.println("Title: "+ title);
        }
    }
}
