/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videogame.logic;

/**
 *
 * @author gabriel
 */
public class VideoGame {
    private int code;
    private String title;
    private String console;
    private int numberPlayers;
    private String category;

    public VideoGame() {
    }

    public VideoGame(int code, String title, String console, int numberPlayers, String category) {
        this.code = code;
        this.title = title;
        this.console = console;
        this.numberPlayers = numberPlayers;
        this.category = category;
    }       

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConsole() {
        return console;
    }

    public void setConsole(String console) {
        this.console = console;
    }

    public int getNumberPlayers() {
        return numberPlayers;
    }

    public void setNumberPlayers(int numberPlayers) {
        this.numberPlayers = numberPlayers;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }        

    @Override
    public String toString() {
        return "VideoGame{" + "code=" + code + ", title=" + title + ", console=" + console + ", numberPlayers=" + numberPlayers + ", category=" + category + '}';
    }       
}
