package top.codeljy.data;

import org.springframework.stereotype.Component;

/**
 * @ClassName:HiHystrix
 * @Description:
 * @Author: ljy
 * @Date: 2018/9/28
 **/
@Component
public class HiHystrix implements EurekaClientFeign{

    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi,ljy,sorry,error!";
    }
}
