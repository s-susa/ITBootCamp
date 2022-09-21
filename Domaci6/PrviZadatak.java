package Domaci6;

import java.util.Scanner;

public class PrviZadatak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int broj = scanner.nextInt();
        System.out.println("Faktorijel unetog broja je: " + faktorijel(broj));
    }

    public static int faktorijel(int x){
        int suma =0;
        for( int i =x; i>=0;i--){
            suma = suma + i;
        }
        return suma;

    }


}
