package CodingInterview.ArrayAndString;

import java.util.Arrays;

/**
 * 입력받은 2개의 문자열이 순열관계인지 확인
 */

public class Ex9_1_2 {
    public boolean isPermutation(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        } else {

            return sort(str1).equals(sort(str2));
        }
    }

    public String sort(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        System.out.println(Arrays.toString(chars));

        return Arrays.toString(chars);
    }

    public static void main(String[] args) {
        System.out.println(new Ex9_1_2().isPermutation("dog", "god"));
    }
}
