package com.learnspring.learnspring.game;

import org.springframework.stereotype.Component;

@Component
public class GameRunner{
    private final GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run(){
        System.out.println("Running game : " + game);
        game.down();
        game.left();
        game.up();
        game.right();
    }
}
