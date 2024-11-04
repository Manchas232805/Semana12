package Programa;

import java.util.Scanner;

public class ProgramaCompra {
    public static void main(String[] args) {
        // Declarar variables
        double compra1, compra2, compra3, compra4;
        Scanner lectura = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingresar Compra 1: ");
        compra1 = lectura.nextDouble();
        System.out.print("Ingresar Compra 2: ");
        compra2 = lectura.nextDouble();
        System.out.print("Ingresar Compra 3: ");
        compra3 = lectura.nextDouble();
        System.out.print("Ingresar Compra 4: ");
        compra4 = lectura.nextDouble();

        // Crear objeto mediante la instancia de la clase
        RegistroCompra objRegistroCompra = new RegistroCompra(compra1, compra2, compra3, compra4);

        // Salida de datos
        System.out.println("El total de las compras es: " + objRegistroCompra.total());
        System.out.println("El promedio de las compras es: " + objRegistroCompra.promedio());
        System.out.println("La compra mayor es: " + objRegistroCompra.mayor());
        System.out.println("La compra menor es: " + objRegistroCompra.menor());
    }
}
