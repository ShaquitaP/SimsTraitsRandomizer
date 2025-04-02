package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    enum TraitCategories {EMOTIONAL, HOBBY, LIFESTYLE, SOCIAL};
    enum AgeCategories {ADULT, TEEN, CHILD};

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CommandMenu menu = new CommandMenu();

        System.out.println("----- Welcome to the Sims 4 Trait Randomizer -----");
        int ageCommand = menu.ageCommandMenu(input);
        if (ageCommand == 1) {
            System.out.println("You picked Adult!");
            System.out.println("You will be given 3 random traits from the Adult/Teen Traits");

            TraitCategories[] traitCats = TraitCategories.values();
            final int MAX_TRAITS = 3;
            Random generator = new Random();
            for (int i = 0; i < MAX_TRAITS; i++) {
                int trait = generator.nextInt(traitCats.length);
                if (trait == 0) {
                    TraitsAndAspirations traits = new TraitsAndAspirations();
                    //traits.pickTrait("Emotional");
                    System.out.println("Trait " + (i+1) + ": " + traits.pickTrait("Emotional"));
                }
                else if (trait == 1) {
                    TraitsAndAspirations traits = new TraitsAndAspirations();
                    //traits.pickTrait("Hobby");
                    System.out.println("Trait " + (i+1) + ": " + traits.pickTrait("Hobby"));
                }
                else if (trait == 2) {
                    TraitsAndAspirations traits = new TraitsAndAspirations();
                    //traits.pickTrait("Lifestyle");
                    System.out.println("Trait " + (i+1) + ": " + traits.pickTrait("Lifestyle"));
                }
                else if (trait == 3) {
                    TraitsAndAspirations traits = new TraitsAndAspirations();
                    //traits.pickTrait("Social");
                    System.out.println("Trait " + (i+1) + ": " + traits.pickTrait("Social"));
                }
            }
            TraitsAndAspirations aspirations = new TraitsAndAspirations();
            System.out.println("Your Aspiration: " + aspirations.pickAspiration("Adult"));
        }
        else if (ageCommand == 2) {
            System.out.println("You picked Teen!");
            System.out.println("You will be given 2 random traits from the Adult/Teen Traits");

            TraitCategories[] traitCats = TraitCategories.values();
            final int MAX_TRAITS = 2;
            Random generator = new Random();
            for (int i = 0; i < MAX_TRAITS; i++) {
                int trait = generator.nextInt(traitCats.length);
                if (trait == 0) {
                    TraitsAndAspirations traits = new TraitsAndAspirations();
                    //traits.pickTrait("Emotional");
                    System.out.println("Trait " + (i+1) + ": " + traits.pickTrait("Emotional"));
                }
                else if (trait == 1) {
                    TraitsAndAspirations traits = new TraitsAndAspirations();
                    //traits.pickTrait("Hobby");
                    System.out.println("Trait " + (i+1) + ": " + traits.pickTrait("Hobby"));
                }
                else if (trait == 2) {
                    TraitsAndAspirations traits = new TraitsAndAspirations();
                    //traits.pickTrait("Lifestyle");
                    System.out.println("Trait " + (i+1) + ": " + traits.pickTrait("Lifestyle"));
                }
                else if (trait == 3) {
                    TraitsAndAspirations traits = new TraitsAndAspirations();
                    //traits.pickTrait("Social");
                    System.out.println("Trait " + (i+1) + ": " + traits.pickTrait("Social"));
                }
            }
            TraitsAndAspirations aspirations = new TraitsAndAspirations();
            System.out.println("Your Aspiration: " + aspirations.pickAspiration("Teen"));
        }
        else if (ageCommand == 3) {
            System.out.println("You picked Child!");
            System.out.println("You will be given one random trait from the Child Traits");

            TraitCategories[] traitCats = TraitCategories.values();
            final int MAX_TRAITS = 1;
            Random generator = new Random();
            int trait = generator.nextInt(traitCats.length);
            TraitsAndAspirations traits = new TraitsAndAspirations();
            System.out.println("Trait " + trait + ": " + traits.pickChildTrait());
            TraitsAndAspirations aspirations = new TraitsAndAspirations();
            System.out.println("Your Aspiration: " + aspirations.pickAspiration("Child"));
        }
        else if (ageCommand == 0){
            System.out.println("Is there a category you don't see?\nType Y for yes or N for no");
            char answer = input.next().charAt(0);
            if (answer == 'y' || answer == 'Y') {
                AgeCategories[] age = AgeCategories.values();
                System.out.println("Sorry there is currently no functionality for ages beyond ");
                for (AgeCategories i : age) {
                    System.out.println(i);
                }
            }
        }


    }
}