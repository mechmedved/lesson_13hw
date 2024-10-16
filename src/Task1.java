import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

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

        List<Input> revInputs = inputs.stream()
                                .collect(Collectors.collectingAndThen(Collectors.toList(), lst -> {
                                Collections.reverse(lst);
                                return lst.stream();
                                })).toList();
        System.out.println(revInputs.toString());
    }
}