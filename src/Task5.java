import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userInput = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            userInput.add(scanner.nextLine());
        }
        scanner.close();

        checkOrder(userInput);
    }

    public static void checkOrder(ArrayList<String> userInput){
        if (isListOrdered(userInput)) {
            System.out.println("List ordered");
        }
    }

    public static boolean isListOrdered(ArrayList<String> userInput){

        int previousLength = -1;

        for(int i=0; i<userInput.size(); i++) {
            int currentLength = userInput.get(i).length();
            boolean isGreater = previousLength < currentLength;
            previousLength = currentLength;
            if(!isGreater) {
                System.out.printf("List not ordered : %d", i);
                return false;
            }
        }

        return true;
    }
}