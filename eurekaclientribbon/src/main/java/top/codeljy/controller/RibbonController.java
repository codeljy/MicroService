package top.codeljy.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName:RibbonController
 * @Description:
 * @Author: ljy
 * @Date: 2018/9/28
 **/
@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${client.url}")
    private String clientUrl;

    @GetMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi() {
        return restTemplate.getForObject(clientUrl+"hi?name=ljy", String.class);
    }

    public String hiError() {
        return "hi,ljy,sorry,error!";
    }

}
