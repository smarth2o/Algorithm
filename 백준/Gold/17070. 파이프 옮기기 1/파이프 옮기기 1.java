import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());

        int[][] map = new int[N+1][N+1];
        StringTokenizer st;
        for(int i=1; i<=N; i++) {
            st = new StringTokenizer(in.readLine());
            for(int j=1; j<=N; j++) {
                if (st.nextToken().equals("1")) map[i][j] = 1;
            }
        }

        int[][][] D = new int[N+1][N+1][3];
        if(map[1][3]==0) D[1][3][0] = 1;
        if(map[1][3] + map[2][2] + map[2][3] == 0) D[2][3][2] = 1;
        for(int i=1; i<=N; i++) {
            for(int j=3; j<=N; j++) {
                if(D[i][j][0] != 0) {
                    if(j+1<=N && map[i][j+1]==0) D[i][j+1][0] += D[i][j][0];
                    if(i+1<=N && j+1<=N && map[i][j+1] + map[i+1][j] + map[i+1][j+1] == 0) D[i+1][j+1][2] += D[i][j][0];
                }
                if(D[i][j][1] != 0) {
                    if(i+1<=N && map[i+1][j]==0) D[i+1][j][1] += D[i][j][1];
                    if(i+1<=N && j+1<=N && map[i][j+1] + map[i+1][j] + map[i+1][j+1] == 0) D[i+1][j+1][2] += D[i][j][1];
                }
                if(D[i][j][2] != 0) {
                    if(j+1<=N && map[i][j+1]==0) D[i][j+1][0] += D[i][j][2];
                    if(i+1<=N && map[i+1][j]==0) D[i+1][j][1] += D[i][j][2];
                    if(i+1<=N && j+1<=N && map[i][j+1] + map[i+1][j] + map[i+1][j+1] == 0) D[i+1][j+1][2] += D[i][j][2];
                }
            }
        }
        System.out.println(D[N][N][0] + D[N][N][1] + D[N][N][2]);
    }
}