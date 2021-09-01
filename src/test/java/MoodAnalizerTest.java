import org.junit.Assert;
import org.junit.Test;

public class MoodAnalizerTest {

    @Test
    public void givenMood_WhenHavingHappy_ShouldReturnHappy() {
        MoodAnalizer moodAnalyzer = new MoodAnalizer("I am in happy mood.");
        String result = moodAnalyzer.analyzeMood();
        Assert.assertEquals("Happy", result);
    }


    @Test
    public void givenMood_WhenHavingSad_ShouldReturnSad() {
        MoodAnalizer moodAnalyzer = new MoodAnalizer("I am in sad mood.");
        String result = moodAnalyzer.analyzeMood();
        Assert.assertEquals("Sad", result);
    }


    @Test
    public void givenMood_WhenHavingAny_ShouldReturnHappy() {
        MoodAnalizer moodAnalyzer = new MoodAnalizer("I am in any mood.");
        String result = moodAnalyzer.analyzeMood();
        Assert.assertEquals("Happy", result);
    }


    @Test
    public void givenMood_WhenNull_ShouldReturnHappy() {
        MoodAnalizer moodAnalyzer = new MoodAnalizer(null);
        String result = moodAnalyzer.analyzeMood();
        Assert.assertEquals("Happy", result);
    }

}
