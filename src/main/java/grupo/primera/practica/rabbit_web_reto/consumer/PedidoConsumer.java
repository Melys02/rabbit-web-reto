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
        System.out.println("Pedido recibido:" + pedido);
    }
    }
