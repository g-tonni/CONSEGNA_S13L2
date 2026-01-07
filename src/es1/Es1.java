package es1;

public class Es1 {
static void main() {
    String frase = "Ciao sono Giada";
    boolean pariODispari = stringaPariDispari(frase);
    System.out.println(pariODispari);

    int anno = 2000;
    boolean annoBis = annoBisestile(anno);
    System.out.println(annoBis);
}

public static boolean stringaPariDispari(String stringa) {
    if (stringa.length() % 2 == 0) {
        return true;
    } else {
        return false;
    }
}

public static boolean annoBisestile(int anno){
    if(anno % 4 == 0){
        if(anno % 100 == 0) {
            if(anno % 400 == 0){
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    } else {
        return false;
    }
}

}

