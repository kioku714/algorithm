package Programmers;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;

/**
 * 최대공약수와 최소공배수
 */
public class TryHelloWorld {
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
        // int dividend = (a >= b) ? a : b;
        // int divisor = (a < b) ? a : b;
        // int remainder = dividend%divisor;

        // while(true) {
        //   if(remainder == 0) {
        //     answer[0] = divisor;
        //     break;
        //   } else {
        //     dividend = divisor;
        //     divisor = remainder;
        //     remainder = dividend%divisor;
        //   }
        // }

        answer[0] = gcd(a, b);
        answer[1] = (a*b)/answer[0];

        return answer;
    }

    public static int gcd(int dividend, int divisor) {
        return (dividend%divisor == 0) ? divisor : gcd(divisor, dividend%divisor);
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
//        long startTIme = System.currentTimeMillis();
        Instant start = Instant.now();
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(24, 32452462)));
//        System.out.println(System.currentTimeMillis() - startTIme);
        System.out.println(Duration.between(Instant.now(), start));
    }
}