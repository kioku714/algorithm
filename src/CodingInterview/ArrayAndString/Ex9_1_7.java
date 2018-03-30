package CodingInterview.ArrayAndString;

import java.util.Arrays;

/**
 * N * N 행렬 90도 회전
 *
 * 1 2 -> 3 1
 * 3 4    4 2
 *
 * 1 2 3 -> 7 4 1
 * 4 5 6    8 5 2
 * 7 8 9    9 6 3
 */

public class Ex9_1_7 {
    public String rotate(int[][] matrix) throws Exception {
        if (matrix.length == 0) throw new Exception("행렬의 길이가 0입니다.");
        for(int i = 0; i < matrix.length; i++) {
            if(matrix.length != matrix[i].length) throw new Exception("N * N 행렬이 아닙니다");
        }

        int n = matrix.length;
        for (int layer = 0; layer < n/2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                // 위쪽 저장
                int top = matrix[first][i];
                // 왼쪽 > 위쪽
                matrix[first][i] = matrix[last - offset][first];
                // 아래쪽 > 왼쪽
                matrix[last - offset][first] = matrix[last][last - offset];
                // 오른쪽 > 아래쪽
                matrix[last][last - offset] = matrix[i][last];
                // 위쪽 > 오른쪽
                matrix[i][last] = top;
            }
        }

        return Arrays.deepToString(matrix);
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        try {
            System.out.println(new Ex9_1_7().rotate(nums));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
