package Programmers;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * array의 각 element 중 divisor로 나누어 떨어지는 값만 포함하는 새로운 배열을 만들어서 반환
 */
public class Divisible {
    public int[] divisible(int[] array, int divisor) {
        List<Integer> intList = new ArrayList<>();
        for(int item : array) {
            if(item % divisor == 0) {
                intList.add(item);
            }
        }

        int[] ret = new int[intList.size()];
        for(int i = 0; i < ret.length; i++) {
            ret[i] = intList.get(i);
        }

        return ret;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Divisible div = new Divisible();
        int[] array = {5, 9, 7, 10};
        System.out.println(Arrays.toString( div.divisible(array, 5) ));

    }
}
