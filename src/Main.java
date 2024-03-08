import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your String here");
        String inputLine = scanner.nextLine();
        char[] characters = inputLine.toCharArray();
        char delimiter = ' ';
        int wordStartIndex = 0;
        for (int i = 0; i <= characters.length; i++) {
            if (i == characters.length || characters[i] == delimiter) {
                for (int j = i - 1; j >= wordStartIndex; j--) {
                    System.out.print(characters[j]);
                }
                wordStartIndex = i + 1;
                if (i != characters.length) {
                    System.out.print(" ");
                }
            }
        }
    }
}