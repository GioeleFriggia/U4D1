public class Esercizio3 {
    public static void main(String[] args) {
        // Definiamo i valori dei lati del rettangolo e calcoliamo il perimetro
        double lato1 = 4.5;
        double lato2 = 3.5;
        double perimetroRettangolo = perimetroRettangolo(lato1, lato2);
        System.out.println("Perimetro del rettangolo: " + perimetroRettangolo);

        // Definiamo un numero e verifichiamo se è pari o dispari
        int numero = 7;
        int risultatoPariDispari = pariDispari(numero);
        System.out.println("Pari o dispari? Risultato: " + risultatoPariDispari);

        // Definiamo i valori dei lati del triangolo e calcoliamo il perimetro
        double latoA = 3.0;
        double latoB = 4.0;
        double latoC = 5.0;
        double perimetroTriangolo = perimetroTriangolo(latoA, latoB, latoC);
        System.out.println("Perimetro del triangolo: " + perimetroTriangolo);
    }

    // Metodo per calcolare il perimetro di un rettangolo
    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

    // Metodo per determinare se un numero è pari o dispari
    // Restituisce 0 se il numero è pari, 1 se è dispari
    public static int pariDispari(int numero) {
        return numero % 2 == 0 ? 0 : 1;
    }

    // Metodo per calcolare il perimetro di un triangolo
    public static double perimetroTriangolo(double latoA, double latoB, double latoC) {
        return latoA + latoB + latoC;
    }
}
