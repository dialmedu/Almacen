package Modelo;

public class Producto implements Control {

    private String marca;

    private String modelo;

    private String precio;

    private int cantidad;

    public Producto() {
    
    }

    public Producto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    @Override
    public void vender(int cantidad) {
        this.cantidad-=cantidad;
        
    }

    @Override
    public String existen() {
        if (isExisten()) {
            return "Exiten " + this.cantidad + " unidades de este producto";
        }else{
            return "Stock vacio para este producto";
        }
    }
    
    public boolean isExisten() {
        return cantidad > 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public final void generarInventario(){
        int cant = (int) (Math.random() * 100) + 1;
        this.setCantidad(cant);
    }
}
