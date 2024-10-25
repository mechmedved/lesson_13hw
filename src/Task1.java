import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Input> inputs = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String userInput = scanner.nextLine();
            inputs.add(new Input(userInput));
        }

        scanner.close();

        inputs.remove(3);

        Collections.reverse(inputs);

        System.out.println(inputs.toString());
    }
}