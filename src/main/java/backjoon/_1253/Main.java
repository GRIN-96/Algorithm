package backjoon._1253;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 정렬 O(N log N)

        int result = findGoodNumber(arr, N);

        System.out.println(result);
    }

    /**
     * 좋은 수 찾기
     * @param arr : 숫자 배열
     * @param N : 배열 length
     * @return : 좋은 수 총 개수
     */
    private static int findGoodNumber(int[] arr, int N) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            int target = arr[i];
            int a = 0, b = arr.length - 1;

            while (a < b) {
                if (a == i) {
                    a++;
                    continue;
                }
                if (b == i) {
                    b--;
                    continue;
                }

                int sum = arr[a] + arr[b];

                if (sum == target) {
                    count++;
                    break;
                } else if (sum < target) {
                    a++;
                } else {
                    b--;
                }
            }
        }

        return count;
    }
}
