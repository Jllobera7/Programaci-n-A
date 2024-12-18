package Actividad3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void saberOrden() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = teclado.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int num3 = teclado.nextInt();
        System.out.println("Ingrese el quarto numero: ");
        int num4 = teclado.nextInt();
        System.out.println("Ingrese el quinto numero: ");
        int num5 = teclado.nextInt();
    }

    public static void main(String[] args) {
        saberOrden();
    }
}
