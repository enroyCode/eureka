package com.enroy.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication extends SpringBootServletInitializer {
  public static void main(String[] args) {
    SpringApplication.run(EurekaApplication.class, args);
    System.out.println("ヾ(◍°∇°◍)ﾉﾞ    bootdo启动成功      ヾ(◍°∇°◍)ﾉﾞ\n" +
                               " ______                    _   ______            \n" +
                               "|_   _ \\                  / |_|_   _ `.          \n" +
                               "  | |_) |   .--.    .--. `| |-' | | `. \\  .--.   \n" +
                               "  |  __'. / .'`\\ \\/ .'`\\ \\| |   | |  | |/ .'`\\ \\ \n" +
                               " _| |__) || \\__. || \\__. || |, _| |_.' /| \\__. | \n" +
                               "|_______/  '.__.'  '.__.' \\__/|______.'  '.__.'  ");
  }

  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    // 注意这里要指向原先用main方法执行的Application启动类
    return builder.sources(EurekaApplication.class);
  }
}
