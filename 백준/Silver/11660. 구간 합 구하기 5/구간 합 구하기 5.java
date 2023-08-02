import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N+1][N+1];
        for(int i=1; i<=N; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            for(int j=1; j<=N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken()) + arr[i][j-1];
            }
        }

        for(int i=2; i<=N; i++) {
            for(int j=1; j<=N; j++) {
                arr[i][j] += arr[i-1][j];
            }
        }

        for(int k=0; k<M; k++) {
            st = new StringTokenizer(in.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            System.out.println(arr[x2][y2] - arr[x2][y1-1] - arr[x1-1][y2] + arr[x1-1][y1-1]);
        }
    }
}