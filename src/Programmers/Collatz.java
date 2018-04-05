package Programmers;

/**
 * 콜라츠 추측
 *
 * 입력된 수가 짝수라면 2로 나누고, 홀수라면 3을 곱하고 1을 더한 다음,
 * 결과로 나온 수에 같은 작업을 1이 될 때까지 반복할 경우 모든 수가 1이 된다 추측.
 * 몇 번만에 1이 나오는지 반. 500번을 반복해도 1이 되지 않는다면 –1을 반환.
 *
 * 입력된 수가 6이라면 6→3→10→5→16→8→4→2→1 이 되어 총 8번 만에 1이 됨
 *
 */
public class Collatz {
    public int collatz(int num) {
        int answer = 0;
        // Integer.MAX_VALUE를 넘는 수가 발생하므로 long으로 변환
        long number = num;

        while(number != 1) {
            if (answer == 500) return -1;
            //if (number > Integer.MAX_VALUE) System.out.println(number);
            number = (number % 2 == 0) ? number / 2 : number * 3 + 1;
            answer++;
        }

        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Collatz c = new Collatz();
        int ex = 704623; // 704623 939497
        System.out.println(c.collatz(ex));
    }
}
