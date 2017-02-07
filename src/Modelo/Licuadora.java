package Modelo;

public class Licuadora extends Producto {


    private int velocidades;

    private int cantidad;

    public Licuadora() {
        this.generarInventario();
    }

    public Licuadora(int velocidades, int cantidad, String marca, String modelo) {
        super(marca, modelo);
        this.velocidades = velocidades;
        this.cantidad = cantidad;
    }

    
    
    
}
