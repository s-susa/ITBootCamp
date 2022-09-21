package Domaci1;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite velicinu majice: ");
        String velicina = scanner.nextLine();
        switch (velicina){
            case "24cm":
                System.out.println("S velicina");
                break;
            case "30cm":
                System.out.println(" M Velicina");
                break;
            case "36cm":
                System.out.println("L velicina");
                break;
            case "42" :
                System.out.println("XL velicina");
                break;
            default:
                System.out.println("Nepravilan unos!");
                break;

        }

    }
}
