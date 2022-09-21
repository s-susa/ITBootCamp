package Domaci4;

import java.util.Arrays;
import java.util.Scanner;

public class PrviZadatak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] niz = new String[5];

        for (int i = 0; i < niz.length; i++) {
            System.out.print("Unesite ime u niz: ");
            niz[i] = scanner.nextLine();

        }
        System.out.println("Imena koja ste uneli su: " + Arrays.toString(niz));
        System.out.println("Imena koja pocinju na M su: ");
        for (int i = 0; i < niz.length; i++) {
            if (niz[i].charAt(0) == 'm' || niz[i].charAt(0) == 'M') {
                System.out.println(niz[i]);
            }
        }

    }

}
