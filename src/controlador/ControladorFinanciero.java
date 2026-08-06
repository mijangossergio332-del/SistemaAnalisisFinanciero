package controlador;

import java.util.ArrayList;

import modelo.PeriodoFinanciero;

public class ControladorFinanciero {

    private ArrayList<PeriodoFinanciero>
            periodos;

    public ControladorFinanciero() {

        periodos = new ArrayList<>();
    }

    public void agregarPeriodo(
            PeriodoFinanciero periodo) {

        periodos.add(periodo);
    }

    public ArrayList<PeriodoFinanciero>
    getPeriodos() {

        return periodos;
    }

    public PeriodoFinanciero
    buscarPorAnio(int anio) {

        for (PeriodoFinanciero p
                : periodos) {

            if (p.getAnio() == anio) {

                return p;
            }
        }

        return null;
    }

    public void eliminarPeriodo(
            int anio) {

        PeriodoFinanciero periodo =

                buscarPorAnio(anio);

        if (periodo != null) {

            periodos.remove(periodo);
        }
    }

    public void actualizarPeriodo(
            PeriodoFinanciero nuevoPeriodo) {

        for (int i = 0;
             i < periodos.size();
             i++) {

            if (periodos.get(i)
                    .getAnio()
                    == nuevoPeriodo.getAnio()) {

                periodos.set(i,
                        nuevoPeriodo);

                return;
            }
        }
    }

    public void limpiarPeriodos() {

        periodos.clear();
    }

    public int totalPeriodos() {

        return periodos.size();
    }

    public boolean existePeriodo(
            int anio) {

        return buscarPorAnio(anio)
                != null;
    }
}