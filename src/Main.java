import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto producto1 = Producto.crearAviso("Laptop", 101, "Nuevo", "$1200");
        Producto producto2 = Producto.crearAviso("Celular", 102, "Usado", "$500");

        // Crear lista de productos
        List<Producto> listaProductos = new ArrayList<>();

        // Crear mercado
        Mercado mercado = new Mercado(listaProductos);

        // Publicar productos
        mercado.publicarAviso(producto1);
        mercado.publicarAviso(producto2);

        // Ver todos los avisos
        mercado.verTodoAviso();
    }
}

