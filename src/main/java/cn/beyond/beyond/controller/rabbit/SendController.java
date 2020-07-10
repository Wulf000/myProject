package cn.beyond.beyond.controller.rabbit;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.beyond.beyond.config.rabbit.FirstSender;

@RestController
@RequestMapping("/rabbit")
public class SendController {

	
	@Autowired
    private FirstSender firstSender;
 
    @GetMapping("/send")
    public String send(String message){
        String uuid = UUID.randomUUID().toString();
        firstSender.send(uuid,message);
        return uuid;
    }
}
