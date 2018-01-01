package com.tasly.cloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author jiangbin on 2017/8/15.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DiscoveryClientApplication {

  public static void main(String[] args) {
    new SpringApplicationBuilder(
        DiscoveryClientApplication.class).web(true).run(args);
  }
}
