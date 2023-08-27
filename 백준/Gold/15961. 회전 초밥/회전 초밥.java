import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] sushi = new int[N];
        for(int i=0; i<N; i++) {
            sushi[i] = Integer.parseInt(in.readLine());
        }

        Queue<Integer> eat = new LinkedList<>();
        int[] same = new int[d+1];
        int cnt = 0;

        int i;
        int cur; 
        for(i=0; i<k; i++) {
            cur = sushi[i];
            eat.add(cur);
            if(same[cur] == 0) cnt++;
            same[cur]++;
        }
        if(same[c] == 0) cnt++;
        
        int max = cnt;
        int out;
        int next;
        while(i != k-1) {

            if(cnt==k+1) {
                max = cnt;
                break;
            }

            out = eat.poll();
            same[out]--;
            if (same[out] == 0) cnt--;

            if(i==N) i=0;
            next = sushi[i];
            eat.add(next);
            if(same[next] == 0) cnt++;
            same[next]++;

            if(out==c && same[c]==0) cnt++;
            else if(out!=c && same[c]==1 && next==c) cnt--;

            if(cnt > max) max = cnt;

            i++;
        }

        System.out.println(max);
    }
}