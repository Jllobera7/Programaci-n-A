package Actividad1;
import java.util.Scanner;
// Función para calcular el mayor de don números
public class Ejercicio4 {
public static void cualEsMayor(){
    Scanner teclado = new Scanner(System.in);
    //pedimos el primer numero
    System.out.println("introduzca un numero:");
    int a = teclado.nextInt();
    //pedimos el segundo numero
    System.out.println("introduzca el segundo numero:");
    int b = teclado.nextInt();
        if(a>b){
            System.out.println("el numero "+ a + " es mayor.");
        }else if(a<b){
            System.out.println("el numero "+ b + " es mayor.");
        }else {
            System.out.println("los números son iguales.");
        }
    }
    public static void main (String[] args){
    cualEsMayor();

    }
}
