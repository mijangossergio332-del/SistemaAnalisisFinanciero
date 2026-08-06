package Vista;

import controlador.ControladorFinanciero;
import modelo.Sesion;

import modelo.IndicadorFinanciero;
import modelo.RazonCirculante;
import modelo.PruebaAcida;
import modelo.ROA;
import modelo.ROE;
import modelo.MargenNeto;
import modelo.RotacionActivos;
import modelo.Endeudamiento;

import util.ExportadorPDF;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class VentanaPrincipal extends JFrame {

    private ControladorFinanciero controlador;

    private JTextField txtEmpresa;
    private JTextField txtAnio;

    private JTextField txtEfectivo;
    private JTextField txtCuentasCobrar;
    private JTextField txtImpuestosRecuperar;
    private JTextField txtInventarios;
    private JTextField txtPagosAnticipados;

    private JTextField txtMaquinaria;
    private JTextField txtInversiones;
    private JTextField txtOtrosActivos;

    private JTextField txtProveedores;
    private JTextField txtDeudaCP;
    private JTextField txtDeudaLP;
    private JTextField txtImpuestosPagar;
    private JTextField txtOtrasCuentasPagar;

    private JTextField txtCapital;

    private JTextField txtVentas;
    private JTextField txtOtrosIngresos;
    private JTextField txtCostoVentas;
    private JTextField txtGastosOperacion;
    private JTextField txtGastosFinancieros;
    private JTextField txtOtrosGastos;
    private JTextField txtImpuestos;

    private JTable tabla;
    private DefaultTableModel modeloTabla;

    private JButton btnGuardar;
    private JButton btnGrafica;
    private JButton btnPDF;
    private JButton btnCerrarSesion;

    public VentanaPrincipal() {

        controlador =
                new ControladorFinanciero();

        setTitle("Sistema Financiero");

        setExtendedState(
                JFrame.MAXIMIZED_BOTH);

        setDefaultCloseOperation(
                EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        initComponents();
    }

    private void initComponents() {

        JPanel principal =
                new JPanel(
                        new BorderLayout(
                                10,
                                10));

        JPanel panelSuperior =
                new JPanel(
                        new FlowLayout(
                                FlowLayout.LEFT));

        JLabel lblSesion =
                new JLabel(
                        "Usuario: "
                                + Sesion.usuario
                                + " | Rol: "
                                + Sesion.rol);

        lblSesion.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        16));

        panelSuperior.add(lblSesion);

        JPanel panelFormulario =
                crearPanelCaptura();

        JScrollPane scrollFormulario =
                new JScrollPane(panelFormulario);

        scrollFormulario.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JScrollPane scrollTabla =
                crearTabla();

        JSplitPane split =
                new JSplitPane(
                        JSplitPane.VERTICAL_SPLIT,
                        scrollFormulario,
                        scrollTabla);

        split.setDividerLocation(450);

        JPanel panelBotones =
                new JPanel(
                        new FlowLayout(
                                FlowLayout.CENTER,
                                20,
                                10));

        panelBotones.add(btnGuardar);
        panelBotones.add(btnGrafica);
        panelBotones.add(btnPDF);
        panelBotones.add(btnCerrarSesion);

        principal.add(
                panelSuperior,
                BorderLayout.NORTH);

        principal.add(
                split,
                BorderLayout.CENTER);

        principal.add(
                panelBotones,
                BorderLayout.SOUTH);

        add(principal);

        configurarPermisos();
    }

    private JPanel crearPanelCaptura() {

        JPanel panel =
                new JPanel(
                        new GridLayout(
                                13,
                                4,
                                10,
                                10));

        txtEmpresa = new JTextField();
        txtAnio = new JTextField();

        txtEfectivo = new JTextField();
        txtCuentasCobrar = new JTextField();
        txtImpuestosRecuperar = new JTextField();
        txtInventarios = new JTextField();
        txtPagosAnticipados = new JTextField();

        txtMaquinaria = new JTextField();
        txtInversiones = new JTextField();
        txtOtrosActivos = new JTextField();

        txtProveedores = new JTextField();
        txtDeudaCP = new JTextField();
        txtDeudaLP = new JTextField();
        txtImpuestosPagar = new JTextField();
        txtOtrasCuentasPagar = new JTextField();

        txtCapital = new JTextField();

        txtVentas = new JTextField();
        txtOtrosIngresos = new JTextField();
        txtCostoVentas = new JTextField();
        txtGastosOperacion = new JTextField();
        txtGastosFinancieros = new JTextField();
        txtOtrosGastos = new JTextField();
        txtImpuestos = new JTextField();

        panel.add(new JLabel("Empresa"));
        panel.add(txtEmpresa);

        panel.add(new JLabel("Año"));
        panel.add(txtAnio);

        panel.add(new JLabel("Efectivo"));
        panel.add(txtEfectivo);

        panel.add(new JLabel("Cuentas por Cobrar"));
        panel.add(txtCuentasCobrar);

        panel.add(new JLabel("Impuestos Recuperar"));
        panel.add(txtImpuestosRecuperar);

        panel.add(new JLabel("Inventarios"));
        panel.add(txtInventarios);

        panel.add(new JLabel("Pagos Anticipados"));
        panel.add(txtPagosAnticipados);

        panel.add(new JLabel("Maquinaria"));
        panel.add(txtMaquinaria);

        panel.add(new JLabel("Inversiones"));
        panel.add(txtInversiones);

        panel.add(new JLabel("Otros Activos"));
        panel.add(txtOtrosActivos);

        panel.add(new JLabel("Proveedores"));
        panel.add(txtProveedores);

        panel.add(new JLabel("Deuda CP"));
        panel.add(txtDeudaCP);

        panel.add(new JLabel("Deuda LP"));
        panel.add(txtDeudaLP);

        panel.add(new JLabel("Impuestos por Pagar"));
        panel.add(txtImpuestosPagar);

        panel.add(new JLabel("Otras Cuentas por Pagar"));
        panel.add(txtOtrasCuentasPagar);

        panel.add(new JLabel("Capital"));
        panel.add(txtCapital);

        panel.add(new JLabel("Ventas"));
        panel.add(txtVentas);

        panel.add(new JLabel("Otros Ingresos"));
        panel.add(txtOtrosIngresos);

        panel.add(new JLabel("Costo de Ventas"));
        panel.add(txtCostoVentas);

        panel.add(new JLabel("Gastos Operativos"));
        panel.add(txtGastosOperacion);

        panel.add(new JLabel("Gastos Financieros"));
        panel.add(txtGastosFinancieros);

        panel.add(new JLabel("Otros Gastos"));
        panel.add(txtOtrosGastos);

        panel.add(new JLabel("Impuestos"));
        panel.add(txtImpuestos);
        btnGuardar =
                new JButton("Guardar");

        btnGrafica =
                new JButton("Ver Gráfica");

        btnPDF =
                new JButton("Exportar PDF");

        btnCerrarSesion =
                new JButton("Cerrar Sesión");
        btnGuardar.addActionListener(e -> {

            guardarInformacion();
        });

        btnGrafica.addActionListener(e -> {

            mostrarGrafica();
        });

        btnPDF.addActionListener(e -> {

            try {

                ExportadorPDF.exportar(tabla);

                JOptionPane.showMessageDialog(
                        this,
                        "PDF exportado correctamente");

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Error PDF:\n"
                                + ex.getMessage());

                ex.printStackTrace();
            }
        });

        btnCerrarSesion.addActionListener(e -> {

            cerrarSesion();
        });

        return panel;
    }

    private JScrollPane crearTabla() {

        modeloTabla =
                new DefaultTableModel();

        modeloTabla.addColumn("Empresa");
        modeloTabla.addColumn("Año");

        modeloTabla.addColumn("Activo Total");
        modeloTabla.addColumn("Pasivo Total");
        modeloTabla.addColumn("Capital");

        modeloTabla.addColumn("Ventas");
        modeloTabla.addColumn("Utilidad Neta");

        modeloTabla.addColumn("Razón Circulante");
        modeloTabla.addColumn("Prueba Ácida");

        modeloTabla.addColumn("ROA");
        modeloTabla.addColumn("ROE");

        modeloTabla.addColumn("Margen Neto");
        modeloTabla.addColumn("Rotación Activos");
        modeloTabla.addColumn("Endeudamiento");

        tabla =
                new JTable(modeloTabla);

        tabla.setRowHeight(25);

        return new JScrollPane(tabla);
    }

    private void guardarInformacion() {

        try {

            String empresa =
                    txtEmpresa.getText();

            int anio =
                    Integer.parseInt(
                            txtAnio.getText());

            double efectivo =
                    Double.parseDouble(
                            txtEfectivo.getText());

            double cuentasCobrar =
                    Double.parseDouble(
                            txtCuentasCobrar.getText());

            double impuestosRecuperar =
                    Double.parseDouble(
                            txtImpuestosRecuperar.getText());

            double inventarios =
                    Double.parseDouble(
                            txtInventarios.getText());

            double pagosAnticipados =
                    Double.parseDouble(
                            txtPagosAnticipados.getText());

            double maquinaria =
                    Double.parseDouble(
                            txtMaquinaria.getText());

            double inversiones =
                    Double.parseDouble(
                            txtInversiones.getText());

            double otrosActivos =
                    Double.parseDouble(
                            txtOtrosActivos.getText());

            double proveedores =
                    Double.parseDouble(
                            txtProveedores.getText());

            double deudaCP =
                    Double.parseDouble(
                            txtDeudaCP.getText());

            double deudaLP =
                    Double.parseDouble(
                            txtDeudaLP.getText());

            double impuestosPagar =
                    Double.parseDouble(
                            txtImpuestosPagar.getText());

            double otrasCuentasPagar =
                    Double.parseDouble(
                            txtOtrasCuentasPagar.getText());

            double capital =
                    Double.parseDouble(
                            txtCapital.getText());

            double ventas =
                    Double.parseDouble(
                            txtVentas.getText());

            double otrosIngresos =
                    Double.parseDouble(
                            txtOtrosIngresos.getText());

            double costoVentas =
                    Double.parseDouble(
                            txtCostoVentas.getText());

            double gastosOperacion =
                    Double.parseDouble(
                            txtGastosOperacion.getText());

            double gastosFinancieros =
                    Double.parseDouble(
                            txtGastosFinancieros.getText());

            double otrosGastos =
                    Double.parseDouble(
                            txtOtrosGastos.getText());

            double impuestos =
                    Double.parseDouble(
                            txtImpuestos.getText());
            double activoTotal =
                    efectivo
                            + cuentasCobrar
                            + impuestosRecuperar
                            + inventarios
                            + pagosAnticipados
                            + maquinaria
                            + inversiones
                            + otrosActivos;

            double pasivoTotal =
                    proveedores
                            + deudaCP
                            + deudaLP
                            + impuestosPagar
                            + otrasCuentasPagar;

            double utilidadNeta =
                    ventas
                            + otrosIngresos
                            - costoVentas
                            - gastosOperacion
                            - gastosFinancieros
                            - otrosGastos
                            - impuestos;
            IndicadorFinanciero rc =
                    new RazonCirculante(
                            activoTotal,
                            pasivoTotal);

            double razonCirculante =
                    rc.calcular();

            IndicadorFinanciero pa =
                    new PruebaAcida(
                            activoTotal,
                            inventarios,
                            pasivoTotal);

            double pruebaAcida =
                    pa.calcular();

            IndicadorFinanciero roaObj =
                    new ROA(
                            utilidadNeta,
                            activoTotal);

            double roa =
                    roaObj.calcular();

            IndicadorFinanciero roeObj =
                    new ROE(
                            utilidadNeta,
                            capital);

            double roe =
                    roeObj.calcular();

            IndicadorFinanciero margenObj =
                    new MargenNeto(
                            utilidadNeta,
                            ventas);

            double margenNeto =
                    margenObj.calcular();

            IndicadorFinanciero rotacionObj =
                    new RotacionActivos(
                            ventas,
                            activoTotal);

            double rotacionActivos =
                    rotacionObj.calcular();

            IndicadorFinanciero endeudamientoObj =
                    new Endeudamiento(
                            pasivoTotal,
                            activoTotal);

            double endeudamiento =
                    endeudamientoObj.calcular();
            modeloTabla.addRow(new Object[]{

                    empresa,
                    anio,

                    activoTotal,
                    pasivoTotal,
                    capital,

                    ventas,
                    utilidadNeta,

                    razonCirculante,
                    pruebaAcida,

                    roa,
                    roe,

                    margenNeto,
                    rotacionActivos,
                    endeudamiento
            });

            JOptionPane.showMessageDialog(
                    this,
                    "Información guardada correctamente");

            limpiarCampos();

        }

        catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Ingrese solo números válidos");

            e.printStackTrace();
        }

        catch (Exception e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Ocurrió un error inesperado");

            e.printStackTrace();
        }
    }

    private void mostrarGrafica() {

        try {

            DefaultCategoryDataset dataset =
                    new DefaultCategoryDataset();

            for (int i = 0;
                 i < modeloTabla.getRowCount();
                 i++) {

                String empresa =
                        modeloTabla.getValueAt(i, 0)
                                .toString();

                dataset.addValue(
                        Double.parseDouble(
                                modeloTabla.getValueAt(i, 7)
                                        .toString()),
                        "Razón Circulante",
                        empresa);

                dataset.addValue(
                        Double.parseDouble(
                                modeloTabla.getValueAt(i, 8)
                                        .toString()),
                        "Prueba Ácida",
                        empresa);

                dataset.addValue(
                        Double.parseDouble(
                                modeloTabla.getValueAt(i, 9)
                                        .toString()),
                        "ROA",
                        empresa);

                dataset.addValue(
                        Double.parseDouble(
                                modeloTabla.getValueAt(i, 10)
                                        .toString()),
                        "ROE",
                        empresa);

                dataset.addValue(
                        Double.parseDouble(
                                modeloTabla.getValueAt(i, 11)
                                        .toString()),
                        "Margen Neto",
                        empresa);

                dataset.addValue(
                        Double.parseDouble(
                                modeloTabla.getValueAt(i, 12)
                                        .toString()),
                        "Rotación Activos",
                        empresa);

                dataset.addValue(
                        Double.parseDouble(
                                modeloTabla.getValueAt(i, 13)
                                        .toString()),
                        "Endeudamiento",
                        empresa);
            }

            JFreeChart grafica =
                    ChartFactory.createLineChart(

                            "INDICADORES FINANCIEROS",
                            "EMPRESA",
                            "VALORES",

                            dataset);

            ChartPanel panel =
                    new ChartPanel(grafica);

            JFrame ventana =
                    new JFrame(
                            "Gráfica Financiera");

            ventana.setSize(1000, 700);

            ventana.setLocationRelativeTo(null);

            ventana.setDefaultCloseOperation(
                    JFrame.DISPOSE_ON_CLOSE);

            ventana.add(panel);

            ventana.setVisible(true);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Error al generar gráfica");

            e.printStackTrace();
        }
    }

    private void limpiarCampos() {

        txtEmpresa.setText("");
        txtAnio.setText("");

        txtEfectivo.setText("");
        txtCuentasCobrar.setText("");
        txtImpuestosRecuperar.setText("");
        txtInventarios.setText("");
        txtPagosAnticipados.setText("");

        txtMaquinaria.setText("");
        txtInversiones.setText("");
        txtOtrosActivos.setText("");

        txtProveedores.setText("");
        txtDeudaCP.setText("");
        txtDeudaLP.setText("");
        txtImpuestosPagar.setText("");
        txtOtrasCuentasPagar.setText("");

        txtCapital.setText("");

        txtVentas.setText("");
        txtOtrosIngresos.setText("");
        txtCostoVentas.setText("");
        txtGastosOperacion.setText("");
        txtGastosFinancieros.setText("");
        txtOtrosGastos.setText("");
        txtImpuestos.setText("");
    }

    private void configurarPermisos() {

        if (Sesion.rol.equals("Usuario")) {

            btnGrafica.setEnabled(false);

            btnPDF.setEnabled(false);
        }
    }

    private void cerrarSesion() {

        Sesion.idUsuario = 0;
        Sesion.idRol = 0;

        Sesion.usuario = "";
        Sesion.rol = "";

        dispose();

        new Login().setVisible(true);
    }

    public JTable getTabla() {

        return tabla;
    }
}