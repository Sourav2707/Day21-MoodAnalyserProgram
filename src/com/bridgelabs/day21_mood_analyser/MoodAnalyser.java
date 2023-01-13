package com.bridgelabs.day21_mood_analyser;

public class MoodAnalyser {
    String analysedResult = "";
    public String analyseMood(String message) {
        boolean analyse = message.toUpperCase().contains("SAD");
        if(analyse == true) {
            analysedResult = "SAD";
        }
        else {
            analysedResult = "HAPPY";
        }
        return analysedResult;
    }
}
