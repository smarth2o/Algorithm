import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
     
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        
        for(int tc=0; tc<T; tc++) {

            int N = Integer.parseInt(in.readLine());
            int[][] nodes = new int[N+2][2];
            StringTokenizer st;

            for(int i=0; i<N+2; i++) {
                st = new StringTokenizer(in.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                nodes[i] = new int[] {x, y};
            }

            int[][] graph = new int[N+2][N+2];
            final int INF = Integer.MAX_VALUE;

            for(int i=0; i<N+2; i++) {
                for(int j=0; j<N+2; j++) {
                    graph[i][j] = INF;
                    int dist = Math.abs(nodes[i][0] - nodes[j][0]) + Math.abs(nodes[i][1] - nodes[j][1]);
                    if (dist <= 1000) {
                        graph[i][j] = 1;
                    }
                }
            }

            for(int k=1; k<N+1; k++) {
                for(int i=0; i<N+2; i++) {
                    for (int j=0; j<N+2; j++) {
                        if(graph[i][k]==INF || graph[k][j]==INF) continue; 
                        graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                    }
                }
            }

            if(graph[0][N+1]<INF) {
                System.out.println("happy");
            } else {
                System.out.println("sad");
            }

        }
    }
}