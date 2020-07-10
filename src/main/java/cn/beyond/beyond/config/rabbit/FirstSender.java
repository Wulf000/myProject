package cn.beyond.beyond.config.rabbit;

import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FirstSender {

	@Autowired
    private RabbitTemplate rabbitTemplate;
 
    /**
     * 发送消息
     * @param uuid
     * @param message  消息
     */
    public void send(String uuid,Object message) {
        CorrelationData correlationId = new CorrelationData(uuid);
        //消息放入队列a中
        rabbitTemplate.convertAndSend(RabbitConfig.EXCHANGE, RabbitConfig.ROUTINGKEY2,
                message, correlationId);
    }

}
