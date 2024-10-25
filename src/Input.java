import java.util.Scanner;
import java.util.StringJoiner;

public class Input{
    private String userInput;

    public Input(String userInput) {
        this.userInput = userInput;
    }

    public String getUserInput() {
        return userInput;
    }

    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    @Override
    public String toString() {
        return userInput;
    }
}
