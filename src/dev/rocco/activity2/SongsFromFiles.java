package dev.rocco.activity2;
import java.util.*;
import java.io.*;

public class SongsFromFiles
{
    public static void main(String[]args)
    {
        try
        {
            Scanner input = new Scanner(new File("src/dev/rocco/activity2/mySongs.txt"));
            ArrayList<Song> mySongs = new ArrayList<>();
            while(input.hasNext())
            {
                String t = input.nextLine();
                String a = input.nextLine();
                String m = input.nextLine();
                String g = input.nextLine();
                Song mySong = new Song(t,a,g,Double.parseDouble(m));
                mySongs.add(mySong);

            }

        }
        catch(IOException err)
        {
            System.out.println("File Not Found.");
        }
    }
}