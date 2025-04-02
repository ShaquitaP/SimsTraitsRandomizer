package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class AdultTraits {

    public String pickTrait(String name) {
        ArrayList<String> array = new ArrayList<>();
        //System.out.println("AdultTraits-" + name + ".txt");
        try {
            FileReader file = new FileReader("AdultTraits-" + name + ".txt");
            BufferedReader reader = new BufferedReader(file);
            String line = "";
            while ((line = reader.readLine()) != null) {
                array.add(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Random generator = new Random();
        int gen = generator.nextInt(array.size());
        return array.get(gen);
    }
}

