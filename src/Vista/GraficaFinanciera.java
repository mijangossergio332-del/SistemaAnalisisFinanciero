package Vista;

import controlador.ControladorFinanciero;
import modelo.PeriodoFinanciero;
import util.CalculadoraFinanciera;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;

import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.*;
import java.io.File;

public class GraficaFinanciera extends JFrame {

    private JFreeChart grafica;

    public GraficaFinanciera(
            ControladorFinanciero controlador) {

        setTitle(
                "Indicadores Financieros");

        setSize(1000, 600);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(
                DISPOSE_ON_CLOSE);

        DefaultCategoryDataset dataset =
                new DefaultCategoryDataset();

        for (PeriodoFinanciero p :
                controlador.getPeriodos()) {

            String anio =
                    String.valueOf(
                            p.getAnio());

            double roa =
                    CalculadoraFinanciera
                            .ROA(
                                    p.getBalance(),
                                    p.getResultados()) * 100;

            double roe =
                    CalculadoraFinanciera
                            .ROE(
                                    p.getBalance(),
                                    p.getResultados()) * 100;

            double margen =
                    CalculadoraFinanciera
                            .margenNeto(
                                    p.getResultados()) * 100;

            double endeudamiento =
                    CalculadoraFinanciera
                            .endeudamiento(
                                    p.getBalance()) * 100;

            dataset.addValue(
                    roa,
                    "ROA %",
                    anio);

            dataset.addValue(
                    roe,
                    "ROE %",
                    anio);

            dataset.addValue(
                    margen,
                    "Margen Neto %",
                    anio);

            dataset.addValue(
                    endeudamiento,
                    "Endeudamiento %",
                    anio);
        }

        grafica =
                ChartFactory.createLineChart(
                        "Indicadores Financieros",
                        "Año",
                        "Porcentaje (%)",
                        dataset
                );

        ChartPanel panel =
                new ChartPanel(grafica);

        add(panel);

        guardarGrafica();
    }

    private void guardarGrafica() {

        try {

            File archivoGrafica =
                    new File(
                            System.getProperty("user.dir")
                            + File.separator
                            + "grafica.png");

            ChartUtilities.saveChartAsPNG(
                    archivoGrafica,
                    grafica,
                    1000,
                    600);

            System.out.println(
                    "Grafica guardada en: "
                    + archivoGrafica.getAbsolutePath());

        } catch (Exception e) {

            e.printStackTrace();

            JOptionPane.showMessageDialog(
                    null,
                    "Generado correctamente");
        }
    }
}