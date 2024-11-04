package Programa;

public class RegistroCompra {
    // Atributos de la clase
    private double compra1;
    private double compra2;
    private double compra3;
    private double compra4;

    // Metodo
    public RegistroCompra(double compra1, double compra2, double compra3, double compra4) {
        this.compra1 = compra1;
        this.compra2 = compra2;
        this.compra3 = compra3;
        this.compra4 = compra4;
    }

    // Métodos de la clase
    public double total() {
        return compra1 + compra2 + compra3 + compra4;
    }

    public double promedio() {
        return total() / 4;
    }

    public double mayor() {
        double xMayor = compra1;
        if (compra2 > xMayor) xMayor = compra2;
        if (compra3 > xMayor) xMayor = compra3;
        if (compra4 > xMayor) xMayor = compra4;
        return xMayor;
    }

    public double menor() {
        double xMenor = compra1;
        if (compra2 < xMenor) xMenor = compra2;
        if (compra3 < xMenor) xMenor = compra3;
        if (compra4 < xMenor) xMenor = compra4;
        return xMenor;
    }
}