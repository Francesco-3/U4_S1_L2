/*
  #for
  Scrivere un programma che chiede all'utente di inserire un numero intero e stampi il conto alla rovescia a partire
  da quel numero fino a zero.
*/

import java.util.Scanner;

public class Ex_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il numero di partenza:");
        int startN = scanner.nextInt();

        for (int i = startN; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}
