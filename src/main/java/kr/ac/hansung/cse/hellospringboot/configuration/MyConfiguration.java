package kr.ac.hansung.cse.hellospringboot.configuration;

import kr.ac.hansung.cse.hellospringboot.service.MyService;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "app")
@Data
public class MyConfiguration {

    private String professor; //app.professor 빈으로 등록
    private String course; //app.course 빈으로 등록

    @Bean
    public MyService myService(){
        return new MyService(); //MyService가 bean으로 등록
    }
}
