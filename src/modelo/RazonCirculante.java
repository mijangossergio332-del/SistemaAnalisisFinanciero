package modelo;

public class RazonCirculante
        extends IndicadorFinanciero {

    private double activo;
    private double pasivo;

    public RazonCirculante(
            double activo,
            double pasivo) {

        super("Razón Circulante");

        this.activo = activo;
        this.pasivo = pasivo;
    }

    @Override
    public double calcular() {

        return pasivo != 0
                ? activo / pasivo
                : 0;
    }
}