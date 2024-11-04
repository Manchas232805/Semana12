package Programa;

public class RegistroAhorro {
    // Atributos de la clase
    private double ingresoMensual;
    private double otrosIngresos;
    private double gastosMensuales;

    // Mtodo constructor
    public RegistroAhorro(double ingresoMensual, double otrosIngresos, double gastosMensuales) {
        this.ingresoMensual = ingresoMensual;
        this.otrosIngresos = otrosIngresos;
        this.gastosMensuales = gastosMensuales;
    }

    // Métodos de la clase
    public double ahorroMensual() {
        return (ingresoMensual + otrosIngresos) - gastosMensuales;
    }

    public double ahorroSemestral() {
        return ahorroMensual() * 6;
    }

    public double ahorroAnual() {
        return ahorroMensual() * 12;
    }
}
