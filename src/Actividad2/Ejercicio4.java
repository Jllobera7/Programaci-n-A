package Actividad2;
import java.util.Scanner;

public class Ejercicio4 {
    public static void impuestosIva(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca el nombre del producto: ");
        String nombreProducto = teclado.nextLine();

        System.out.println("Introduzca el precio del producto: ");
        double precioProducto = teclado.nextDouble();

        double precioIva= precioProducto + (precioProducto* 0.21);

        System.out.println("Tu "+nombreProducto+ " vale "+precioProducto+" euros y con el 21 % de IVA se queda en "+precioIva+" euros en total ");
    }
    public static void main(String[] args) {
        impuestosIva();
    }
}
