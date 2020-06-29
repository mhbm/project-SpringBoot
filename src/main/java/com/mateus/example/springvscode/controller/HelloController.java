package com.mateus.example.springvscode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * HelloController
 */
@RestController
public class HelloController {

  @GetMapping(value="/")
  public String getMethodName() {
    int testeAAAA = 10;

    testeAAAA += 20;

    System.out.println("O valor de teste é " +  testeAAAA);
      return "OLá mundo VSCODE!";
  }
  
  
  
}