package modelo;

public class RotacionActivos
        extends IndicadorFinanciero {

    private double ventas;
    private double activos;

    public RotacionActivos(
            double ventas,
            double activos) {

        super("Rotación Activos");

        this.ventas = ventas;
        this.activos = activos;
    }

    @Override
    public double calcular() {

        return activos != 0
                ? ventas / activos
                : 0;
    }
}