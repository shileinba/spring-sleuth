package com.apaas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import zipkin.server.internal.EnableZipkinServer;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @Author: shilei
 * @DateTime: 2022/6/22 17:37
 * @Description : TODO
 */
@SpringBootApplication
@EnableZipkinServer
public class ServerZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerZipkinApplication.class, args);
    }
}
