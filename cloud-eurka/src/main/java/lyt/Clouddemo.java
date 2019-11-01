package lyt;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableEurekaServer
public class Clouddemo {
    public static void main(String[] args) {
        SpringApplication.run(Clouddemo.class, args);
    }
}
