package util;

public class ValidadorDatos {
    public static boolean
    validarNumero(double valor) {

        return valor >= 0;
    }
    public static double
    corregir(double valor){

        if(valor < 0){
            return 0;
        }

        return valor;
    }

    public static boolean
    textoVacio(String texto){

        return texto == null
                || texto.trim().isEmpty();
    }
    public static boolean
    validarAnio(int anio){

        return anio >= 2000
                && anio <= 2100;
    }
    public static boolean
    validarPorcentaje(
            double valor){

        return valor >= 0
                && valor <= 100;
    }
}