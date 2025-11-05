import java.util.Scanner;

public class ObrtanjeRijeci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite tekst:");
        String input = scanner.nextLine();

        String[] inputRijeci = input.split("\\s+");

        for (int i = inputRijeci.length-1; i >= 0; i--) {
            System.out.print(inputRijeci[i] + " ");
        }
    }
}
