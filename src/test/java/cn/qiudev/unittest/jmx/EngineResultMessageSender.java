package cn.qiudev.unittest.jmx;

import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.ActiveProfiles;

import javax.jms.TextMessage;
import java.util.List;

@ActiveProfiles("test")
@SpringBootTest
@EnableJms
@Setter
@Configuration
@ConfigurationProperties(prefix = "engine-result")
@Slf4j
public class EngineResultMessageSender {

    @Autowired
    private JmsTemplate jmsTemplate;

    /**
     * 队列地址
     */
    private String destination;

    /**
     * 消息列表
     */
    private List<String> messageList;

    @BeforeEach
    @Test
    @DisplayName("发送引擎结果消息到指定队列")
    public void sendMessageToDemoQueue() {
        messageList.forEach(
                messageText -> {
                    jmsTemplate.send(destination, session -> {
                        TextMessage textMessage = session.createTextMessage();
                        textMessage.setText(messageText);
                        return textMessage;
                    });
                    log.info("send {} to {} succeed", messageText, destination);
                }
        );
    }
}
