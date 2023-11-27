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


      // ESERCIZIO 1

        int moltiplica = mul(6, 3);
        System.out.println("risultato moltiplicazione : " + moltiplica);

        String concatena = conc("Mi chiamo Eros e ho ", 26, " anni");
        System.out.println(concatena);

        //String[] inserisciLnArray = new String[6];



    }
    public static int mul(int num1, int num2) {
        return num1 * num2;
    }
    public  static String conc(String frase1, int num, String frase2) {
        return frase1 + num + frase2;
    }
    /*public  static String[] pushIntoArray( String[] {"string1", "string2", "string3", "string4", "string5"}, String string) {
        return
    }*/
}