package Domaci5;

import java.util.Arrays;
import java.util.Scanner;

public class Domaci5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite duzinu niza: ");
        int[] niz = new int[scanner.nextInt()];
        int[] niz2 = new int[niz.length];
        for (int i = 0; i < niz.length; i++) {
            System.out.print("Unesite broj: ");
            niz[i] = scanner.nextInt();
        }
        System.out.println("Uneti niz glasi: " + Arrays.toString(niz));

        for (int i = niz.length - 1, j = 0; i >= 0; i--, j++) {
            niz2[j] = niz[i];

        }
        System.out.println("Obrnut redosled niza glasi: " + Arrays.toString(niz2));
        int[] niz3 = new int[niz2.length];
        int z = 0;
        for (int i = 0; i < niz2.length; i++) {
            if (niz2[i] % 2 != 0) {
                niz3[i] = niz2[i];
            } else {
                z++;
            }
        }

        int[] niz4 = new int[niz3.length - z];
        for (int i = 0, j = 0; i < niz3.length; i++) {
            if (niz3[i] != 0) {
                niz4[j] = niz3[i];
                j++;
            }

        }

        System.out.println("Niz bez parnih brojeva glasi:  " + Arrays.toString(niz4));
        System.out.println("Unesite index prvog elemtenta koji zelite da obriste: ");
        int index1 = scanner.nextInt();
        System.out.println("Unesite index drugog elemtenta koji zelite da obriste: ");
        int index2 = scanner.nextInt();
        int[] niz5 = new int[niz4.length - 2];
        for(int i = 0, j = 0; i < niz4.length; i++)
            if(index1 != i && index2 != i){
                niz5[j] = niz4[i];
                j++;
            }
        System.out.println("Niz nakon obrisanih elemenata: " + Arrays.toString(niz5));


    }


}



