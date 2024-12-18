package Actividad3;
import java.util.Scanner;
public class Ejercicio1 {
    public static void cualEsMayor() {
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
     int numeroMayor= num1;
    if(num2>num1){
        numeroMayor = num2;
    }
    if(num3>numeroMayor){
        numeroMayor = num3;
    }
    if(num4>numeroMayor){
        numeroMayor = num4;
    }
    if(num5>numeroMayor){
        numeroMayor = num5;
    }

    System.out.println("El numero mayor es: "+numeroMayor);
    }
    public static void main(String[] args){
        cualEsMayor();
    }
}
