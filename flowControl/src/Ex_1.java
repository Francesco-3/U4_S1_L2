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
    public static boolean stringaPariDispari(String s) {
        return s.length() % 2 == 0;
    }

    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean str = stringaPariDispari("Ciao");
        System.out.println("La stringa è pari? " + str);

        boolean anno = annoBisestile(1861);
        System.out.println("L'anno è bisestile? " + anno);
    }
}
