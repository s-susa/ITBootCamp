package Domaci2;

import java.util.Scanner;

public class Domaci2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite prvi broj: ");
        int x = scanner.nextInt();
        System.out.print("Unesite drugi broj: ");
        int y = scanner.nextInt();
        int z = Math.abs(y);
        int sum = 0;
        int t;
        if (x < 0 && y < 0) {
            while (z > 0) {
                sum += x;
                z--;

            }
            t = Math.abs(sum);
            System.out.println("Proizvod je: " + t);
        } else {
            while (z > 0) {
                sum += x;
                z--;

            }
            System.out.println("Proizvod je : " + sum);
        }

    }


}
