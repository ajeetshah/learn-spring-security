package com.prox.cent.learn_spring_security.foo;

import java.util.Date;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foo")
public class FooController {

  @GetMapping
  public Foo foo() {
    Foo foo = new Foo();
    foo.setId(new Date().getTime());
    foo.setName("John Doe");
    return foo;
  }

}
