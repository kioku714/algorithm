/**
 * str 매개변수에서 최소값과 최대값을 찾아 "최소값 최대값" 형태로 출력
 */
public class GetMinMaxString {
    public String getMinMaxString(String str) {
        String[] strings = str.split(" ");
        int min = Integer.parseInt(strings[0]);
        int max = Integer.parseInt(strings[0]);

        for(int i = 0; i < strings.length; i++) {
            int num = Integer.parseInt(strings[i]);

            if(num < min) min = num;
            if(num > max) max = num;
        }

        return min + " " + max;
    }

    public static void main(String[] args) {
        String str = "-20 2 3 15";
        GetMinMaxString minMax = new GetMinMaxString();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
    }
}
