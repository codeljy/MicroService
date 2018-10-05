package top.codeljy.data;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName:DataConfig
 * @Description:
 * @Author: ljy
 * @Date: 2018/9/28
 **/
@SpringBootConfiguration
public class DataConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
