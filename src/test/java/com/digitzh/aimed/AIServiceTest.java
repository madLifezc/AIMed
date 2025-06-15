package com.digitzh.aimed;

import com.digitzh.aimed.assistant.Assistant;
import dev.langchain4j.community.model.dashscope.QwenChatModel;
import dev.langchain4j.service.AiServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AIServiceTest {
    @Autowired
    private QwenChatModel qwenChatModel;
    @Test
    public void testChat(){
        Assistant assistant = AiServices.create(Assistant.class, qwenChatModel);
        String answer = assistant.chat("你是谁");
        System.out.println(answer);
    }

    @Autowired
    private Assistant assistant;
    @Test
    public void testAssistant(){
        String answer = assistant.chat("我是谁");
        System.out.println(answer);
    }
}
