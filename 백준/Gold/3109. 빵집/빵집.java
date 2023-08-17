import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] dirX = {-1, 0, 1};
    static int[] dirY = {1, 1, 1};
    static int r, c;
    static char[][] map;
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        map = new char[r][c];
        for(int i=0; i<r; i++) {
            map[i] = in.readLine().toCharArray();
        }
       
        int cnt = 0;
        for(int i=0; i<r; i++) {
            if (move(i, 0)) cnt++;
        }
        System.out.println(cnt);
    }

    private static boolean move(int x, int y) {

        if (y==c-1) return true;
        map[x][y] = 'o';

        for(int k=0; k<3; k++) {
            int i = x+dirX[k];
            int j = y+dirY[k];
            if(i>=0 && i<r && map[i][j] == '.') {
                if (move(i, j)) return true;
            }
        }
        return false;
    }
}