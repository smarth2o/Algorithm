import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution
{
    static int[][] rooms;
	public static void main(String args[]) throws Exception
	{
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int tc = Integer.parseInt(in.readLine());

        for(int t=1; t<=tc; t++) {
            int n = Integer.parseInt(in.readLine());

            int x;
            int size = n*n+1;
            rooms = new int[size][];

            for(int i=0; i<n; i++) {
                st = new StringTokenizer(in.readLine(), " ");
                for(int j=0; j<n; j++) {
                    x = Integer.parseInt(st.nextToken());
                    rooms[x] = new int[]{i, j};
                }
            }

            int k=1;
            int numMax = 0;
            int cntMax = 0;
            while(k<=size-2) {
                int temp = check(rooms, k, 1);
                if(temp>cntMax) {
                    cntMax = temp;
                    numMax = k;
                }
                k += temp;
            }

            System.out.printf("#%d %d %d%n", t, numMax, cntMax);
            
        }
	}
    public static int check(int[][] rooms, int num, int cnt) {

        if(num+1 >= rooms.length) {
            return cnt;
        }
        int ci = rooms[num][0];
        int cj = rooms[num][1];

        int ni = rooms[num+1][0];
        int nj = rooms[num+1][1];

        if(Math.abs(ni-ci) + Math.abs(nj-cj) == 1) {
            return check(rooms, num+1, cnt+1);
        }
        return cnt;
    }
}