package es1;

public class Es1 {
    static void main() {
        String frase = "Ciao sono Giada";
        boolean pariODispari = stringaPariDispari(frase)
    }
}

public static boolean stringaPariDispari(String stringa) {
    if (stringa.length() % 2 == 0) {
        return true;
    } else {
        return false;
    }
}