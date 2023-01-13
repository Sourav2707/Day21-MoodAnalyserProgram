package test.com.bridgelabs.day21_mood_analyser; 

import com.bridgelabs.day21_mood_analyser.MoodAnalyser;
import org.junit.Assert;
import org.junit.Test;
public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser = new MoodAnalyser();
@Test
public void testAnalyseMood() throws Exception {
    String message = "I'm in any mood";
    String actual = moodAnalyser.analyseMood(message);
    Assert.assertEquals("HAPPY", actual);
}
} 
