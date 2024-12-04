package com.mycompany.puzzlejava;

import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class PuzzleJava {
    private Random randMachine = new Random();

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> rolls = new ArrayList<>();
        for (int i = 0; i < 10; i++) rolls.add(randMachine.nextInt(20) + 1);
        return rolls;
    }

    public String getRandomLetter() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        return String.valueOf(alphabet[randMachine.nextInt(26)]);
    }

    public int generatePassword() {
        int password = 0;
        for (int i = 0; i < 8; i++) {
            password = password * 10 + randMachine.nextInt(10); // Append digits to create an 8-digit number
        }
        return password;
    }

    public int[] getNewPasswordSet(int length) {
        int[] passwordSet = new int[length];
        for (int i = 0; i < length; i++) {
            passwordSet[i] = generatePassword();
        }
        return passwordSet;
    }

    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

        // Test cases
        System.out.println("Ten random rolls: " + generator.getTenRolls());
        System.out.println("Random letter: " + generator.getRandomLetter());
        System.out.println("Random password: " + generator.generatePassword());
        System.out.println("Password set: " + Arrays.toString(generator.getNewPasswordSet(5)));
    }
}
