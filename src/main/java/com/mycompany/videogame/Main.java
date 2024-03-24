/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.videogame;

import java.util.ArrayList;
import java.util.List;
import videogame.logic.VideoGame;

/**
 *
 * @author gabriel
 */
public class Main {

    public static void main(String[] args) {
        List<VideoGame> videoGameList = new ArrayList<>();
        VideoGame game1 = new VideoGame(123, "Banjo Kazooie", "Nintendo 64", 4, "Platform");
        VideoGame game2 = new VideoGame(456, "Mario Party 3", "Nintendo 64", 4, "Platform");
        VideoGame game3 = new VideoGame(789, "Age of Empires II", "PC", 1, "Strategy");
        VideoGame game4 = new VideoGame(101, "Counter Strike 1.6", "PC", 1, "Shooter");
        VideoGame game5 = new VideoGame(100, "Mario Kart 64", "Nintendo 64", 2, "Platform");
        
        videoGameList.add(game1);
        videoGameList.add(game2);
        videoGameList.add(game3);
        videoGameList.add(game4);
        videoGameList.add(game5);
        
        for (VideoGame game : videoGameList) {
            System.out.println("Title: " + game.getTitle() + " Console: " + game.getConsole() + " Number of Players: " + game.getNumberPlayers());
        }
        
        System.out.println("----------");
        game1.setTitle("Banjo Kazooie II");
        game1.setNumberPlayers(1);
        game5.setTitle("Super Mario Kart 64");
        game5.setNumberPlayers(4);
        
        for (VideoGame game : videoGameList) {
            if (game.getConsole().equals("Nintendo 64")) {
                System.out.println(game.toString());
            }
        }
    }
}
