import java.util.ArrayList;
import java.util.Scanner;

public class FifthItem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> strings = new ArrayList<>();

        System.out.println("Enter strings (press Enter to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
        }


        if (strings.size() >= 5) {
            String fifthItem = strings.get(4);
            System.out.println("The fifth item in the list is: " + fifthItem);
        } else {
            System.out.println("You did not enter at least 5 strings.");
        }

    }
}
