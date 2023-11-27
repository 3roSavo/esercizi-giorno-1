import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      System.out.println("ciaone");

      String primaVar = "Helloooooo";
      String secondaVar = "world";
      String terzaVar = primaVar + secondaVar;
      String quartaVar = terzaVar + " nice to meet you!";

      int numeroCaratteri = quartaVar.length();
      System.out.println(numeroCaratteri);


      // ESERCIZIO 1 ---------------------------------------------------------------------------------

        int moltiplica = mul(6, 3);
        System.out.println("risultato moltiplicazione : " + moltiplica);

        String concatena = conc("Mi chiamo Eros e ho ", 26, " anni");
        System.out.println(concatena);

        String[] inserisciInArray = ins(new String[] {"ciao", "mi chiamo", "eros", "perchè", "così"}, "ciaone");
        System.out.println(Arrays.toString(inserisciInArray));



    }
    public static int mul(int num1, int num2) {
        return num1 * num2;
    }
    public  static String conc(String frase1, int num, String frase2) {
        return frase1 + num + frase2;
    }

    public  static String[] ins(String[] stringArray, String str) {
        String[] array = new String[6];
            for (int i = 0; i <= stringArray.length; i++) {
                if (i < 2) {
                    array[i] = stringArray[i];
                } else if (i == 2) {
                    array[i] = str;
                } else {
                    array[i] = stringArray[i -1];
                }
            }
        return array;
    }

}