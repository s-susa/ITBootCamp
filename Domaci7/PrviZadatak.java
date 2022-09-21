package Domaci7;

import java.util.Arrays;
import java.util.Scanner;

public class PrviZadatak {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(imena(4)));
    }

    public static String[] imena (int i){
        Scanner s = new Scanner(System.in);
        String [] imena = new String[i];
        for (int j = 0; j < i; j++) {
            System.out.print("Unesite " + (j+1) + ". ime:");
            String ime = s.nextLine();
            imena[j] = ime;
        }
        System.out.println("Uneta imena su: " + Arrays.toString(imena));
        ;
        return imena;
    }
}


