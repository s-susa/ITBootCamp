package Domaci1;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Unesite godinu u kojoj ste poceli da radite: ");
        int godina = scanner.nextInt();
        int iskustvo = 2022 - godina;
        if (iskustvo <= 4 && iskustvo >= 0){
            System.out.println("Ti si Junior programer");
        }else if (iskustvo <=8 && iskustvo > 4){
            System.out.println("Ti si Senior programer");
        }else if (iskustvo>8){
            System.out.println("Vi ste direktor firme");
        }else {
            System.out.println("Nepravilan unos!");
        }


    }
}
