package ru.simplegroup.wellsserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class WellsServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WellsServerApplication.class, args);
    }

}
