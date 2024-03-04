public class Esercizio3 {


    public static void main(String[] args) {
        double side1 = 4.5;
        double side2 = 3.5;
        System.out.println("Perimeter of the rectangle: " + perimeterRectangle(side1, side2));

        int number = 7;
        System.out.println("Is it even or odd? Result: " + evenOrOdd(number));

        double sideA = 3.0;
        double sideB = 4.0;
        double sideC = 5.0;
        System.out.println("Perimeter of the triangle: " + perimeterTriangle(sideA, sideB, sideC));
    }

    public static double perimeterRectangle(double side1, double side2) {
        return 2 * (side1 + side2);
    }

    public static int evenOrOdd(int number) {
        return number % 2 == 0 ? 0 : 1;
    }

    public static double perimeterTriangle(double sideA, double sideB, double sideC) {
        return sideA + sideB + sideC;
    }
}
