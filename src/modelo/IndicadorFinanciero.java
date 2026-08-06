package modelo;

public abstract class IndicadorFinanciero {

    protected String nombre;

    public IndicadorFinanciero(String nombre) {

        this.nombre = nombre;
    }

    public String getNombre() {

        return nombre;
    }
    public abstract double calcular();
}