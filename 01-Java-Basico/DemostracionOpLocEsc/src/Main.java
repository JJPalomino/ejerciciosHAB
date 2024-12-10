import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado =new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = teclado.nextLine();     // .next() lee la primera palabra    .nextLine() lee toda la cadena de datos
        System.out.println("Su nombre es: " + nombre);
    }
}