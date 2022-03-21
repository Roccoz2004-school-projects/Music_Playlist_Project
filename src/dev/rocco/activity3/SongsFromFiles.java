package dev.rocco.activity3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class SongsFromFiles {
    public static Random rnd = new Random();
    public static Song Song = new Song();
    public static ArrayList<String> mySongs = new ArrayList<>();

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/dev/rocco/activity2/mySongs.txt"));

            while (input.hasNext()) {
                String t = input.nextLine();
                String a = input.nextLine();
                String m = input.nextLine();
                String g = input.nextLine();

                Song.mySong(t,a,g,m);
                Song.play();
                mySongs.add(Song.mySong(t,a,g,m));
            }
            System.out.println(mySongs);

        } catch (IOException err) {
            System.out.println("File Not Found.");
        }

    }
}