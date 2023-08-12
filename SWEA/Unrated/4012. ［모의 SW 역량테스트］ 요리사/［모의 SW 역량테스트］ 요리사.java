import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(in.readLine());
        StringTokenizer st;

        for(int t=1; t<=tc; t++) {

            int N = Integer.parseInt(in.readLine());
            int[][] arr = new int[N][N];
            for(int i=0; i<N; i++) {
                st = new StringTokenizer(in.readLine(), " ");
                for(int j=0; j<N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // 조합 계산하기
            int[] p = new int[N];
            int cnt = 0;
            while(++cnt<=N/2) p[N-cnt] = 1;

            int[] a, b;
            int diff = Integer.MAX_VALUE;
            do {
                // 식재료 나누기
                a = new int[N/2];
                b = new int[N/2];
                int aIdx = 0;
                int bIdx = 0;
                for(int i=0; i<N; i++) {
                    if(p[i]==1) {
                        a[aIdx++] = i;
                    } else if(p[i]==0) {
                        b[bIdx++] = i;
                    }
                }

                // 시너지의 합 구하기
                int aCnt = 0;
                int bCnt = 0;
                for(int i=0; i<N/2-1; i++) {
                    for(int j=i+1; j<N/2; j++) {
                        aCnt += (arr[a[i]][a[j]] + arr[a[j]][a[i]]);
                        bCnt += (arr[b[i]][b[j]] + arr[b[j]][b[i]]);
                    }
                }

                // 맛 차이 구하기
                int temp = Math.abs(aCnt - bCnt);
                if (temp < diff) {
                    diff = temp;
                }

            } while (np(p));

            System.out.printf("#%d %d%n", t, diff);
        }
    }

    private static boolean np(int[] p) { 

		int N = p.length;
		int i = N-1;
		while(i>0 && p[i-1]>=p[i]) --i;
		
        if(i==0) return false;

		int j = N-1;
		while(p[i-1] >= p[j]) --j;
		
		swap(p, i-1, j);
		
		int k = N-1;
		while(i<k) {
			swap(p, i++, k--);
		}
		return true;
	}
	
	private static void swap(int[] p, int a, int b) {
		int temp = p[a];
		p[a] = p[b];
		p[b] = temp;
	}
}
