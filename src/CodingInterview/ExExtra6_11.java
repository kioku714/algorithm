package CodingInterview;

/**
 * 문자열로 나타낼 수 있는 순열 개수
 */
public class ExExtra6_11 {
    // 알파벳 개수
    int numChars = 26;

    void printSortedStrings(int remaining) {
        printSortedStrings(remaining, "");
    }

    void printSortedStrings(int remaining, String prefix) {
        if (remaining == 0) {
            if (isInOrder(prefix)) {
                System.out.println(prefix);
            }
        } else {
            for (int i = 0; i < numChars; i++) {
                char c = ithLetter(i);
                printSortedStrings(remaining - 1, prefix + c);
            }
        }
    }

    private boolean isInOrder(String s) {
        for (int i = 1; i < s.length(); i++) {
            int prev = ithLetter(s.charAt(i - 1));
            int curr = ithLetter(s.charAt(i));
            if (prev > curr) {
                return false;
            }
        }
        return true;
    }

    private char ithLetter(int i) {
        return (char) (((int) 'a') + i);
    }

    public static void main(String[] args) {
        ExExtra6_11 ex = new ExExtra6_11();
        ex.printSortedStrings(3);
    }
}
