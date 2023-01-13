package com.bridgelabs.day21_mood_analyser;

public class MoodAnalyser {
    String message;
    String analysedResult = ""; //taking an empty string to store the result
    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood() {
        boolean analyse = message.toUpperCase().contains("SAD"); //converting to upper case for consistent result and using contains method to check
        if(analyse == true) {
            analysedResult = "SAD"; //if analyse is true sad will be stored
        }
        else {
            analysedResult = "HAPPY"; //else happy will be stored and returned
        }
        return analysedResult;
    }
}
