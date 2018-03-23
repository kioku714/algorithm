package CodingInterview;

/**
 * 입력받은 문자열에 중복이 있는지 확인
 */
public class Ex9_1_1 {
    public Boolean isDuplicate(String str) {
//        for (int i = 0; i < str.length(); i++) {
//            for (int j = 0; j < str.length(); j++) {
//                if(str.charAt(i) == str.charAt(j)) {
//                    return true;
//                }
//            }
//        }

        if(str.length() > 128) return true;
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            char val = str.charAt(i);
            if(char_set[val]) {
                return true;
            }
            char_set[val] = true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Ex9_1_1().isDuplicate("attribute"));
    }
}
