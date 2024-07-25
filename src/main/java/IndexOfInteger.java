import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }


        System.out.println("Enter the number you are looking for in the list:");
        int targetNumber = scanner.nextInt();

        boolean found = false;
        System.out.print("Indices of " + targetNumber + " in the list are:");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == targetNumber) {
                System.out.print(" " + i);
                found = true;
            }
        }
        System.out.println();

        if (!found) {
            System.out.println(targetNumber + " is not found in the list.");
        }

    }
}
