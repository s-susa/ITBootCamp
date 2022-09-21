import java.util.Arrays;
import java.util.Scanner;

public class StefanSusa {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(zbirCifara(2289));
        System.out.println(stepenBroja(1, 4));
        System.out.println(Arrays.toString(zbirIndexaNizaMeta(new int[]{1, 2, 3, 4, 5}, 9)));
        System.out.println(stringbinary(286393629));
        System.out.println(brojPonavljanja("cao","cao kako si cao cao  otisao sam cao"));
        System.out.println(Arrays.toString(pomeriNule(new int[]{2, 3, 0, 4, 0, 0, 6})));
        System.out.println(Arrays.toString(izbaciDuplikate(new int[]{1,1,1,3,3,3,3,4,4,3,5})));
    }

    /**
     * 0. Implementirati metode za unos elemenata niza varijabilne dužine. Elementi treba da budu tipa int, String i char.
     */

    public static int[] nizInt(int x) {
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        int[] niz2 = new int[x];
        for (int i = 0; i < x; i++) {
            niz2[i] = scanner.nextInt();
        }
        return niz2;
    }

    public static String[] nizString(int x) {
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        String[] niz3 = new String[x];
        for (int i = 0; i < x; i++) {
            niz3[i] = scanner.nextLine();
        }
        return niz3;
    }

    public static char[] nizChar(int x) {
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        char[] niz3 = new char[x];
        for (int i = 0; i < x; i++) {
            niz3[i] = scanner.next().charAt(0);
        }
        return niz3;
    }


    /**
     * 1. Implementirati metodu int zbirCifara(int n) koja sabira cifre sve dok rezultat ne bude samo jedna cifra.
     * Npr. 1234 -> 1, 43 -> 7, 55 -> 1, 556 -> 7
     **/
    public static int zbirCifara(int x) {
        int zbir = 0;
        while (x > 0 || zbir > 9) {
            if (x == 0 && zbir > 9) {
                x = zbir;
                zbir = 0;
            }
            zbir += x % 10;
            x = x / 10;

        }

        return zbir;
    }

    /**
     * 2. Implementirati metodu boolean stepenBroja(int n, int m) koja vraća true ukoliko je n stepen broja m.
     * Npr: (9, 3) -> true, (125, 5) -> true, (13, 4) -> false
     **/
    public static boolean stepenBroja(int x, int y) {
        boolean vrednost = true;
        int stepen = 1;
        for (int i = 0; stepen < x; i++) {
            stepen *= y;

        }
        if (stepen != x) {
            vrednost = false;
        }
        return vrednost;
    }

    /**
     * 3. Implementirati metodu int[] zbirIndexaNizaMeta(int[] niz, int meta) koja vraća indekse dva elementa koji kada se saberu daju rezultat koji je jednak meti.
     * Npr. ({2, 3, 10, -2}, 5) -> {0, 1}
     **/
    public static int[] zbirIndexaNizaMeta(int[] niz, int meta) {
        int[] niz2 = new int[niz.length];
        int k = 0;
        int zbir;
        for (int i = 0; i < niz.length; i++) {
            for (int j = i; j < niz.length; j++) {
                zbir = 0;
                zbir = niz[j] + niz[i];
                if (meta == zbir) {
                    niz2[k] = i;
                    k++;
                    niz2[k] = j;
                    k++;
                }
            }

        }
        return Arrays.copyOf(niz2, k);
    }
    /**
     * 4. Implementirati metodu String toBinary(int n) koja vraća broj n u binarnom formatu. Uzeti
     * apsolutnu vredost n.
     * Npr. 10 -> 1010, 100 -> 1100100
     */

    public static String stringbinary(int x){
        Scanner scanner = new Scanner(System.in);
        x = Math.abs(x);


    return Integer.toBinaryString(x);
    }

    /**
     * 5. Implementirati metodu int brojPonavljanja(String s, String recenica) koja vraća broj
     * ponavljanja stringa "s" u rečenici. Hint: istražiti s.split("") metodu.
     * Npr. ("cao", "cao kako si cao") -> 2
     */

    public static int brojPonavljanja (String s,String recenica){
        String[] delovi = recenica.split(" ");
        int brojac = 0;
        for(int i = 0; i<delovi.length; i++){
            if(delovi[i].equals(s)){
                brojac++;
            }
        }

        return brojac;
    }
    /**
     * 6. Implementirati metodu int[] pomeriNule(int[] niz) koja vraća niz u kome su sve nule pomerene
     * na kraj niza.
     * Npr. {1, 0, 0, 2, 3} -> {1, 2, 3, 0, 0}
     */
    public static int[] pomeriNule(int[] niz){
        int niz2[] = new int[niz.length];
        for (int i = 0,k=niz.length-1,j=0; i< niz.length; i++){
            if(niz[i]==0){
                niz2[k] = 0;
                k--;
            }else {
                niz2[j] = niz[i];
                j++;
            }
        }
        return niz2;
    }
    /**
     * 7. Implementirati metodu int[] izbaciDuplikate(int[] niz) koja vraća niz bez duplikata.
     * Npr. {1, 2, 3, 3} -> {1, 2, 3}, {3, 4, 3, 4, 3, 4, 5} -> {3, 4, 5}
     */
    public static int[] izbaciDuplikate(int[] niz){
        Arrays.sort(niz);
        int duzina = niz.length;
        for (int i = 0; i < duzina; i++) {
            for (int j = i + 1; j < duzina; j++) {
                if (niz[i] == niz[j]) {
                int broj = j;
                for (int k = j+1; k < duzina; k++, broj++) {
                    niz[broj] = niz[k];
                }
                    niz[j] = niz[duzina-1];
                    duzina--;
                    j--;
                }
            }
        }
        int[] bezDuplikata = new int[duzina];
    for(int i = 0; i < duzina; i++){
        bezDuplikata[i] = niz[i];
    }
        Arrays.sort(bezDuplikata);
        return bezDuplikata;

    }
}