package com.mood;
/*@Description:- analyse checking mood the message entered by user*/
public class MoodAnalyzer {
    /*@Description:- user mood by checking if the message given by user
     * contains word sad or happy and return the mood value according to it
     */
    public String moodAnalyser(String message) {
        if (message.contains("Happy") || message.contains("happy"))
        {
            return "HAPPY";
        }
        else
            return "SAD";
    }
}

