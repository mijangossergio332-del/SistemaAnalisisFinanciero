package modelo;

public class MargenNeto
        extends IndicadorFinanciero {

    private double utilidad;
    private double ventas;

    public MargenNeto(
            double utilidad,
            double ventas) {

        super("Margen Neto");

        this.utilidad = utilidad;
        this.ventas = ventas;
    }

    @Override
    public double calcular() {

        return ventas != 0
                ? utilidad / ventas
                : 0;
    }
}