package backjoon._2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = 1, start_index = 1, end_index = 1, count = 1;

        while (end_index != N) {
            if (sum == N) {
                end_index++;
                sum += end_index;
                count++;
            }
            else if (sum > N) {
                sum -= start_index;
                start_index++;
            }
            else {
                end_index++;
                sum += end_index;
            }
        }

        System.out.println(count);
    }
}