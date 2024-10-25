import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            input.add(scanner.nextLine());
        }

        input = doubleValues(input);
        input.forEach(System.out::println);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> input)
    {
        return (ArrayList<String>) input.stream().flatMap(w -> Stream.of(w,w)).collect(Collectors.toList());
    }
}
