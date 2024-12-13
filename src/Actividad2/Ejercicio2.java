package Actividad2;
import java.util.Scanner;
public class Ejercicio2 {
    public static void mediaCalificaciones(float a, float b, float c) {
        float media= (a+b+c)/3;
        System.out.println("La media es: "+media);
    }
    public static void mediaCalificaciones2() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        float nota1 = teclado.nextFloat();

        System.out.println("Ingrese el segundo numero: ");
        float nota2 = teclado.nextFloat();

        System.out.println("Ingrese el tercer numero: ");
        float nota3 = teclado.nextFloat();

        float media= (nota1+nota2+nota3)/3;

        System.out.println("La media es: "+media);
    }
    public static void main(String[] args) {
        mediaCalificaciones2();
    }
}
