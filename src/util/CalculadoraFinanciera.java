package util;

import modelo.BalanceGeneral;
import modelo.EstadoResultados;

public class CalculadoraFinanciera {
    public static double razonCirculante(
            BalanceGeneral bg){

        double activoCirculante =

                bg.getEfectivo()
              + bg.getCuentasCobrar()
              + bg.getInventarios();

        if(bg.getPasivoTotal() == 0){
            return 0;
        }

        return activoCirculante
                / bg.getPasivoTotal();
    }
    public static double pruebaAcida(
            BalanceGeneral bg){

        double activos =

                bg.getEfectivo()
              + bg.getCuentasCobrar();

        if(bg.getPasivoTotal() == 0){
            return 0;
        }

        return activos
                / bg.getPasivoTotal();
    }
    public static double capitalTrabajo(
            BalanceGeneral bg){

        double activoCirculante =

                bg.getEfectivo()
              + bg.getCuentasCobrar()
              + bg.getInventarios();

        return activoCirculante
                - bg.getPasivoTotal();
    }
    public static double endeudamiento(
            BalanceGeneral bg){

        if(bg.getActivoTotal() == 0){
            return 0;
        }

        return bg.getPasivoTotal()
                / bg.getActivoTotal();
    }

    public static double apalancamiento(
            BalanceGeneral bg){

        if(bg.getCapital() == 0){
            return 0;
        }

        return bg.getPasivoTotal()
                / bg.getCapital();
    }
    public static double ROA(
            BalanceGeneral bg,
            EstadoResultados er){

        if(bg.getActivoTotal() == 0){
            return 0;
        }

        return er.getUtilidadNeta()
                / bg.getActivoTotal();
    }

    public static double ROE(
            BalanceGeneral bg,
            EstadoResultados er){

        if(bg.getCapital() == 0){
            return 0;
        }

        return er.getUtilidadNeta()
                / bg.getCapital();
    }
    public static double margenBruto(
            EstadoResultados er){

        if(er.getVentas() == 0){
            return 0;
        }

        return er.getUtilidadBruta()
                / er.getVentas();
    }
    public static double margenOperativo(
            EstadoResultados er){

        if(er.getVentas() == 0){
            return 0;
        }

        return er.getUtilidadOperativa()
                / er.getVentas();
    }

    public static double margenNeto(
            EstadoResultados er){

        if(er.getVentas() == 0){
            return 0;
        }

        return er.getUtilidadNeta()
                / er.getVentas();
    }

    public static double rotacionActivos(
            BalanceGeneral bg,
            EstadoResultados er){

        if(bg.getActivoTotal() == 0){
            return 0;
        }

        return er.getVentas()
                / bg.getActivoTotal();
    }

    public static double rotacionInventarios(
            BalanceGeneral bg,
            EstadoResultados er){

        if(bg.getInventarios() == 0){
            return 0;
        }

        return er.getCostoVentas()
                / bg.getInventarios();
    }

    public static double porcentajeIntegral(
            double cuenta,
            double total){

        if(total == 0){
            return 0;
        }

        return (cuenta / total) * 100;
    }

    public static double tendencia(
            double actual,
            double base){

        if(base == 0){
            return 0;
        }

        return (actual / base) * 100;
    }

    public static double crecimiento(
            double actual,
            double anterior){

        if(anterior == 0){
            return 0;
        }

        return ((actual - anterior)
                / anterior) * 100;
    }
    public static String porcentaje(
            double valor){

        return String.format(
                "%.2f%%",
                valor * 100);
    }
    public static String moneda(
            double valor){

        return String.format(
                "$%,.2f",
                valor);
    }
}