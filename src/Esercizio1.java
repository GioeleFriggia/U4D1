public class Esercizio1 {
    public static void main(String[] args) {
        // Eseguiamo i tre metodi e stampiamo i risultati
        int product = multiply(4, 5);
        System.out.println("Prodotto: " + product);

        String concatenatedString = concatenate("Hello", 123);
        System.out.println("Stringa concatenata: " + concatenatedString);

        String[] initialArray = {"uno", "due", "tre", "quattro", "cinque"};
        String[] newArray = insertInArray(initialArray, "elemento extra");
        System.out.println("Nuovo array:");
        for (String element : newArray) {
            System.out.println(element);
        }
    }

    // Metodo per moltiplicare due interi e ritornare il prodotto
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Metodo per concatenare una stringa e un intero
    public static String concatenate(String str, int num) {
        return str + num;
    }

    // Metodo per inserire una stringa in un array di stringhe
    public static String[] insertInArray(String[] array, String newString) {
        // Creiamo un nuovo array con dimensione aumentata di uno
        String[] newArray = new String[array.length + 1];
        // Copiamo gli elementi originali fino alla terza posizione inclusa
        System.arraycopy(array, 0, newArray, 0, 3);
        // Inseriamo la nuova stringa nella quarta posizione
        newArray[3] = newString;
        // Copiamo gli elementi originali dalla quarta posizione in poi, aggiustando gli indici
        System.arraycopy(array, 3, newArray, 4, array.length - 3);
        // Restituiamo il nuovo array con la stringa inserita
        return newArray;
    }
}
