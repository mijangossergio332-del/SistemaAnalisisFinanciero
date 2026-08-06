package modelo;

public class Endeudamiento
        extends IndicadorFinanciero {

    private double pasivos;
    private double activos;

    public Endeudamiento(
            double pasivos,
            double activos) {

        super("Endeudamiento");

        this.pasivos = pasivos;
        this.activos = activos;
    }

    @Override
    public double calcular() {

        return activos != 0
                ? pasivos / activos
                : 0;
    }
}