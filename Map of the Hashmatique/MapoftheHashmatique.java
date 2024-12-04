package com.mycompany.mapofthehashmatique;

import java.util.HashMap;

public class MapoftheHashmatique {

    public static void main(String[] args) {

        HashMap<String, String> trackList = new HashMap<>();


        trackList.put("Counting Stars", "Lately I been, I been losing sleep, dreaming about the things that we could be...");
        trackList.put("Kalbim", "Kalbim seni unutur mu? Bu sözler yalan olur mu?");
        trackList.put("All Girls Are the Same", "They're rotting my brain, love, these hoes are the same...");
        trackList.put("Revenge", "I've dug two graves for us, my dear...");


        String songTitle = "Uprising";
        String lyrics = trackList.get(songTitle);
        System.out.println("Lyrics for \"" + songTitle + "\": " + lyrics);


        System.out.println("\nAll tracks and lyrics:");
        for (String track : trackList.keySet()) {
            System.out.println("Track: " + track + " | Lyrics: " + trackList.get(track));
        }
    }
}

