package br.com.lucasfood.pagamentos.amqp;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PagamentoAMQPConfiguration {

    public Queue criarFila() {
        return new Queue("pagamento.concluido");
    }
}
