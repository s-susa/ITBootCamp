package Domaci6;

public class DrugiZadatak {
    public static void main(String[] args) {
        System.out.println(reci("majaa","joka"));

    }
    public static String reci(String rec1, String rec2) {
        String samoglasnici = "Samoglasnici su: ";
        if (rec1.length() == rec2.length()) {
            System.out.println("Ova dva string su jednaka!");
            for (int i = 0; i < rec1.length() ; i++) {
                if (rec1.charAt(i) == 'a') {
                    samoglasnici = samoglasnici + "a, ";

                } if (rec2.charAt(i) == 'a') {
                    samoglasnici = samoglasnici + "a, ";

                }  if (rec2.charAt(i) == 'e') {
                    samoglasnici = samoglasnici + "e, ";

                }  if (rec1.charAt(i) == 'e') {
                    samoglasnici = samoglasnici + "e, ";

                }  if (rec2.charAt(i) == 'i') {
                    samoglasnici = samoglasnici + "i, ";
                }  if (rec1.charAt(i) == 'i') {
                    samoglasnici = samoglasnici + "i, ";
                }  if (rec2.charAt(i) == 'o') {
                    samoglasnici = samoglasnici + "o, ";
                }  if (rec1.charAt(i) == 'o') {
                    samoglasnici = samoglasnici + "o, ";
                }  if (rec2.charAt(i) == 'u') {
                    samoglasnici = samoglasnici + "u, ";
                }  if (rec1.charAt(i) == 'u') {
                    samoglasnici = samoglasnici + "u, ";
                }

            }
        }else {
            System.out.println("Ova dva stringa nisu jednaka!");
        }
        return samoglasnici;
    }
}