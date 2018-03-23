package Codility;

import java.util.ArrayList;
import java.util.List;

/**
 * 정수의 2진 표현에서 가장 긴 0의 길이 반환.
 * 9   : 1001은 2
 * 529 : 1000010001은 4
 * 15  : 1111은
 * 20  : 10100은 1
 * 1041: 10000010001은 5
 */
public class BinaryGap2 {
    public int solution(int n) {
        int preIndex = -1;
        int currIndex = 0;
        int maxLength = 0;

        while(n >= 1) {
            if(n%2 == 1) {
                if (preIndex > -1)
                    maxLength = (currIndex - preIndex - 1 > maxLength) ? currIndex - preIndex - 1 : maxLength;
                preIndex = currIndex;
            }
            n /= 2;
            currIndex++;
        }

        return maxLength;
    }

    public static void main(String[] args) {
        System.out.println(new BinaryGap2().solution(1610612737));
    }
}
