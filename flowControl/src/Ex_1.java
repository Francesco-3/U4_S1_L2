/*
  #if-else if
  Scrivere i seguenti metodi:
   - stringaPariDispari, che accetta una stringa e ritorna true se il numero di caratteri è pari e false se è dispari.
   - annoBisestile, che accetta un anno espresso come intero e ritorna true se esso è bisestile, false altrimenti.
     [
       Un anno per essere bisestile deve rispettare le seguenti regole:
       - essere divisibile per 4
       - qualora sia divisibile per 100 deve essere anche divisibile per 400
     ]

     Scrivere un main che utilizzi i metodi.
*/

public class Ex_1 {
    public static String stringaPariDispari(String s) {
        return s;
    }

    public static void main(String[] args) {
        String str = stringaPariDispari("Ciao");
        int number = Integer.parseInt(str);

        if (number % 2 == 0) {
            System.out.println("True and length is: " + number);
        } else {
            System.out.println("False and length is: " + number);
        }
    }
}
