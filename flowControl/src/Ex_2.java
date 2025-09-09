/*
  #switch
  Scrivere un programma che chiede un intero in ingresso e lo stampa in lettere se il valore è compreso tra 0 e tre,
  altrimenti stampa un messaggio d'errore usando il costrutto switch.
*/

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero:");
		int n = scanner.nextInt();

        if (n >= 0 && n <= 3) {
            switch (n) {
                case 0:
                    System.out.println("ZERO");
                    break;
                case 1:
                    System.out.println("UNO");
                    break;
                case 2:
                    System.out.println("DUE");
                    break;
                case 3:
                    System.out.println("TRE");
                    break;
            }
        } else {
            System.out.println("Il numero non è compreso tra 0 e 3!");
        }
    }
}

// per quanto riguarda questo esercizio ero indeciso se usare l'if dentro ogni caso e mettere un valore di default e
// non sono sicuro se dovevo convertire il numero in lettere per poi stamparlo o se va bene che lo abbia stampato direttamente
