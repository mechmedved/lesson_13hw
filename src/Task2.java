import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> poetry = new ArrayList<>();
        poetry.add("мама");
        poetry.add("мыла");
        poetry.add("раму");

        List<String> exactPoetry = poetry.stream().map(str -> str + " именно").toList();
        System.out.println(exactPoetry);
    }
}
