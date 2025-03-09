package backjoon._1940;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(input1.nextToken());
        StringTokenizer input2 = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(input2.nextToken());

        StringTokenizer input3 = new StringTokenizer(br.readLine());
        int[] list = new int[N];
        for (int i = 0; i < N; i++) {
            list[i] = Integer.parseInt(input3.nextToken());
        }

        Arrays.sort(list);

        int i = 0, j = N - 1, count = 0;

        while (i < j) {
            int sum = list[i] + list[j];
            if (sum < M) {
                i++;
            } else if (sum > M) {
                j--;
            } else {
                i++;
                j--;
                count++;
            }
        }

        System.out.println(count);
    }

}
