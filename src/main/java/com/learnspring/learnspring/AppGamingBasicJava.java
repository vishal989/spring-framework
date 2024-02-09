package com.learnspring.learnspring;

import com.learnspring.learnspring.game.GameRunner;
import com.learnspring.learnspring.game.GamingConsole;
import com.learnspring.learnspring.game.MarioGame;
import com.learnspring.learnspring.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learnspring.learnspring.game")
public class AppGamingBasicJava {

     public static void main(String[] args){

//          MarioGame marioGame = new MarioGame();
//          var superContraGame = new SuperContraGame(); // object creation
//          GameRunner gameRunner = new GameRunner(marioGame); //bj creation + wiring of dependencies
//          // game is a dependency of gamerunner
//
//          gameRunner.run();

          try(var context = new AnnotationConfigApplicationContext(AppGamingBasicJava.class)){
               context.getBean(GamingConsole.class).up();
               context.getBean(GameRunner.class).run();
          }


     }
}
