package com.mood;
/*@Description:- analyse checking mood the message entered by user*/
public class MoodAnalyzer {
    /*@Description:- user mood by checking if the message given by user
     * method (I am in any mood) can just Check for SAD else Return Happy
     */
    public String moodAnalyser(String message) {
        if(message.contains("Sad"))
        {
            return "SAD";
        }
        else
            return "HAPPY";
    }
}


