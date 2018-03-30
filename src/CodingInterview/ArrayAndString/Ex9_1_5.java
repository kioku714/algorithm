package CodingInterview.ArrayAndString;

/**
 * 두 문자열을 같게 만들기 위한 편집 횟수가 1회 이내인지 확인
 *
 * pales, pale = true
 * pale, bale = true
 * pale, bake = false
 */

public class Ex9_1_5 {
    public boolean isOneEdit(String s1, String s2) {
        if( Math.abs(s1.length() - s2.length()) > 1 )  {
            return false;
        }

        String str1 = (s1.length() >= s2.length()) ? s1 : s2;
        String str2 = (s1.length() < s2.length())  ? s1 : s2;
        boolean foundDifference = false;

        if(str1.length() == str2.length()) {
            // 교체
            for(int i = 0; i < str1.length(); i++) {
                if(str1.charAt(i) != str2.charAt(i)) {
                    if(foundDifference) {
                        return false;
                    }
                    foundDifference = true;
                }
            }
        } else {
            // 삽입
            int index1 = 0;
            int index2 = 0;

            while(index1 < str1.length() && index2 < str2.length()) {
                if(str1.charAt(index1) != str2.charAt(index2)) {
                    if (index1 != index2) {
                        return false;
                    }
                    index2++;
                } else {
                    index1++;
                    index2++;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new Ex9_1_5().isOneEdit("pales", "pale"));
    }
}
