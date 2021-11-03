package com.example.ProyectoSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    //
    @GetMapping ("/")
    public String index() {
        return "Saludos a esa bandita loca, de parte de Carlos JavaAlberto";
    }
}
