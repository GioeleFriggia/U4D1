import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String string1 = scanner.nextLine(
        );

        System.out.println("Enter the second string:");
        String string2 = scanner.nextLine();

        System.out.println("Enter the third string:");
        String string3 = scanner.nextLine();

        System.out.println("Concatenation in insertion order: " + string1 + string2 + string3);
        System.out.println("Concatenation in reverse order: " + string3 + string2 + string1);

        scanner.close();
    }
}
