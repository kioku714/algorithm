import java.util.ArrayList;
import java.util.List;

/**
 * 약수의 합
 */
public class SumDivisor {
    public int sumDivisor(int num) {
        int answer = 0;
//        List<Integer> divisorList = new ArrayList<>();
        int root = (int) Math.floor(Math.sqrt(num));

        for(int i = 1; i <= root; i++) {
            if(num%i == 0) {
                if(i != num/i) {
                    answer += i + num/i;
                } else {
                    answer += i;
                }
            }
        }

//        for(int i = 0; i < divisorList.size(); i++) {
//            if(divisorList.get(i) != num/divisorList.get(i)) {
//                answer += divisorList.get(i) + num/divisorList.get(i);
//            } else {
//                answer += divisorList.get(i);
//            }
//        }

        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        SumDivisor c = new SumDivisor();
        System.out.println(c.sumDivisor(100));
    }
}
