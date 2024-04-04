package uy.edu.ucu.aed;

import java.util.List;

public class Almacen implements IAlmacen {
    private String direccion;
    private String telefono;
    private String nombre;
    private Lista<IProducto> ListaProductos;
    private long stock;
    public Almacen(String direccion, String telefono, String nombre, Lista<IProducto> ListaProductos, long stock ) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.nombre = nombre;
        this.ListaProductos = ListaProductos;
        this.stock = stock;

    }
        public Almacen() {
           Producto primero = null;
        }
        public String getDireccion() {
            return this.direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public String getTelefono() {
            return this.telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getNombre() {
            return this.nombre;
        }

        public Lista<IProducto> getListaProductos() {
            return this.ListaProductos;
        }

        public long obtenerValorStock() {
            return stock;
        }

    @Override
    public void insertarProducto(IProducto unProducto) {

    }

    /**
         * Incorporar un nuevo producto al supermercado.
         *
         * @param unProducto
         */
        public void insertarProducto(IProducto unProducto, Comparable clave) {
            ListaProductos.insertar(unProducto, clave);
        }

        /**
         * Eliminar productos que ya no se venden (por no ser comercializados m�s).
         *
         * @param clave
         * @return
         */
        public boolean eliminarProducto(Comparable codProducto) {
            ListaProductos.eliminar(codProducto);
            return ListaProductos.buscar(codProducto) == null;
        }

        /**
         * Imprime la lista de productos
         *
         * @return
         */
        public String imprimirProductos();

        /**
         * Dado un separador ej.:",", ";", imprime los productos separados por tal
         * caracter
         *
         * @param separador
         * @return
         */
        public String imprimirSeparador(String separador);

        /**
         * Agregar stock a un producto existente.
         *
         * @param clave
         * @param cantidad
         * @return
         */
        public Boolean agregarStock(Comparable codProducto, Integer cantidad) {
            IProducto producto = ListaProductos.buscar(codProducto);
            Integer stockActual = producto.getStock();
            if(producto != null) {
                stockActual += cantidad;
            }
            return true;
        }

        /**
         * Simular la venta de un producto (reducir el stock de un producto
         * existente
         *
         * @param clave
         * @param cantidad
         * @return
         */
        public Integer restarStock(Comparable codProducto, Integer cantidad) {
           IProducto producto = ListaProductos.buscar(codProducto);
            Integer stockActual = producto.getStock();
            if(producto != null) {
               stockActual -= cantidad;
            }
            return stockActual;
        }


        public IProducto buscarPorCodigo(Comparable codProducto);

        /**
         * Listar todos los productos registrados, ordenados por nombre, presentando
         * adem�s su stock. Imprime por consola la lista de todos los productos
         * registrados y su stock actual.
         */
        public void listarOrdenadoPorNombre();

        /**
         * Busca un producto por su descripci�n.
         *
         * @param descripcion
         * @return
         */
        public IProducto buscarPorDescripcion(String descripcion);

        /**
         * Retorna el tama�o del almacen: cantidad de productos. No es lo mismo que
         * el total de stock, sino que ser�a en definitiva el tama�o de la lista.
         *
         * @return
         */
        public int cantidadProductos() {
            return -1;
        }



}
