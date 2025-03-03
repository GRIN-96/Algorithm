import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append(N-543);

        System.out.println(sb);
    }
}