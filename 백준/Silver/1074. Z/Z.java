import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int r, c, cnt;
    static int[] dirX = {0, 0, 1, 0};
    static int[] dirY = {0, 1, -1, 1};
    static boolean found = false;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        check(0, 0, N);
        System.out.println(cnt);
    }

    private static void check(int x, int y, int k) {

        if (k==1) {
            for (int i=0; i<4; i++) {
                x += dirX[i];
                y += dirY[i];
                if (x==r && y==c) {
                    return;  
                }
                else cnt++;
            }
        }

        int temp = (int) (Math.pow(2, k))/2;
        for (int i=0; i<4; i++) {
            x += dirX[i] * temp;
            y += dirY[i] * temp;
            if (x + temp - 1 >= r && y + temp - 1 >= c) {
                check(x, y, k-1);
                return;
            }
            cnt += temp*temp;
        }
    }
}