import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Input {

    public static String getString() {
        boolean success = false;
        String input = "";
        Scanner scan = new Scanner(System.in);
        do {
            try {
                input = scan.nextLine();
                success = true;
            } catch (InputMismatchException e) {
                System.out.print("Illegal input%n" +
                        "Enter again: ");
            }
        }
        while (!success);
        return input;
    }

    public static int getInt() {
        boolean success = false;
        int input = 0;
        Scanner scan = new Scanner(System.in);
        do {
            try {
                input = scan.nextInt();
                success = true;
            } catch (InputMismatchException e) {
                System.out.print("Illegal input%n" +
                        "Enter again: ");
                scan.nextLine();
            }
        }
        while (!success);
        scan.nextLine();
        return input;
    }
}
