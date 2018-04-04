package Programmers;

public class Fibonacci {
    public long fibonacci(int num) {
        long[] numbers = new long[num + 1];
        numbers[0] = 0;
        numbers[1] = 1;

        for(int i = 2; i <= num; i++) {
            numbers[i] = numbers[i - 1] + numbers[i - 2];
        }

        return numbers[num];
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Fibonacci c = new Fibonacci();
        int testCase = 3;
        System.out.println(c.fibonacci(testCase));
    }
}