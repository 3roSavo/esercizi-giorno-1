import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome seguito dal pulsante INVIO");
        String name = scan.nextLine();

        System.out.println("Ora inserisci il tuo cognome seguito dal pulsante invio");
        String surname = scan.nextLine();

        System.out.println("Ora la tua città di nascita seguita dal pulsante invio");
        String city = scan.nextLine();

        String info ="Ecco le tue generalità : " + name + " " + surname + " " + city;
        System.out.println(info);

        scan.close();
         */

        Scanner scan = new Scanner(System.in);
        String[] inputStrings = new String[3];
        System.out.println("Inserisci il tuo nome seguito dal pulsante invio");
        inputStrings[0] = scan.nextLine();
        System.out.println("Inserisci il tuo cognome seguito dal pulsante invio");
        inputStrings[1] = scan.nextLine();
        System.out.println("Inserisci la tua città di nascita seguita dal pulsante invio");
        inputStrings[2] = scan.nextLine();

        System.out.println("La concatenazione è la seguente : " + Arrays.toString(inputStrings));
        System.out.println("La concatenazione è la seguente : " + inputStrings[0] + " " + inputStrings[1] + " " + inputStrings[2]);

        System.out.println("Ecco la concatenazione inversa : " + inputStrings[2] + " " + inputStrings[1] + " " + inputStrings[0]);

        scan.close();
    }
}
