package Codility;

import java.util.ArrayList;
import java.util.List;

/**
 * 정수의 2진 표현에서 가장 긴 0의 길이 반환.
 * 9   : 1001은 2
 * 529 : 1000010001은 4
 * 15  : 1111은 0
 * 20  : 10100은 1
 * 1041: 10000010001은 5
 */
public class BinaryGap {
    List<Integer> binaryList = new ArrayList<>();

    public int solution(int n) {
        binaryList = getBinary(n);
        int maxLength = 0;
        int preIndex = -1;

        for (int i = 0 ; i < binaryList.size(); i++) {
            if (binaryList.get(i) == 1) {
                if (preIndex > -1)
                    maxLength = (i - preIndex - 1 > maxLength) ? i - preIndex - 1 : maxLength;
                preIndex = i;
            }
        }

        return maxLength;
    }

    public List<Integer> getBinary(int n) {
        int dividend = n;
        while (dividend >= 1) {
            binaryList.add(dividend%2);
            dividend /= 2;
        }

        return binaryList;
    }

    public static void main(String[] args) {
        System.out.println(new BinaryGap().getBinary(1041));
        System.out.println(new BinaryGap().solution(1041));
    }
}
