package tallerweb.supermercado.modelo;

import java.util.LinkedList;
import java.util.List;

public class Carrito {

    private static Carrito instance = new Carrito();
    private List<Producto> productos = new LinkedList<Producto>();
    private List<Descuento> descuentos = new LinkedList<Descuento>();

    private Carrito() {
    }

    public static Carrito getInstance() {
        return instance;
    }

    /**
     * Elimina todos los productos del carrito.<br>
     */
    public void vaciar() {
        // Implementar
    	productos.remove(instance);
    }

    /**
     * Agrega un producto al carrito.<br>
     * 
     * @param ingrediente
     */
    public void agregarProducto(Producto producto) {
        // Implementar
    	if(producto != null)
    		if(instance.verProductos().contains(producto))
    			instance.agregarProducto(producto);
    }

    /**
     * Permite agregar un descuento que será aplicado al carrito.<br>
     * 
     * @param descuento
     */
    public void aplicarDescuento(Descuento descuento) {
        // Implementar
    }

    /**
     * Lista todos los productos que forman parte del carrito.<br>
     * 
     * @return
     */
    public List<Producto> verProductos() {
        // Implementar
        return null;
    }

    /**
     * Devuelve el precio total del carrito aplicando descuentos si los hubiese,
     * primero aplica los descuentos de monto y luego los de porcentaje.<br>
     * 
     * @return
     */
    public Double total() {
        // Implementar
        return null;
    }

    /**
     * Devuelve el precio sin descuentos del carrito.<br>
     * 
     * @return
     */
    public Double totalSinDescuentos() {
        // Implementar
        return null;
    }

    /**
     * Devuelve el dinero ahorrado gracias a los descuentos.<br>
     * 
     * @return
     */
    public Double totalAhorros() {
        // Implementar
        return null;
    }
}
