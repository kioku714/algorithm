package CodingInterview;

/**
 * 여러 개의 문자열로 구성된 배열이 주어졌을 때
 * 각각의 문자열을 먼저 정렬하고 전체 문자열을 사전순으로 재정렬
 */
public class Ex6_8 {
    String[] strArray = {"asdfdsf", "werwer", "vasdfd"};

    public String[] sort() {
        // strArray 배열의 값을 정렬
        arrayValueQuickSort();

        // strArray 배열 재정렬
        arrayQuickSort();

        return strArray;
    }

    private void arrayValueQuickSort () {
        for(int i = 0; i < strArray.length; i++) {
            for(int j = 0; j < strArray.length; j++) {
                strArray[0] = quickSort(strArray[0]);
            }
        }
    }

    private void arrayQuickSort() {

    }

    private String quickSort(String str) {
        return str;
    }

    public static void main(String[] args) {
        Ex6_8 ex = new Ex6_8();
        System.out.println(ex.sort());
    }
}
