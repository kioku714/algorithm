package Programmers;

/**
 * 하샤드 수 구하기
 *
 * x가 x의 자릿수의 합으로 나누어지는 수.
 * 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수임.
 */
public class HarshadNumber {
    public boolean isHarshad(int num){
        String str = num + "";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }

        return num % sum == 0;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        HarshadNumber sn = new HarshadNumber();
        System.out.println(sn.isHarshad(18));
    }
}
