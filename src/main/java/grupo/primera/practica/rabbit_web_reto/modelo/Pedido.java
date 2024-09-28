package grupo.primera.practica.rabbit_web_reto.modelo;

public class Pedido {
    private String id;
    private String producto;
    private int cantidad;

    // Constructor, Getters y Setters
    public Pedido(String id, String producto, int cantidad) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
    }

}
