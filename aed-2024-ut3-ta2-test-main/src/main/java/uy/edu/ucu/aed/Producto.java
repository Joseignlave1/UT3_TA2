package uy.edu.ucu.aed;

public class Producto implements IProducto{
    private Comparable codigo;
    private Integer precio;
    private Integer stock;
    private String nombre;
    public Producto(Comparable codigo, Integer precio,Integer stock, String nombre) {
        this.codigo = codigo;
        this.precio = precio;
        this.stock = stock;
        this.nombre = nombre;
    }
    @Override
    public Comparable getCodProducto() {
        return null;
    }

    @Override
    public Integer getPrecio() {
        return null;
    }

    @Override
    public void setPrecio(Integer precio) {

    }

    @Override
    public Integer getStock() {
        return this.stock;
    }

    @Override
    public void agregarCantidadStock(Integer stock) {
        this.stock += stock;
    }

    @Override
    public void restarCantidadStock(Integer stock) {
        this.stock -= stock;
    }

    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public void setNombre(String nombre) {

    }
}
