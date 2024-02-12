package com.business;

import com.business.stuff.BusinessCalculationService;
import com.learnspring.learnspring.AppGamingBasicJava;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.business.stuff")

public class Main {
    public static void main(String[] args){
//        MongoDBDataService MDB = new MongoDBDataService();
//        BusinessCalculationService BCS = new BusinessCalculationService(MDB);
//        System.out.println(BCS.findMax());

        try(var context = new AnnotationConfigApplicationContext(Main.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
