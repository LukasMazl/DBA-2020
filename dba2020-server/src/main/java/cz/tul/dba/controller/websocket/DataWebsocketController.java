package cz.tul.dba.controller.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class DataWebsocketController {

    @MessageMapping("/ws")
    @SendTo("/topics/all")
    public String value() {
        return "ahoj";
    }
}
