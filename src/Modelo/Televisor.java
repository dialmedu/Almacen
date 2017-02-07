package Modelo;

public class Televisor extends Producto {

    private String pulgadas;

    private Boolean SmartTv;

    private String color;

    public Televisor() {
       this.generarInventario();
    }

    public Televisor(String pulgadas, Boolean SmartTv, String color, String marca, String modelo) {
        super(marca, modelo);
        this.pulgadas = pulgadas;
        this.SmartTv = SmartTv;
        this.color = color;
    }
    
    
}
