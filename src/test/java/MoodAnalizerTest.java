import org.junit.Assert;
import org.junit.Test;

public class MoodAnalizerTest {

    @Test
    public void givenMood_WhenHavingHappy_ShouldReturnHappy() throws MoodAnalizerException {
        MoodAnalizer moodAnalyzer = new MoodAnalizer("I am in happy mood.");
        String result = moodAnalyzer.analyzeMood();
        Assert.assertEquals("Happy", result);
    }


    @Test
    public void givenMood_WhenHavingSad_ShouldReturnSad() throws MoodAnalizerException {
        MoodAnalizer moodAnalyzer = new MoodAnalizer("I am in sad mood.");
        String result = moodAnalyzer.analyzeMood();
        Assert.assertEquals("Sad", result);
    }


    @Test
    public void givenMood_WhenHavingAny_ShouldReturnHappy() {
        MoodAnalizer moodAnalyzer = new MoodAnalizer("I am in any mood.");
        String result = null;
        try {
            result = moodAnalyzer.analyzeMood();
        } catch (MoodAnalizerException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("Happy", result);
    }


    @Test
    public void givenMood_WhenNull_ShouldReturnHappy() throws MoodAnalizerException {
        MoodAnalizer moodAnalyzer = new MoodAnalizer(null);
        String result = moodAnalyzer.analyzeMood();
        Assert.assertEquals("Happy", result);
    }

    @Test
    public void givenMood_WhenEmpty_ShouldThrowException(){
        MoodAnalizer moodAnalizer=new MoodAnalizer("");
        String mood;
        try {
            mood=moodAnalizer.analyzeMood();

        }catch (MoodAnalizerException e)
        {
            Assert.assertEquals("mood cannot be empty",e.getMessage());
        }
    }

}
