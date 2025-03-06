package backjoon._2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = 1, start = 1, end = 1, count = 1;

        while (end < N) {
            if (sum == N) {
                count++;
            }

            if (sum >= N) {
                sum -= start;
                start++;
            } else {
                end++;
                sum += end;
            }
        }

        System.out.println(count);
    }
}
