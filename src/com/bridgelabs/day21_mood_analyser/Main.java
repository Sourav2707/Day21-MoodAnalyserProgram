package com.bridgelabs.day21_mood_analyser;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to day 21 mood analyser program with exception handling");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence to analyse your mood");
        String message = scanner.nextLine();
        MoodAnalyser moodAnalyser = new MoodAnalyser(message);
        System.out.println(moodAnalyser.analyseMood());

    }
}
