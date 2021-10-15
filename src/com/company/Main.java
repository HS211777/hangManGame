package com.company;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    Random rn = new Random();
    ArrayList<String> wrongLetters = new ArrayList<>();
    ArrayList<String> letters = new ArrayList<>();
    ArrayList<String> words = new ArrayList<>();
    ArrayList<String> stars = new ArrayList<>();
    words.add("beach");
    words.add("cave");
    words.add("harmful");
    words.add("manage");
    words.add("general");
        words.add("haunt");
        words.add("method");
        words.add("equation");
        words.add("character");
        words.add("freight");
        int randomWord = rn.nextInt(9);
        String wordToGuess = words.get(randomWord);
        for (int i = 0; i < wordToGuess.length(); i++){
            letters.add(wordToGuess.substring(i,i+1));
        }
        for (int i = 0; i < wordToGuess.length(); i++){
            stars.add("*");
        }
        String userInput;
        int timesWrong = 0;
        int counter = 0;
        boolean end = false;
        while (!end){
            if (timesWrong == 0){
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
            }
            else if (timesWrong == 1){
                System.out.println();
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
            }
            else if (timesWrong == 2){
                System.out.println(" ______");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
            }
            else if (timesWrong == 3){
                System.out.println(" ______");
                System.out.println("|  |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
            }
            else if (timesWrong == 4){
                System.out.println(" ______");
                System.out.println("|  |");
                System.out.println("|  0");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
            }
            else if (timesWrong == 5){
                System.out.println(" ______");
                System.out.println("|  |");
                System.out.println("|  0");
                System.out.println("|  |");
                System.out.println("|");
                System.out.println("|");
            }
            else if (timesWrong == 6){
                System.out.println(" ______");
                System.out.println("|  |");
                System.out.println("|  0");
                System.out.println("| /|/");
                System.out.println("|");
                System.out.println("|");
            }
            System.out.println(wrongLetters);
            System.out.println(stars);
            System.out.println("guess a letter");
            userInput = input.next();
            while (userInput.length() != 1){
                System.out.println("please enter a single character");
                userInput = input.next();
            }
            counter = 0;
            for (int i = 0; i < wordToGuess.length(); i++){
                if (userInput.equals(letters.get(i))){
                    stars.remove(i);
                    stars.add(i,userInput);
                    counter++;
                }
            }
            if (counter == 0){
                timesWrong++;
                wrongLetters.add(userInput);
            }
            if (timesWrong > 6){
                System.out.println("You lose");
                System.out.println(" ______");
                System.out.println("|  |");
                System.out.println("|  0");
                System.out.println("| /|/");
                System.out.println("| //");
                System.out.println("|");
                end = true;
            }
            String starsString = "";
            for (int i = 0; i < wordToGuess.length(); i++){
                starsString = starsString + stars.get(i);
            }
            if (starsString.equals(wordToGuess)){
                System.out.println("You win");
                end = true;
            }
        }
    }
}
