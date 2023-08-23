import java.util.Scanner;

public class TextReader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib einen Text ein: ");
        String input = scanner.nextLine();

        System.out.println("Zeichen einzeln ausgeben:");
        for (char c : input.toCharArray()) {
            System.out.println(c);
        }
    }
}
