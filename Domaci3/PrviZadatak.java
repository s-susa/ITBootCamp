package Domaci3;

import java.util.Scanner;

public class PrviZadatak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite zeljenu rec:");
        String rec = scan.nextLine();
        int count = 0;

        for (int i= 0; i < rec.length();i++){
            if(rec.charAt(i) == 'a' || rec.charAt(i) == 'e' || rec.charAt(i) == 'i'|| rec.charAt(i) == 'o' || rec.charAt(i) == 'u'){
                System.out.println(rec.charAt(i));
                count++;
            }

        }
        System.out.println("Broj samoglasnika je: " + count);
    }
}
