package cn.beyond.beyond.config.rabbit;

import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

import lombok.extern.slf4j.Slf4j;
/**
 * @Author Wulf
 * @Version 1.0
 * @Description TODO
 * 消息发送到交换机确认机制
 * ConfirmCallback只确认消息是否到达exchange
 */
@Slf4j
public class MsgSendConfirmCallBack implements RabbitTemplate.ConfirmCallback {

	/**
	 * 回调
	 */
	@Override
    public void confirm(CorrelationData correlationData, boolean ack, String cause) {
		
		log.info(cause);
        System.out.println("MsgSendConfirmCallBack  , 回调id:" + correlationData);
        if (ack) {
            System.out.println("消息消费成功");
        } else {
            System.out.println("消息消费失败:" + cause+"\n重新发送");
        }
    }
}
