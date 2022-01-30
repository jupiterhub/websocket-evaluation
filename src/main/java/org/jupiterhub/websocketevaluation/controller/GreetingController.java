package org.jupiterhub.websocketevaluation.controller;

import org.jupiterhub.websocketevaluation.record.Greeting;
import org.jupiterhub.websocketevaluation.record.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage helloMessage) throws InterruptedException {
        Thread.sleep(1000); // delay
        return new Greeting("Hello " + HtmlUtils.htmlEscape(helloMessage.name()));
    }
}
