import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        for(int tc=0; tc<T; tc++) {
            st = new StringTokenizer(in.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[][] D = new int[M+1][N+1];
            for(int i=0; i<=M; i++) {
                for(int j=0, end=Math.min(i, N); j<=end; j++) {
                    if(j==0 || j==M) D[i][j] = 1;
                    else D[i][j] = D[i-1][j-1] + D[i-1][j];
                }
            }
            sb.append(D[M][N]).append("\n");
        }
        System.out.println(sb.toString());
    }
}