package com.study.helloworld.controller;

import com.study.helloworld.entity.Person;
import com.study.helloworld.projection.PersonProjection;
import com.study.helloworld.service.AuthService;
import com.study.helloworld.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class MainController {

    private final PersonService personService;

    private final AuthService authService;

    @GetMapping("home")
    public PersonProjection home(){
        return personService.getAllCredsProgection();
    }
}
