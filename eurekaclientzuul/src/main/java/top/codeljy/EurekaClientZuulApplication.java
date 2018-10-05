package top.codeljy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @ClassName:EurekaClientZuulApplication
 * @Description:
 * @Author: ljy
 * @Date: 2018/9/28
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class EurekaClientZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientZuulApplication.class, args);
    }

}
