package com.prox.cent.learn_spring_security.greeting;

import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

  @GetMapping
  public Greeting greet() {
    Greeting greeting = new Greeting();
    greeting.setId(new Date().getTime());
    greeting.setMessage("Hello, World!");
    return greeting;
  }

}
