package Modelo;

public class Labadora extends Producto {

    private int libras;

    public Labadora() {
        this.generarInventario();
    }

    public Labadora(int libras, String marca, String modelo) {
        super(marca, modelo);
        this.libras = libras;
    }
    
    
}
