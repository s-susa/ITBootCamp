package Domaci3;

import java.util.Scanner;

public class TreciZadatak {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int broj;
        int sum = 0;
        for (; true; ) {
            System.out.println("Unesite broj za sabiranje kvadrata (osim broja 4) ili 0 za izlaz:");
            broj = s.nextInt();
            if (broj == 4) {
                System.out.println("Trenutni zbir kvadnata je: " + sum);
                continue;
            } else if (broj == 0) {
                System.out.println("Kraj!");
                break;

            } else {
                sum += (int) Math.pow(broj, 2);
                System.out.println("Trenutni zbir kvadnate je: " + sum);
            }

        }
    }
}

