package CodingInterview.ArrayAndString;

/**
 * 입력된 문자열이 회문 순열인지 확인
 * 회문이랑 앞으로 읽으나 뒤로 읽으나 같은 단어나 구절을 말함
 * 순열은 문자열을 재배치 하는 것을 말함
 *
 * tact coa의 회문순열 예
 *  1. "tac"o "cat"
 *  2. "atc"o "cta"
 */

public class Ex9_1_4 {
    public boolean isPermutationOfPallindrome(String str) {
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

        for (char c : str.toCharArray()) {
            int num = getCharNumber(c);
            if (num != -1) {
                table[num]++;
                if (table[num] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }

        return countOdd<= 1;
    }

    private int getCharNumber(char c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int value = Character.getNumericValue(c);
        if(a <= value && value <= z) {
            return value - a;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Ex9_1_4().isPermutationOfPallindrome("tact coa"));
    }
}
