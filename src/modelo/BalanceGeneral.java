package modelo;

public class BalanceGeneral {

    private double efectivo;

    private double cuentasCobrar;

    private double impuestosRecuperar;

    private double inventarios;

    private double pagosAnticipados;

    private double terrenos;

    private double maquinaria;

    private double edificios;

    private double equipoTransporte;

    private double inversiones;

    private double depreciacion;

    private double amortizacion;

    private double otrosActivos;
    
    private double proveedores;

    private double deudaCP;

    private double deudaLP;

    private double impuestosPagar;

    private double otrasCuentasPagar;

    private double capital;

    public BalanceGeneral(

            double efectivo,
            double cuentasCobrar,
            double impuestosRecuperar,
            double inventarios,
            double pagosAnticipados,

            double terrenos,
            double maquinaria,
            double edificios,
            double equipoTransporte,
            double inversiones,
            double depreciacion,
            double amortizacion,
            double otrosActivos,

            double proveedores,
            double deudaCP,
            double deudaLP,
            double impuestosPagar,
            double otrasCuentasPagar,

            double capital
    ) {

        this.efectivo = efectivo;

        this.cuentasCobrar =
                cuentasCobrar;

        this.impuestosRecuperar =
                impuestosRecuperar;

        this.inventarios =
                inventarios;

        this.pagosAnticipados =
                pagosAnticipados;
        
        this.terrenos = terrenos;

        this.maquinaria =
                maquinaria;

        this.edificios =
                edificios;

        this.equipoTransporte =
                equipoTransporte;

        this.inversiones =
                inversiones;

        this.depreciacion =
                depreciacion;

        this.amortizacion =
                amortizacion;

        this.otrosActivos =
                otrosActivos;

        this.proveedores =
                proveedores;

        this.deudaCP =
                deudaCP;

        this.deudaLP =
                deudaLP;

        this.impuestosPagar =
                impuestosPagar;

        this.otrasCuentasPagar =
                otrasCuentasPagar;

        this.capital = capital;
    }

    public double getEfectivo() {
        return efectivo;
    }

    public double getCuentasCobrar() {
        return cuentasCobrar;
    }

    public double getImpuestosRecuperar() {
        return impuestosRecuperar;
    }

    public double getInventarios() {
        return inventarios;
    }

    public double getPagosAnticipados() {
        return pagosAnticipados;
    }

    public double getTerrenos() {
        return terrenos;
    }

    public double getMaquinaria() {
        return maquinaria;
    }

    public double getEdificios() {
        return edificios;
    }

    public double getEquipoTransporte() {
        return equipoTransporte;
    }

    public double getInversiones() {
        return inversiones;
    }

    public double getDepreciacion() {
        return depreciacion;
    }

    public double getAmortizacion() {
        return amortizacion;
    }

    public double getOtrosActivos() {
        return otrosActivos;
    }

    public double getProveedores() {
        return proveedores;
    }

    public double getDeudaCP() {
        return deudaCP;
    }

    public double getDeudaLP() {
        return deudaLP;
    }

    public double getImpuestosPagar() {
        return impuestosPagar;
    }

    public double getOtrasCuentasPagar() {
        return otrasCuentasPagar;
    }

    public double getCapital() {
        return capital;
    }

    public double getActivoCirculante() {

        return efectivo +
               cuentasCobrar +
               impuestosRecuperar +
               inventarios +
               pagosAnticipados;
    }

    public double getActivoFijo() {

        return terrenos +
               maquinaria +
               edificios +
               equipoTransporte +
               inversiones +
               otrosActivos -
               depreciacion -
               amortizacion;
    }

    public double getActivoTotal() {

        return getActivoCirculante()
                + getActivoFijo();
    }

    public double getPasivoCortoPlazo() {

        return proveedores +
               deudaCP +
               impuestosPagar +
               otrasCuentasPagar;
    }

    public double getPasivoLargoPlazo() {

        return deudaLP;
    }

    public double getPasivoTotal() {

        return getPasivoCortoPlazo()
                + getPasivoLargoPlazo();
    }

    public double getCapitalContable() {

        return capital;
    }

    public double getBalanceFinal() {

        return getActivoTotal()
                - getPasivoTotal()
                - capital;
    }
}