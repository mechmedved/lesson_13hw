import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task3 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("роса");
        words.add("термос");
        words.add("луг");
        words.add("город");
        words.add("утро");
        words.add("восток");
        words.add("салют");

        words = fix(words);

        words.forEach(System.out::println);
    }
    public static ArrayList<String> fix(ArrayList<String> words){

        return (ArrayList<String>) words.stream()
                        .filter(w -> !w.contains("р"))
                        .flatMap(w -> {
                            if (w.contains("л")) {
                            // Создаем поток с текущим словом и его копией
                                return Stream.of(w, w);
                            } else {
                                return Stream.of(w);
                            }
                        })
                        .collect(Collectors.toList());
    }
}
