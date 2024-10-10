package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import src.Producto;

public class ProductoTest {

    @Test
    public void testCrearAviso() {
        // Crear un aviso de producto
        Producto producto = Producto.crearAviso("Laptop", 101, "Nuevo", "$1200");

        // Verificar que los atributos sean correctos
        assertEquals("Laptop", producto.getNombre());
        assertEquals(101, producto.getIdProducto());
        assertEquals("Nuevo", producto.getCondicion());
        assertEquals("$1200", producto.getPrecio());
    }
}
