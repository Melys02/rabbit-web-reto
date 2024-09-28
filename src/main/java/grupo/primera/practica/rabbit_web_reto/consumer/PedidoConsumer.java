package grupo.primera.practica.rabbit_web_reto.consumer;

import grupo.primera.practica.rabbit_web_reto.modelo.Pedido;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Slf4j
@Service
public class PedidoConsumer {
    @RabbitListener(queues = "cola_pedidos")
    public void recibirPedido(Pedido pedido) {
        System.out.println("Pedido recibido: " + pedido);

        // Lógica para verificar inventario
        // Si está disponible, enviar a preparación, de lo contrario manejar error
        boolean disponible = verificarInventario(pedido);
        if (disponible) {
            System.out.println("Inventario disponible, preparando pedido: " + pedido);
            // Aquí se puede llamar a otro servicio o enviar a otra cola
        } else {
            System.out.println("Inventario no disponible para el pedido: " + pedido);
            // Manejar el error (opcionalmente enviar a Dead Letter Queue)
        }
    }

    private boolean verificarInventario(Pedido pedido) {
        // Simular verificación de inventario (aquí debería ir la lógica real)
        return pedido.getCantidad() <= 5; // Supongamos que siempre hay 5 en stock}
}
}

