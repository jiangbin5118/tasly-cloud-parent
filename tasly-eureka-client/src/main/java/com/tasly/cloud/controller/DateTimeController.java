package com.tasly.cloud.controller;

import java.util.Date;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangbin on 2017/8/15.
 */
@RestController
public class DateTimeController {

  private static final Logger LOG = LoggerFactory.getLogger(DateTimeController.class);

  @Autowired
  private DiscoveryClient discoveryClient;

  @Autowired
  private Registration registration;

  @GetMapping("dateTime")
  public String getCurrentDateTime() {
    List<ServiceInstance> serviceList = discoveryClient.getInstances(registration.getServiceId());
    for (ServiceInstance serviceInstance : serviceList) {
      LOG.info("/dateTime {}, {}", serviceInstance.getHost(), serviceInstance.getPort());
    }
    return new Date().toString();
  }

}
