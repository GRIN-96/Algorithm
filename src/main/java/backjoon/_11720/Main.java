package backjoon._11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String number = br.readLine();
        String[] split = number.split("");
        int result = 0;

        for(int i=0; i<N; i++){
            result += Integer.parseInt(split[i]);
        }

        System.out.println(result);
    }
}