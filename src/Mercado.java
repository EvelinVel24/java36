import java.util.List;

public class Mercado {
    private List<Producto> productos;

    // Constructor
    public Mercado(List<Producto> productos) {
        this.productos = productos;
    }

    // Método para publicar un aviso de producto
    public List<Producto> publicarAviso(Producto producto) {
        this.productos.add(producto);
        System.out.println("Su producto ha sido subido al mercado online.");
        return productos;
    }

    // Método para ver todos los avisos
    public void verTodoAviso() {
        System.out.println("Los productos disponibles en el mercado ahora son:");
        for (Producto producto : this.productos) {
            System.out.println("- " + producto.getNombre() + " (ID: " + producto.getIdProducto() + ")");
        }
    }
}
