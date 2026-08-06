package modelo;

public class ROA
        extends IndicadorFinanciero {

    private double utilidad;
    private double activos;

    public ROA(
            double utilidad,
            double activos) {

        super("ROA");

        this.utilidad = utilidad;
        this.activos = activos;
    }

    @Override
    public double calcular() {

        return activos != 0
                ? utilidad / activos
                : 0;
    }
}