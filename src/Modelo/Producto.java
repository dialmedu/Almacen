package Modelo;

public class Producto implements Control {

    private String marca;

    private String modelo;

    private String precio;

    private int cantidad;

    public Producto() {
    }

    @Override
    public void vender(int cantidad) {
        this.cantidad-=cantidad;
        
    }

    @Override
    public String existen() {
        if (isExisten()) {
            return "Exiten " + this.cantidad + "unidades de este producto";
        }else{
            return "Stock vacio para este producto";
        }
    }
    
    public boolean isExisten() {
        return cantidad > 0;
    }
    
    

    
}
