package modelo;

public class EstadoResultados {

    private double ventas;
    private double otrosIngresos;

    private double costoVentas;
    private double gastosOperacion;
    private double gastosFinancieros;
    private double otrosGastos;

    private double impuestos;

    public EstadoResultados(

            double ventas,
            double otrosIngresos,

            double costoVentas,
            double gastosOperacion,
            double gastosFinancieros,
            double otrosGastos,

            double impuestos
    ) {

        this.ventas = ventas;

        this.otrosIngresos =
                otrosIngresos;

        this.costoVentas =
                costoVentas;

        this.gastosOperacion =
                gastosOperacion;

        this.gastosFinancieros =
                gastosFinancieros;

        this.otrosGastos =
                otrosGastos;

        this.impuestos = impuestos;
    }

    public double getVentas() {
        return ventas;
    }

    public double getOtrosIngresos() {
        return otrosIngresos;
    }

    public double getCostoVentas() {
        return costoVentas;
    }

    public double getGastosOperacion() {
        return gastosOperacion;
    }

    public double getGastosFinancieros() {
        return gastosFinancieros;
    }

    public double getOtrosGastos() {
        return otrosGastos;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public double getUtilidadBruta() {

        return ventas - costoVentas;
    }

    public double getUtilidadOperativa() {

        return getUtilidadBruta()
                - gastosOperacion;
    }

    // UTILIDAD ANTES IMPUESTOS
    public double getUtilidadAntesImpuestos() {

        return getUtilidadOperativa()
                + otrosIngresos
                - gastosFinancieros
                - otrosGastos;
    }

    // UTILIDAD NETA
    public double getUtilidadNeta() {

        return getUtilidadAntesImpuestos()
                - impuestos;
    }

    public double getMargenBruto() {

        if (ventas == 0) {
            return 0;
        }

        return getUtilidadBruta()
                / ventas;
    }

    public double getMargenOperativo() {

        if (ventas == 0) {
            return 0;
        }

        return getUtilidadOperativa()
                / ventas;
    }
    public double getMargenNeto() {

        if (ventas == 0) {
            return 0;
        }

        return getUtilidadNeta()
                / ventas;
    }
}