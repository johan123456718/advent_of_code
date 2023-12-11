package day2.part2;

import day2.part1.model.Color;
import day2.part1.model.Game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        try {
            File file = new File("C:\\Dev\\AdventOfCode\\AdventOfCode2023\\src\\Day2\\part2\\input");
            Scanner reader = new Scanner(file);
            int result = 0;
            List<Game> games = new ArrayList<>();

            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] tmp = data.split("[:]");
                int gameNum = Integer.parseInt(tmp[0].replace("Game", "").trim());

                Game game = new Game(gameNum);
                calculateCubes(game, tmp);
                games.add(game);
            }

            for(Game game : games){
                int blue = game.getBlue();
                int green = game.getGreen();
                int red = game.getRed();

                result += (blue * green * red);

            }
            System.out.println(result);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }

    private static void calculateCubes(Game game, String[] tmp) {
        for(String rounds : tmp[1].split(";")){
            for(String cubes : rounds.split(",")){
                String[] parts = cubes.trim().split("\\s+(?=[a-zA-Z])");
                if(Color.getColor(parts[1]).equals(Color.BLUE)){
                    int newBlue = Integer.parseInt(parts[0]);
                    if(newBlue > game.getBlue()){
                        game.setBlue(newBlue);
                    }
                }

                if(Color.getColor(parts[1]).equals(Color.GREEN)){
                    int newGreen = Integer.parseInt(parts[0]);
                    if(newGreen > game.getGreen()){
                        game.setGreen(newGreen);
                    }
                }

                if(Color.getColor(parts[1]).equals(Color.RED)){
                    int newRed = Integer.parseInt(parts[0]);
                    if(newRed > game.getRed()){
                        game.setRed(newRed);
                    }
                }
            }
        }
    }
}
