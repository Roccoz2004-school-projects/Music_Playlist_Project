package dev.rocco.activity1;
import java.util.*;

public class MusicPlayer
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class MusicPlayer
     */
    public MusicPlayer()
    {

    }

    public static void main(String [] args)
    {
        Song track1 = new Song("Fire and Rain","James Taylor","music",4.5);
        Song track2 = new Song("Calypso","John Denver","music",3.5);
        Song track3 = new Song();
        Song track4 = new Song("Yesterday","Beatles","rock",2.6);
        Song track5 = new Song("Here Comes the Sun","Beatles","rock",4.2);
        Song track6 = new Song("Fur Elise","Beethoven","classical",5.2);
        Song track7 = new Song("Running Wild","Hot Sardines","Jazz",3.3);
        Song track8 = new Song("Help!","Beatles","rock",2.8);
        Song track9 = new Song("I Can Only Imagine","Mercy Me","Christian",4.4);
        Song track10 = new Song("Rage Over a Lost Penny","Beethoven","classical",3.1);

        track1.play();
        track2.play();
        track3.play();
        track4.play();
        track5.play();
        track6.play();
        track7.play();
        track8.play();
        track9.play();
        track10.play();
    }
}
