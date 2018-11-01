package edu.eci.arsw.collabpaint;

import edu.eci.arsw.collabpaint.model.Point;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class CanvasController {


    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Point greeting(Point punto) throws Exception {
        Thread.sleep(1000); // simulated delay
        return punto;
    }

}
