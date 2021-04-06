package com.mood;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    MoodAnalyzer mood=new MoodAnalyzer();
    @Test
    public void given_Mood_When_HappySad_ReturnMessage() {
        MoodAnalyzer moodTesting =new MoodAnalyzer();
        String mood= moodTesting.moodAnalyser("i am in sad mood");

        Assertions.assertEquals("SAD",mood);
    }
}

