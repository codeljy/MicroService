package top.codeljy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName:TestController
 * @Description:
 * @Author: ljy
 * @Date: 2018/9/27
 **/
@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String hi(String name) {
        return "hi "+name+", i am from port:"+port;
    }

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/rt")
    public String rt() {
        return restTemplate.getForObject("https://www.baidu.com/", String.class);
    }

}
