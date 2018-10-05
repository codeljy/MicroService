package top.codeljy.data;

import static java.util.concurrent.TimeUnit.SECONDS;

import feign.Retryer;
import feign.Retryer.Default;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName:FeignConfig
 * @Description:
 * @Author: ljy
 * @Date: 2018/9/28
 **/
@Configuration
public class FeignConfig {

    @Bean
    public Retryer feignRetryer() {
        return new Default(100, SECONDS.toMillis(1), 5);
    }

}
