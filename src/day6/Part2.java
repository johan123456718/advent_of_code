package day6;

import java.math.BigInteger;

public class Part2 {
    public static void main(String[] args) {
        long result = timeToWinTheRecord(71530, new BigInteger("940200"));
        System.out.println(result);
        result = timeToWinTheRecord(47707566, new BigInteger("282107911471062"));
        System.out.println(result);
    }

    public static long timeToWinTheRecord(long time, BigInteger record){
        long win = 0;

        for (int i = 0; i < time; i++) {
            BigInteger timeLeft = BigInteger.valueOf(time - i);
            BigInteger distance = timeLeft.multiply(BigInteger.valueOf(i));

            if (distance.compareTo(record) >  0) {
                win++;
            }
        }

        return win;
    }
}
