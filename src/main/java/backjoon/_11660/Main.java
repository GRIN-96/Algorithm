package backjoon._11660;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int Q = Integer.parseInt(input[1]);

        // 배열 등록
        int [][] matrix = new int[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            String[] nums = br.readLine().split(" ");
            for (int j = 1; j <= nums.length; j++) {
                matrix[i][j] = Integer.parseInt(nums[j-1]);
            }
        }

        // 2차원 배열 합 계산
        int [][] matrixSum = new int[N+1][N+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                matrixSum[i][j] = matrixSum[i][j-1] + matrixSum[i-1][j] - matrixSum[i-1][j-1] + matrix[i][j];
            }
        }

        // 연산
        for (int i = 1; i <= Q; i++) {
            String[] nums = br.readLine().split(" ");
            int x1 = Integer.parseInt(nums[0]);
            int y1 = Integer.parseInt(nums[1]);
            int x2 = Integer.parseInt(nums[2]);
            int y2 = Integer.parseInt(nums[3]);

            System.out.println(matrixSum[x2][y2] - matrixSum[x1-1][y2] - matrixSum[x2][y1-1] + matrixSum[x1-1][y1-1]);
        }
    }
}