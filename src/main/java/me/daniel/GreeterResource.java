package me.daniel;

import javax.inject.Inject;

import io.quarkus.funqy.Funq;
import me.daniel.service.GreeterService;

public class GreeterResource {

    @Inject
    GreeterService service;

    @Funq
    public String hello() {
        return "welcome!";
    }

    @Funq("hybrid")
    public String greeter(String name) {
        return service.greeter(name);
    }
}