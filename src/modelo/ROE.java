package modelo;

public class ROE
        extends IndicadorFinanciero {

    private double utilidad;
    private double capital;

    public ROE(
            double utilidad,
            double capital) {

        super("ROE");

        this.utilidad = utilidad;
        this.capital = capital;
    }

    @Override
    public double calcular() {

        return capital != 0
                ? utilidad / capital
                : 0;
    }
}