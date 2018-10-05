package top.codeljy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.codeljy.data.EurekaClientFeign;

/**
 * @ClassName:HiController
 * @Description:
 * @Author: ljy
 * @Date: 2018/9/28
 **/
@RestController
public class HiController {

    @Autowired
    EurekaClientFeign eurekaClientFeign;

    @GetMapping("/hi")
    public String hi() {
        System.out.println("进来了");
        return eurekaClientFeign.sayHiFromClientEureka("ljy");
    }

}
