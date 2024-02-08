package com.learnspring.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name, int age){};
record Address(String firstLine, String city){};

@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Ranga";
    }

    @Bean
    public int age(){
        return 19;
    }

    @Bean
    public Person person(){
        return new Person("Ravi", 29);
    }

    @Bean
    public Address address(){
        return new Address("Sharda Temple", "Itarsi");
    }
}
