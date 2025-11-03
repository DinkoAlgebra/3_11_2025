import java.util.Scanner;
//Mihael Petrović
public class BrojanjeZnakovaRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Program prebraja broj znamenki, broj slova i broj ostalih znakova u unesenom tekstu!\n\rUnesite tekst:");
        String input = scanner.nextLine();

        String[] inputZnakovi = input.split("");
        int znamenke = 0;
        int slova = 0;
        int znakovi = 0;
        for (String znak : inputZnakovi) {
            if (znak.matches("[A-Za-z]")){
                slova++;
            } else if (znak.matches("[0-9]")){
                znamenke++;
            } else {
                znakovi++;
            }
        }

        System.out.printf("Uneseni tekst sadrzi:%nSlova: %d%nBrojevi: %d%nOstali znakovi: %d", slova, znamenke, znakovi);


    }
}
