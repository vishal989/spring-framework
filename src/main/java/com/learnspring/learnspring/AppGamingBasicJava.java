package com.learnspring.learnspring;

import com.learnspring.learnspring.game.GameRunner;
import com.learnspring.learnspring.game.MarioGame;

public class AppGamingBasicJava {
     public static void main(String[] args){
          MarioGame marioGame = new MarioGame();
          GameRunner gameRunner = new GameRunner(marioGame);

          gameRunner.run();
     }
}
