package com.hw.mq.test;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: RabbitMQTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Hacker by HW
 * @Create 2024/8/13 19:34
 * @Version 1.0
 */
@SpringBootTest
public class RabbitMQTest {
//    // 在简单模式下，没有用到交换机
//    public static final String EXCHANGE_DIRECT = "";
//
//    // 在简单模式下，消息直接发送到队列，此时生产者端需要把队列名称从路由键参数这里传入
//    public static final String ROUTING_KEY_SIMPLE = "atguigu.queue.simple";
//
    // 注入 RabbitTemplate 执行
    @Autowired
    private RabbitTemplate rabbitTemplate;

//    @Test
//    public void testSendMessageSimple() {
//        // 发送消息
//        rabbitTemplate.convertAndSend(
//                EXCHANGE_DIRECT,   	// 指定交换机名称
//                ROUTING_KEY_SIMPLE, // 指定路由键名称
//                "Hello atguigu");   // 消息内容，也就是消息数据本身
//    }
//
//
//
//    public static final String ROUTING_KEY_WORK = "atguigu.queue.work";
//
//    @Test
//    public void testSendMessageWork() {
//        for (int i = 0; i < 10; i++) {
//            rabbitTemplate.convertAndSend(
//                    EXCHANGE_DIRECT,
//                    ROUTING_KEY_WORK,
//                    "Hello atguigu " + i);
//        }
//    }

    public static final String EXCHANGE_FANOUT = "atguigu.exchange.fanout";

    @Test
    public void testSendMessageFanout() {
        rabbitTemplate.convertAndSend(EXCHANGE_FANOUT, "", "Hello fanout ~");
    }
}
