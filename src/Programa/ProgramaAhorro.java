package Programa;

import java.util.Scanner;

public class ProgramaAhorro {
    public static void main(String[] args) {
        // Declarar variables
        double ingresoMensual, otrosIngresos, gastosMensuales;
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese el ingreso mensual: ");
        ingresoMensual = lectura.nextDouble();
        System.out.print("Ingrese otros ingresos: ");
        otrosIngresos = lectura.nextDouble();
        System.out.print("Ingrese los gastos mensuales: ");
        gastosMensuales = lectura.nextDouble();

        // Crear objeto mediante la instancia de la clase
        RegistroAhorro objRegistroAhorro = new RegistroAhorro(ingresoMensual, otrosIngresos, gastosMensuales);

        // Salida de datos
        System.out.println("Ahorro mensual proyectado: " + objRegistroAhorro.ahorroMensual());
        System.out.println("Ahorro semestral proyectado: " + objRegistroAhorro.ahorroSemestral());
        System.out.println("Ahorro anual proyectado: " + objRegistroAhorro.ahorroAnual());
    }
}
