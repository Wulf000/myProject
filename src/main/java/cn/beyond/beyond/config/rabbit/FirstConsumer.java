package cn.beyond.beyond.config.rabbit;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

import org.springframework.stereotype.Component;

import com.rabbitmq.client.Channel;



/**
 * 消息消费者1
 */

@Component
public class FirstConsumer {

	@RabbitListener(queues = {"first-queue","second-queue"})
    public void handleMessage(String message,Channel channel) throws Exception {
		System.err.println(message);
		try {
			channel.basicAck(0, true);
		} catch (Exception e) {
			// TODO: handle exception
		}
        // 处理消息
        System.out.println("FirstConsumer {} handleMessage :"+message);
    }
}
