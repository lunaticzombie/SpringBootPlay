package com.nijamrit.SpringBootPlay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    //@Autowired // Field injection
    private Computer computer;

    // Constructor injection is by default
//    public Dev(Computer computer) { this.computer = computer; }

    @Autowired // Setter injection
    @Qualifier("laptop")  // either can put @Primary along with @Component OR qualify with bean name with @Autowired
    public void setLaptop(Computer computer) {
        this.computer = computer;
    }
    
    public void build() {
        System.out.println("Dev Building Awsome Project...");
        computer.compile();
    }
}