package com.tasly.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jiangbin on 2017/12/29
 */
@RestController
public class ConsumerController {

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("dateTime-consumer")
  public String consumerCurrentDateTime() {
    return restTemplate.getForEntity("http://DATETIME-SERVICE/dateTime", String.class).getBody();
  }

}
