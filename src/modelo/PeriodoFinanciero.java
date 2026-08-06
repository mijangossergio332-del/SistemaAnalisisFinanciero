package modelo;

public class PeriodoFinanciero {
    private int anio;

    private String empresa;

    private BalanceGeneral balance;

    private EstadoResultados resultados;
    
    public PeriodoFinanciero(

            int anio,

            String empresa,

            BalanceGeneral balance,

            EstadoResultados resultados
    ) {

        this.anio = anio;

        this.empresa = empresa;

        this.balance = balance;

        this.resultados = resultados;
    }
    public int getAnio() {

        return anio;
    }

    public String getEmpresa() {

        return empresa;
    }

    public BalanceGeneral getBalance() {

        return balance;
    }

    public EstadoResultados getResultados() {

        return resultados;
    }

    public void setAnio(int anio) {

        this.anio = anio;
    }

    public void setEmpresa(String empresa) {

        this.empresa = empresa;
    }

    public void setBalance(
            BalanceGeneral balance) {

        this.balance = balance;
    }

    public void setResultados(
            EstadoResultados resultados) {

        this.resultados = resultados;
    }
    @Override
    public String toString() {

        return "Periodo Financiero\n" +

                "Empresa: " + empresa +

                "\nAño: " + anio +

                "\nActivo Total: " +

                balance.getActivoTotal() +

                "\nPasivo Total: " +

                balance.getPasivoTotal() +

                "\nCapital: " +

                balance.getCapital() +

                "\nVentas: " +

                resultados.getVentas() +

                "\nUtilidad Neta: " +

                resultados.getUtilidadNeta();
    }
}