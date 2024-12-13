package Actividad2;
import java.util.Scanner;

public class Ejercicio3 {
    public static void numero3cifras(){
     Scanner teclado= new Scanner(System.in);

     System.out.println("introduza un numero de hasta 3 cifras : ");
     int numero = teclado.nextInt();

     if(numero>999){
         System.out.println("ERROR: El número "+numero+ " tiene más de tres cifras");
     }
     else{
         System.out.println("Enhorabuena, és usted un lumi");
     }
    }
    public static void main(String[] args) {
    numero3cifras();
    }
}
