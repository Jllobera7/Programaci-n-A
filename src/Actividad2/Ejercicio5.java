package Actividad2;
import java.util.Scanner;

public class Ejercicio5 {
    public static void esFechaValida(int dia, int mes, int año) {
        boolean esFechaCorrecta = true;

        // Verificar si el mes está dentro del rango válido
        if (mes >= 1 && mes <= 12) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                // Meses con 31 días
                if (dia >= 1 && dia <= 31) {
                    esFechaCorrecta = true;
                } else {
                    esFechaCorrecta = false;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                // Meses con 30 días
                if (dia >= 1 && dia <= 30) {
                    esFechaCorrecta = true;
                } else {
                    esFechaCorrecta = false;
                }
            } else if (mes == 2) {
                // Febrero: verificar si el año es bisiesto
                if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                    // Año bisiesto, febrero tiene 29 días
                    if (dia >= 1 && dia <= 29) {
                        esFechaCorrecta = true;
                    } else {
                        esFechaCorrecta = false;
                    }
                } else {
                    // Año no bisiesto, febrero tiene 28 días
                    if (dia >= 1 && dia <= 28) {
                        esFechaCorrecta = true;
                    } else {
                        esFechaCorrecta = false;
                    }
                }
            }
        } else {
            esFechaCorrecta = false; // Mes inválido
        }

        // Mostrar el resultado
        if (esFechaCorrecta) {
            System.out.println("La fecha es correcta.");
        } else {
            System.out.println("La fecha es incorrecta.");
        }
    }

    public static void main(String[] args) {
        esFechaValida(29, 2, 2024); // Año bisiesto, fecha válida
        esFechaValida(31, 4, 2023); // Abril tiene 30 días, fecha inválida
        esFechaValida(15, 13, 2023); // Mes inválido
        esFechaValida(1, 1, 2023); // Fecha válida
    }
}