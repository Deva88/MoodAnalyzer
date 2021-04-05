package com.mood;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    MoodAnalyzer mood=new MoodAnalyzer();
    @Test
    public void given_Mood_When_HappySad_ReturnMessage() {
        String moodTesting = mood.moodAnalyser("i am in Happy mood");
        boolean result = moodTesting.contains("HAPPY");
        System.out.println(result);

        Assertions.assertEquals(true,result);
    }
}

