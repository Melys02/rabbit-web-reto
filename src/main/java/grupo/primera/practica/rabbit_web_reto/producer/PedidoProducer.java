package grupo.primera.practica.rabbit_web_reto.producer;

import grupo.primera.practica.rabbit_web_reto.modelo.Pedido;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class PedidoProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void enviarPedido(Pedido pedido) {
        rabbitTemplate.convertAndSend("cola_pedidos", pedido);
        System.out.println("Pedido enviado: " + pedido);
    }

}
