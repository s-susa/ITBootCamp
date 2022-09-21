package Domaci7;

import java.util.Scanner;

public class DrugiZadatak {
    public static void main(String[] args) {
        unija();
    }
    public static String[] unija () {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Unesite duzinu prvog niza: ");
        int x = scanner.nextInt();
        String[] firstArray = new String[x];
        for (int i = 0; i < x; i++){
            System.out.print("Unesite " + (i+1) + ". element niza: ");
            String input = scanner.next();
            firstArray[i] = input;
        }
        System.out.print("Unesite duzinu drugog niza: ");
        int y = scanner.nextInt();
        String[] secondArray = new String[y];
        for (int i = 0; i < y; i++){
            System.out.print("Unesite " + (i+1) + ". element niza: ");
            String input = scanner.next();
            secondArray[i] =input;
        }
        int sameNameCounter = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (firstArray[i].equalsIgnoreCase(secondArray[j])){
                    sameNameCounter++;
                }
            }
        }
        String[] thirdArray = new String[x + y - sameNameCounter];
        int k = 0;
        for (int i = 0; i < x; i++){
            boolean names = false;
            for (int j = 0; j < y; j++) {
                if (firstArray[i].equalsIgnoreCase(secondArray[j])) {
                    names = true;
                }
            }
            if (names) {
                continue;
            }
            thirdArray[k]=firstArray[i];
            k++;
        }
        for (int i = k, l = 0; i < thirdArray.length; i++, l++) {
            thirdArray[i] = secondArray[l];
        }
        for (int i = 0; i < thirdArray.length; i++) {
            System.out.print(thirdArray[i]);
            if (i!=(thirdArray.length)-1) {
                System.out.print(", ");
            }
        }
        return thirdArray;
    }
}
