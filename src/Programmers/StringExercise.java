package Programmers;

/**
 * 단어를 입력 받아서 가운데 글자를 반환
 * 짝수일 경우 두 개의 글자 반환
 */
public class StringExercise {
    String getMiddle(String word){
        String result = "";

        if(word.length() % 2 == 0) {
            result = word.charAt(word.length()/2) + "";
        } else {
            result = word.charAt(word.length()/2 - 1) + "" +  word.charAt(word.length()/2);
        }

        return result;
    }
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void  main(String[] args){
        StringExercise se = new StringExercise();
        System.out.println(se.getMiddle("power"));
    }
}
