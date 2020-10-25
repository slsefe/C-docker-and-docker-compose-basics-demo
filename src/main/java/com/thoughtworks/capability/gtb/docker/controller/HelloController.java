package com.thoughtworks.capability.gtb.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author itutry
 * @create 2020-05-25_16:52
 */
@RestController
public class HelloController {

  @GetMapping("/hello")
  public String hello() {
    return "Hello Docker!";
  }
}
