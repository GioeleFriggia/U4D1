import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creiamo un oggetto Scanner per leggere l'input dell'utente

        // Richiediamo all'utente di inserire tre stringhe da tastiera
        System.out.println("Inserisci la prima stringa:");
        String stringa1 = scanner.nextLine(); // Leggiamo la prima stringa inserita dall'utente

        System.out.println("Inserisci la seconda stringa:");
        String stringa2 = scanner.nextLine(); // Leggiamo la seconda stringa inserita dall'utente

        System.out.println("Inserisci la terza stringa:");
        String stringa3 = scanner.nextLine(); // Leggiamo la terza stringa inserita dall'utente

        // Stampiamo la concatenazione delle stringhe nell'ordine di inserimento
        System.out.println("Concatenazione in ordine di inserimento: " + stringa1 + stringa2 + stringa3);

        // Stampiamo la concatenazione delle stringhe nell'ordine inverso
        System.out.println("Concatenazione in ordine inverso: " + stringa3 + stringa2 + stringa1);

        scanner.close(); // Chiudiamo lo scanner per liberare le risorse
    }
}
