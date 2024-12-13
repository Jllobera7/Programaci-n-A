package Actividad1;
//Función que calcula y muestra el área de un triángulo

public class Ejercicio1 {
    static void calcularAreaTriangulo(float b, float h) {
        float area = b * h;
        System.out.println("El area del triangulo es: " + area);
    }


    public static void main(String[] args) {

        calcularAreaTriangulo(5,9);
    }
}
