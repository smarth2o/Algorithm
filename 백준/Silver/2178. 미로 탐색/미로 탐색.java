import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int[] dirX = {0, 1, 0, -1};
    static int[] dirY = {1, 0, -1, 0};
    static int N, M;
    static int[][] maze;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        maze = new int[N][M];
        for(int i=0; i<N; i++) {
            char[] temp = in.readLine().toCharArray();
            for(int j=0; j<M; j++) {
                maze[i][j] = temp[j]-'0';
            }
        }

        bfs();
        System.out.println(maze[N-1][M-1]-1);
    }

    private static void bfs() {
        Queue<int[]> queue = new ArrayDeque<>();

        queue.offer(new int[]{0, 0});
        maze[0][0] = 2;

        while(!queue.isEmpty()) {
            int[] pos = queue.poll();

            for(int k=0; k<4; k++) {
                int i = pos[0] + dirX[k];
                int j = pos[1] + dirY[k];

                if (i<0 || i>=N || j<0 || j>=M) continue;
                int val = maze[pos[0]][pos[1]];
                if (maze[i][j] == 1) {
                    queue.offer(new int[]{i, j});
                    maze[i][j] = val + 1;
                }
            }
        }


    }
}