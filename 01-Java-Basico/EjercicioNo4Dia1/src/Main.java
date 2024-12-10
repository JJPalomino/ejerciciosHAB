import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("************Calculadora básica de dos números**********");
        System.out.println("Ingrese el primer número");

        float numero1 = teclado.nextFloat();
        System.out.println("Ingrese el segundo número");
        float numero2 = teclado.nextFloat();

        float suma = numero1 + numero2;
        float resta = numero1 - numero2;
        float multiplicacion = numero1 * numero2;
        float division = numero1 / numero2;

        System.out.println("Las operaciones son: ");
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La división es: " + division);
    }
}