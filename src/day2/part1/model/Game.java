package day2.part1.model;

public class Game {
    private final int id;
    private int blue;
    private int red;
    private int green;

    public Game(int id){
        this.id = id;
        this.blue = 0;
        this.red = 0;
        this.green = 0;
    }

    public int getId() {
        return id;
    }


    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }
}
