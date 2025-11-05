import java.util.Scanner;

public class ObrtanjeRijeciOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite željenu rečenicu: ");
        String text = sc.nextLine();

        // String text = "Danas je    novi aa daaan";
        String[] characters = text.split("\\s");
//        String[] characters = text.split("[\\s]");

        for (int i = characters.length - 1; i >= 0; i--) {
            System.out.print(characters[i] + " ");
        }


    }
}
