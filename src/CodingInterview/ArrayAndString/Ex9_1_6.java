package CodingInterview.ArrayAndString;

/**
 * 문자열 압축
 *
 * aabcccccaaa  = a2b1c5a3
 * 만약 압축된 문자열이 기존 문자열 길이보다 길다면 기존 문자열 반환
 */

public class Ex9_1_6 {
    public String compress(String str) {
        String compressedStr = "";
        int count = 0;

        for (int i = 1; i < str.length(); i++) {
            count++;

            if (i + 1 >= str.length() || str.charAt(i - 1) != str.charAt(i)) {
                compressedStr += str.charAt(i - 1) + "" + count;
                count = 0;
            }
        }

        return (str.length() < compressedStr.length()) ? str : compressedStr;
    }

    public static void main(String[] args) {
        System.out.println(new Ex9_1_6().compress("aabcccccaaa"));
    }
}
