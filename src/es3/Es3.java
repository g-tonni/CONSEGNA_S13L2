package es3;

import java.util.Scanner;

public class Es3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);


        while(true) {
            System.out.println("Scrivi qualcosa: ");
            String testo = scanner.nextLine();
            if (testo.equals(":q")) break;
            String testoSep = "";
            for (int i = 0; i < testo.length(); i++) {
                testoSep = testoSep + testo.charAt(i) + ",";
            }
            System.out.println(testoSep);
        }
    }
}
