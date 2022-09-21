package Domaci3;

import java.util.Scanner;

public class DrugiZadatak {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite rec 'ITBootCamp' : ");
        String rec = s.nextLine();
        for (int i = 0; i < rec.length(); i++) {
            if (rec.toLowerCase().charAt(i) == 'c') {
                continue;

            } else {
                System.out.print(rec.charAt(i));
            }
        }
    }
}