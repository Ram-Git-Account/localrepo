package com.scalar.SampleDemo;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
 public class HelloController {

    //GET call -> /hello -> Hello World with HTTP status code -> 200 OK

    @GetMapping("/hello")
    public ResponseEntity helloworld(){
       // String hello = "Hello World";
        Person p = new Person("Root",66,"Hello world");

        //return ResponseEntity.ok(hello);
        return ResponseEntity.ok(p);
    }

}
