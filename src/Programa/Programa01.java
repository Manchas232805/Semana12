package Programa;
import java.util.Scanner;
public class Programa01{
    public static void main(String[] args){
      //declarar variables
        double vt1,vt2,vt3;
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar Venta 1: ");
        vt1 = lectura.nextDouble();
        System.out.print("Ingresar Venta 2: ");
        vt2 = lectura.nextDouble();
        System.out.print("Ingresar Venta 3: ");
        vt3 = lectura.nextDouble();
        //Crear objeto mediante la instancia de la clase
        RegistroVenta objregventa = new RegistroVenta(vt1, vt2, vt3);
        //Saldia de datos
        System.out.println("El total de las ventas es:" + objregventa.total());
        System.out.println("El promedio de las ventas es:" + objregventa.promedio());
        System.out.println("La venta mayor es:" + objregventa.mayor());
        System.out.println("La venta menor es:" + objregventa.menor());
    }
}