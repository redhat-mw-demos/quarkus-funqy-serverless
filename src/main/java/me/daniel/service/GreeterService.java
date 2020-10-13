package me.daniel.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreeterService {
    
    public String greeter(String name) {
        return "Welcome, " + name + " for Serverless using Quarkus Funqy!!";
    }
}
