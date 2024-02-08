package com.learnspring.learnspring;

import com.learnspring.learnspring.game.GameRunner;
import com.learnspring.learnspring.game.MarioGame;
import com.learnspring.learnspring.game.SuperContraGame;

public class AppGamingBasicJava {
     public static void main(String[] args){
          MarioGame marioGame = new MarioGame();
          var superContraGame = new SuperContraGame();
          GameRunner gameRunner = new GameRunner(marioGame);

          gameRunner.run();

     }
}
