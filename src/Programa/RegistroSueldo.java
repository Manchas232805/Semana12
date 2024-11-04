package Programa;

public class RegistroSueldo {
    // Atributos de la clase
    private double sueldo1;
    private double sueldo2;
    private double sueldo3;
    private double sueldo4;

    // Método constructor
    public RegistroSueldo(double sueldo1, double sueldo2, double sueldo3, double sueldo4) {
        this.sueldo1 = sueldo1;
        this.sueldo2 = sueldo2;
        this.sueldo3 = sueldo3;
        this.sueldo4 = sueldo4;
    }

    // Métodos de la clase
    public double total() {
        return this.sueldo1 + this.sueldo2 + this.sueldo3 + this.sueldo4;
    }

    public double promedio() {
        return this.total() / 4;
    }

    public double mayor() {
        double xMayor = this.sueldo1;
        if (this.sueldo2 > xMayor) xMayor = this.sueldo2;
        if (this.sueldo3 > xMayor) xMayor = this.sueldo3;
        if (this.sueldo4 > xMayor) xMayor = this.sueldo4;
        return xMayor;
    }

    public double menor() {
        double xMenor = this.sueldo1;
        if (this.sueldo2 < xMenor) xMenor = this.sueldo2;
        if (this.sueldo3 < xMenor) xMenor = this.sueldo3;
        if (this.sueldo4 < xMenor) xMenor = this.sueldo4;
        return xMenor;
    }
}