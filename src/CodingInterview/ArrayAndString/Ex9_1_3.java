package CodingInterview.ArrayAndString;

import java.util.Arrays;

/**
 * 문자열에 있는 모든 공백을 %20으로 변환
 */

public class Ex9_1_3 {
    public String replace(String str, int length) {
//        char[] chars = str.toCharArray();
//        String result = "";
//
//        for(int i = 0; i < chars.length; i++) {
//            if(chars[i] == ' ') {
//                result += "%20";
//            } else {
//                result += chars[i];
//            }
//        }

        char[] chars = new char[100];
        char[] strs = str.toCharArray();

        for (int i = 0; i < strs.length; i++) {
            chars[i] = strs[i];
        }

        replaceSpaces(chars, length);

        return Arrays.toString(chars);
    }

    public void replaceSpaces(char[] chars, int length) {
        int spaceCount = 0, index, i = 0;
        for (i = 0; i < length; i++) {
            if (chars[i] == ' ') {
                spaceCount++;
            }
        }
        index = length + spaceCount * 2;
        if (length < chars.length) chars[length] = '\0';
        for (i = length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                chars[index - 1] = '0';
                chars[index - 2] = '2';
                chars[index - 3] = '%';
                index -= 3;
            } else {
                chars[index - 1] = chars[i];
                index--;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Ex9_1_3().replace("Mr John Smith", 13));
    }
}
