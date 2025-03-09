package backjoon._12891;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer input1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(input1.nextToken());  // DNA 문자열 길이
        int M = Integer.parseInt(input1.nextToken());  // 비밀번호 길이

        String DNA = br.readLine(); // 전체 DNA 문자열

        // A, C, G, T 개수
        StringTokenizer input2 = new StringTokenizer(br.readLine());
        int requiredA = Integer.parseInt(input2.nextToken());
        int requiredC = Integer.parseInt(input2.nextToken());
        int requiredG = Integer.parseInt(input2.nextToken());
        int requiredT = Integer.parseInt(input2.nextToken());

        System.out.println(countValidDNAPasswords(DNA, N, M, requiredA, requiredC, requiredG, requiredT));
    }

    /**
     * 검증
     * @param DNA : 문자열
     * @param N : 문자열 길이
     * @param M : 패스 워드 길이
     * @param requiredA : A 개수
     * @param requiredC : C 개수
     * @param requiredG : G 개수
     * @param requiredT : T 개수
     * @return
     */
    private static int countValidDNAPasswords(String DNA, int N, int M, int requiredA, int requiredC, int requiredG, int requiredT) {
        int count = 0;

        int countA = 0, countC = 0, countG = 0, countT = 0;

        for (int i = 0; i < M; i++) {
            char c = DNA.charAt(i);
            if (c == 'A') countA++;
            if (c == 'C') countC++;
            if (c == 'G') countG++;
            if (c == 'T') countT++;
        }

        // 검증
        if (isValid(countA, countC, countG, countT, requiredA, requiredC, requiredG, requiredT)) {
            count++;
        }

        for (int start = 1, end = M; end < N; start++, end++) {
            char removeChar = DNA.charAt(start - 1);
            if (removeChar == 'A') countA--;
            if (removeChar == 'C') countC--;
            if (removeChar == 'G') countG--;
            if (removeChar == 'T') countT--;

            char addChar = DNA.charAt(end);
            if (addChar == 'A') countA++;
            if (addChar == 'C') countC++;
            if (addChar == 'G') countG++;
            if (addChar == 'T') countT++;

            if (isValid(countA, countC, countG, countT, requiredA, requiredC, requiredG, requiredT)) {
                count++;
            }
        }

        return count;
    }

    /**
     * 비밀번호 검증
     */
    private static boolean isValid(int countA, int countC, int countG, int countT, int requiredA, int requiredC, int requiredG, int requiredT) {
        return countA >= requiredA && countC >= requiredC && countG >= requiredG && countT >= requiredT;
    }
}
