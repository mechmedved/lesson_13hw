import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            input.add(scanner.nextLine());
        }

        System.out.println(checkLengths(input));
    }

    public static String checkLengths(ArrayList<String> input){
        AtomicInteger previousLength = new AtomicInteger(-1);
        AtomicInteger index = new AtomicInteger(0);

        ArrayList<String> result = (ArrayList<String>) input.stream()
                .filter(w -> {
                    int currentLength = w.length();
                    boolean isGreater = previousLength.get() < currentLength;
                    previousLength.set(currentLength);
                    if (!isGreater) {
                        index.set(input.indexOf(w));
                    }
                    return isGreater;
                })
                .collect(Collectors.toList());

        if (result.size() == input.size()) {
            return "Список упорядочен";
        } else {
            return "Индекс элемента (нарушающего упорядоченность): " + index.get();
        }
    }
}
