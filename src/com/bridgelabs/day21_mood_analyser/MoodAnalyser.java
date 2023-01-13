package com.bridgelabs.day21_mood_analyser;

public class MoodAnalyser {
    String message;
    String analysedResult = ""; //taking an empty string to store the result
    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }
    public String analyseMood() throws Exception{
        try {
            if(message.contains("")) {
                throw new Exception("The string is empty, please enter something");
            }
            else if(message.toUpperCase().contains("SAD")) {
                analysedResult = "SAD"; //if analyse is true sad will be stored
            }
            else {
                analysedResult = "HAPPY"; //else happy will be stored and returned
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return analysedResult;
    }
}
