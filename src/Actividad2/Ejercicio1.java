package Actividad2;
import java.util.Scanner;
public class Ejercicio1 {
    public static void velocidadMedia(){
        Scanner teclado=new Scanner(System.in);

        System.out.println("Indique cuantos km espacio ha recorrido :");
        int espacio=teclado.nextInt();

        System.out.println("Indique cuantas horas ha tardado :");
        double horas=teclado.nextDouble();

        double velocidadMedia = espacio/horas;

        System.out.println("La velocidad media és de " + velocidadMedia +" km/h.");
    }

    public static void main(String[] args){
        velocidadMedia();
    }
}
