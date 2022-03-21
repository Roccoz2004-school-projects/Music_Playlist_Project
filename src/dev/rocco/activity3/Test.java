package dev.rocco.activity3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("src/dev/rocco/activity2/mySongs.txt"));
            ArrayList<Song> mySongs = new ArrayList<>();
            Song mySong;

            while (input.hasNext()) {
                String t = input.nextLine();
                String a = input.nextLine();
                String m = input.nextLine();
                String g = input.nextLine();
                mySong = new Song();
                if (a.equals("Beatles")) {
                    mySong.play();
                }
            }

        } catch (IOException err) {
            System.out.println("File Not Found.");
        }

    }
}