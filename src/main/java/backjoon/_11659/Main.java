package backjoon._11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int Q = Integer.parseInt(input[1]);

        String number = br.readLine();
        String[] split = number.split(" ");
        int[] arr = new int[N];
        int sum = 0;

        for(int i=0; i<N; i++){
            sum += Integer.parseInt(split[i]);
            arr[i] = sum;
        }

        for(int i=0; i<Q; i++) {
            String[] question = br.readLine().split(" ");
            int standard = Integer.parseInt(question[0]) - 1;
            int target = Integer.parseInt(question[1]) - 1;

            System.out.println(arr[target] - (standard > 0 ? arr[standard - 1] : 0) );
        }
    }
}