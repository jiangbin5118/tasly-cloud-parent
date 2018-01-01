package com.tasly.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author jiangbin on 2017/8/15.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(EurekaServerApplication.class).web(true).run(args);
  }

}
