import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(in.readLine());
        for (int tc = 1; tc <= T; tc++) {

            int N = Integer.parseInt(in.readLine());
            int M = Integer.parseInt(in.readLine());

            boolean[][] arr = new boolean[N + 1][N + 1];
            StringTokenizer st;
            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(in.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                arr[a][b] = true;
                for (int j = 1; j < N + 1; j++) {
                    if (j != a && arr[j][a]) {
                        arr[j][b] = true;
                    }
                }
            }

            int cnt = 0;
            for (int i = 1; i <= N; i++) {
                boolean flag = true;
                a: for (int j = 1; j <= N; j++) {
                    if (i != j && !arr[i][j]) {
                        if (!arr[j][i]) {
                            flag = false;
                            break a;
                        }
                    }
                }
                if (flag)
                    cnt++;
            }

            System.out.printf("#%d %d%n", tc, cnt);
        }
    }
}