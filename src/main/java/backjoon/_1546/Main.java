package backjoon._1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String number = br.readLine();
        String[] split = number.split(" ");
        int maxScore = 0;
        int sumScore = 0;

        for(int i=0; i<N; i++){
            int score = Integer.parseInt(split[i]);
            maxScore = Math.max(maxScore, score);
            sumScore += score;
        }

        System.out.println(sumScore * 100 / maxScore / N);
    }
}