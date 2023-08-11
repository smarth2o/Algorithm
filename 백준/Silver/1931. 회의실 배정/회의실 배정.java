import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        StringTokenizer st;
        
        int[][] meet = new int[n][2];
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            meet[i] = new int[]{ Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()) };
        }

        Arrays.sort(meet, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1]==o2[1]) return o1[0]-o2[0];
                return o1[1] - o2[1];
            }
        });

        int cnt = 0;
        int end = 0;
        for (int[] m : meet) {
            if (m[0]>=end) {
                cnt++;
                end = m[1];
            }
        }

        System.out.println(cnt);

    }
}