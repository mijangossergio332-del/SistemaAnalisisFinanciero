package util;

import com.lowagie.text.Document;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableModel;

import java.io.File;
import java.io.FileOutputStream;

public class ExportadorPDF {

    public static void exportar(JTable tabla) throws Exception {
        JFileChooser selector =
                new JFileChooser();

        selector.setDialogTitle(
                "Guardar PDF");

        selector.setFileFilter(
                new FileNameExtensionFilter(
                        "Archivos PDF",
                        "pdf"));

        selector.setSelectedFile(
                new File("ReporteFinanciero.pdf"));

        int opcion =
                selector.showSaveDialog(null);
        if (opcion != JFileChooser.APPROVE_OPTION) {

            return;
        }
        File archivo =
                selector.getSelectedFile();
        if (!archivo.getName()
                .toLowerCase()
                .endsWith(".pdf")) {

            archivo =
                    new File(
                            archivo.getAbsolutePath()
                                    + ".pdf");
        }
        Document documento =
                new Document();

        PdfWriter.getInstance(
                documento,
                new FileOutputStream(archivo));

        documento.open();
        Font fuenteTitulo =
                new Font(
                        Font.HELVETICA,
                        18,
                        Font.BOLD);

        Paragraph titulo =
                new Paragraph(
                        "REPORTE FINANCIERO",
                        fuenteTitulo);

        titulo.setAlignment(
                Element.ALIGN_CENTER);

        documento.add(titulo);

        documento.add(new Paragraph(" "));
        TableModel modelo =
                tabla.getModel();

        PdfPTable pdfTabla =
                new PdfPTable(
                        modelo.getColumnCount());

        pdfTabla.setWidthPercentage(100);
        for (int i = 0;
             i < modelo.getColumnCount();
             i++) {

            PdfPCell celda =
                    new PdfPCell(
                            new Phrase(
                                    modelo.getColumnName(i)));

            celda.setHorizontalAlignment(
                    Element.ALIGN_CENTER);

            pdfTabla.addCell(celda);
        }
        for (int fila = 0;
             fila < modelo.getRowCount();
             fila++) {

            for (int columna = 0;
                 columna < modelo.getColumnCount();
                 columna++) {

                Object valor =
                        modelo.getValueAt(
                                fila,
                                columna);

                pdfTabla.addCell(
                        valor.toString());
            }
        }
        documento.add(pdfTabla);
        documento.close();
    }
}