package CodingInterview;

/**
 * 문자열로 나타낼 수 있는 순열 개수
 */
public class Ex6_12 {
    void permutation(String str) {
       permutation(str, "");
    }

    void permutation(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0, i) + str.substring(i + 1);
                String tmp = prefix + str.charAt(i);
                permutation(rem, tmp);
            }
        }
    }

    public static void main(String[] args) {
        Ex6_12 ex = new Ex6_12();
        ex.permutation("abc");
    }
}
