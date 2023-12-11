package day6;

public class Part1 {
    public static void main(String[] args) {
        int result = timeToWinTheRecord(47, 282) * timeToWinTheRecord(70, 1079) * timeToWinTheRecord(75, 1147) * timeToWinTheRecord(66, 1062);
        System.out.println(result);
    }

    public static int timeToWinTheRecord(int time, int record){
        return timeToWinTheRecord(0, time, record, 0);
    }

    private static int timeToWinTheRecord(int i, int time, int record, int win){
        if(i == time){
            return win;
        }
        int timeLeft = time - i;
        int distance = i * timeLeft;

        if(distance > record){
            win++;
        }

        return timeToWinTheRecord(i + 1, time, record, win);
    }
}
