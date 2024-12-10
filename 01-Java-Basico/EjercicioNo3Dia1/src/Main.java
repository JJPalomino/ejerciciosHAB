import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculo de área de un triangulo");
        System.out.println("Ingrese la base del triangulo: ");
        int base = teclado.nextInt();
        System.out.println("Ingrese la altura del triangul: ");
        int altura = teclado.nextInt();
        int area = (base*altura)/2;

        System.out.println("El área del triangulo es: "+ area);
    }
}