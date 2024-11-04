package Programa;

import java.util.Scanner;

public class Programa02 {
    public static void main(String[] args) {
        // Declarar variables
        double sueldo1, sueldo2, sueldo3, sueldo4;
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingresar Sueldo 1: ");
        sueldo1 = lectura.nextDouble();
        System.out.print("Ingresar Sueldo 2: ");
        sueldo2 = lectura.nextDouble();
        System.out.print("Ingresar Sueldo 3: ");
        sueldo3 = lectura.nextDouble();
        System.out.print("Ingresar Sueldo 4: ");
        sueldo4 = lectura.nextDouble();

        // Crear objeto mediante la instancia de la clase
        RegistroSueldo objRegistroSueldo = new RegistroSueldo(sueldo1, sueldo2, sueldo3, sueldo4);

        // Salida de datos
        System.out.println("El total de los sueldos es: " + objRegistroSueldo.total());
        System.out.println("El promedio de los sueldos es: " + objRegistroSueldo.promedio());
        System.out.println("El sueldo mayor es: " + objRegistroSueldo.mayor());
        System.out.println("El sueldo menor es: " + objRegistroSueldo.menor());
    }
}