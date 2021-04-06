package com.mood;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    MoodAnalyzer mood=new MoodAnalyzer();

    @Test
    //TC1.2-validate (i am in any mood) should return happy
    public void given_Mood_When_HappySad_ReturnMessage() {
        MoodAnalyzer moodTesting =new MoodAnalyzer();
        String mood= moodTesting.moodAnalyser("I am in any mood");
        Assertions.assertEquals("HAPPY",mood);
    }
}

