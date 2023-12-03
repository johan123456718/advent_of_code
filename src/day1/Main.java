package day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{
            File file = new File("C:\\Users\\johan\\Documents\\dev\\AdventOfCode\\2023\\src\\day1\\inputs");
            Scanner reader = new Scanner(file);
            int result = 0;

            while(reader.hasNextLine()){
                String data = reader.nextLine().replaceAll("[a-zA-Z]", "");
                if(data.length() >= 2) {
                    String sb = String.valueOf(data.charAt(0)) + data.charAt(data.length() - 1);
                    int fullDigit = Integer.parseInt(sb);
                    result += fullDigit;
                }else if(data.length() == 1){
                    String sb = String.valueOf(data.charAt(0)) + data.charAt(0);
                    int fullDigit = Integer.parseInt(sb);
                    result += fullDigit;
                }
            }
            System.out.println(result);
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
