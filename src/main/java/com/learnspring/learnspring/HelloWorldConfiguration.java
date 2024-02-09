package com.learnspring.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


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
    public Person person2(){
        return new Person(name(), age());
    }

    @Bean
    @Primary
    public Address address(){
        return new Address("Sharda Temple", "Itarsi");
    }

    @Bean
    public Address address1(){
        return new Address("Sharda Temple1", "Itarsi");
    }
}
