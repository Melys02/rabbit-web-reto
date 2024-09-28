package grupo.primera.practica.rabbit_web_reto.Controller;

import grupo.primera.practica.rabbit_web_reto.modelo.Pedido;
import grupo.primera.practica.rabbit_web_reto.producer.PedidoProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoProducer pedidoProducer;

    @PostMapping
    public void crearPedido(@RequestBody Pedido pedido) {
        pedidoProducer.enviarPedido(pedido);
    }
}
