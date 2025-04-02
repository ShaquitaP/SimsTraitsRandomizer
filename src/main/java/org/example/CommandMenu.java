package org.example;

import java.util.Scanner;

public class CommandMenu {
    private enum AgeCategories {ADULT, TEEN, CHILD}


    public int ageCommandMenu(Scanner input) {
        System.out.println("----- AGE MENU -----");
        System.out.println("Please indicate the age range for the sim");
        System.out.println("~Adult\n~Teen\n~Child");
        String answer = input.nextLine();
        answer = answer.toUpperCase();
        AgeCategories age = AgeCategories.valueOf(answer);

        return switch (age) {
            case ADULT -> 1;
            case TEEN -> 2;
            case CHILD -> 3;
            default -> 0;
        };
    }

}
