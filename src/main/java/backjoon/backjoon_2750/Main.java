package backjoon.backjoon_2750;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            list.add(Integer.valueOf(br.readLine()));
        }
        list.sort(Integer::compareTo); // 오름차순

        for(int i=0; i<N; i++){
            System.out.println(list.get(i));
        }

    }
}
