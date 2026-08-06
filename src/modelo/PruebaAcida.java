package modelo;

public class PruebaAcida
        extends IndicadorFinanciero {

    private double activo;
    private double inventario;
    private double pasivo;

    public PruebaAcida(
            double activo,
            double inventario,
            double pasivo) {

        super("Prueba Ácida");

        this.activo = activo;
        this.inventario = inventario;
        this.pasivo = pasivo;
    }

    @Override
    public double calcular() {

        return pasivo != 0
                ? (activo - inventario) / pasivo
                : 0;
    }
}