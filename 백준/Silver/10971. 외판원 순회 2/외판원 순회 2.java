import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[][] W;
    static boolean[] visited;
    static int result;
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(in.readLine());
        W = new int[N][N];
        visited = new boolean[N];

        StringTokenizer st;
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(in.readLine());
            for(int j=0; j<N; j++) {
                W[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        result = Integer.MAX_VALUE;
        dfs(0, 0, 0);

        System.out.println(result);

    }
    static void dfs(int cur, int cnt, int cost) {

        if(cnt==N-1) {
            if(W[cur][0]==0) return;
            cost += W[cur][0];
            if(cost<result) result = cost;
            return;
        }

        for(int j=1; j<N; j++) {
            if(visited[j] || W[cur][j]==0) continue;
            visited[j] = true;
            dfs(j, cnt+1, cost + W[cur][j]);
            visited[j] = false;
        }
    }
}