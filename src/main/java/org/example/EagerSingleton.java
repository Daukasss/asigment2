package org.example;
import org.springframework.stereotype.Component;
@Component
public class EagerSingleton {
    public EagerSingleton() {
        System.out.println("EagerSingleton work");
    }
}
