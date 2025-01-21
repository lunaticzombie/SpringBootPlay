package com.nijamrit.SpringBootPlay;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // default name = desktop
//@Component("desktopCustomName") // Custom name. We can get bean by Type, or by name. Also we can use name in Qualifier with Autowired
//@Primary
//@Scope(value = "prototype") // Compnent by default creates a Singelton pattern and creates object even when it is not used in our code
                            // @Scope annotation is used to create a prototype pattern and creates object only when its used
public class Desktop implements Computer {
    @Override
    public void compile() {
        System.out.println("Compiling on Desktop...");
    }
}
