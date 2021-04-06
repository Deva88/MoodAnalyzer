package com.mood;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    MoodAnalyzer moodTesting = new MoodAnalyzer();

    @Test
    public void given_Mood_When_HappySad_ReturnMessage() {
        moodTesting.message=null;
        String mood_Store=moodTesting.moodAnalyser();
        Assertions.assertEquals("true",mood_Store);

    }
}

