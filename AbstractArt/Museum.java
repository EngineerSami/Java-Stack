package com.example.demo.abstractart;

import java.util.ArrayList;

public class Museum {
 public static void main(String[] args) {
    ArrayList<Art> museum = new ArrayList<>();

        Painting painting1 = new Painting("Starry Night", "Vincent van Gogh", "A depiction of a night sky filled with swirling clouds and stars.", "Oil");
        Painting painting2 = new Painting("The Persistence of Memory", "Salvador Dalí", "A surreal painting featuring melting clocks.", "Oil");
        Painting painting3 = new Painting("Water Lilies", "Claude Monet", "A series of approximately 250 oil paintings depicting Monet's flower garden.", "Watercolor");

        Sculpture sculpture1 = new Sculpture("David", "Michelangelo", "A Renaissance sculpture of a standing male nude.", "Marble");
        Sculpture sculpture2 = new Sculpture("The Thinker", "Auguste Rodin", "A bronze sculpture of a man deep in thought.", "Bronze");

        museum.add(painting1);
        museum.add(painting2);
        museum.add(painting3);
        museum.add(sculpture1);
        museum.add(sculpture2);

        for (Art art : museum) {
            art.viewArt();
        }   
    }
    
}
