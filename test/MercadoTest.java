package test;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import src.Mercado;
import src.Producto;

import java.util.List;
import java.util.ArrayList;

import static org.mockito.Mockito.*;

public class MercadoTest {

    @Test
    public void testPublicarAviso() {
        // Crear un mock para la lista de productos
        List<Producto> mockListaProductos = Mockito.mock(List.class);
        Producto mockProducto = Mockito.mock(Producto.class);

        Mercado mercado = new Mercado(mockListaProductos);

        // Llamar al método publicarAviso y verificar que se añadió el producto
        mercado.publicarAviso(mockListaProductos, mockProducto);
        verify(mockListaProductos).add(mockProducto);
    }

    @Test
    public void testVerTodoAviso() {
        // Crear una lista de productos
        List<Producto> listaProductos = new ArrayList<>();
        Producto producto1 = new Producto("Laptop", 101, "Nuevo", "$1200");
        listaProductos.add(producto1);

        Mercado mercado = new Mercado(listaProductos);

        // Verificar la salida al llamar a verTodoAviso
        mercado.verTodoAviso(listaProductos);
    }

    @Test
    public void testOrdenPublicarVer() {
        // Crear un mock para la lista y los productos
        List<Producto> mockListaProductos = Mockito.mock(List.class);
        Producto mockProducto = Mockito.mock(Producto.class);

        Mercado mercado = new Mercado(mockListaProductos);

        // Publicar el aviso
        mercado.publicarAviso(mockListaProductos, mockProducto);

        // Verificar que primero se agregó el producto, luego se visualizó
        verify(mockListaProductos).add(mockProducto);
        mercado.verTodoAviso(mockListaProductos);
    }
}

