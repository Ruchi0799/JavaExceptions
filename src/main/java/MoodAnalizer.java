public class MoodAnalizer {
    private String message;

    public MoodAnalizer(String message) {
        this.message = message;
    }

    public MoodAnalizer() {
    }

    public String analyzeMood() {
        try {
            if (message.contains("happy")) return "Happy";

            else if (message.contains("sad")) return "Sad";

            else return "Happy";
        }
        catch(NullPointerException exception) {
            return "Happy";
        }
    }
}

