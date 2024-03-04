public class Esercizio1 {
    public static void main(String[] args) {
        int product = multiply(4, 5);
        System.out.println("Product: " + product);

        String concatenatedString = concatenate("Hello", 123);
        System.out.println("Concatenated string: " + concatenatedString);

        String[] initialArray = {"one", "two", "three", "four", "five"};
        String[] newArray = insertInArray(initialArray, "extra element");
        System.out.println("New array:");
        for (String element : newArray) {
            System.out.println(element);
        }
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static String concatenate(String str, int num) {
        return str + num;
    }

    public static String[] insertInArray(String[] array, String newString) {
        String[] newArray = new String[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, 3);
        newArray[3] = newString;
        System.arraycopy(array, 3, newArray, 4, array.length - 3);
        return newArray;
    }
}
