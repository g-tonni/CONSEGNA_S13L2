package es2;

import java.util.Scanner;

public class Es2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero da 0 a 3: ");
        int num = Integer.parseInt(scanner.nextLine());

        switch (num){
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Due");
                break;
            case 3:
                System.out.println("Tre");
                break;
            default:
                System.out.println("Numero non valido");
        }
    }
}
