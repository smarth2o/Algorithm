import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static class penwickTree{
        long[] tree;

        public penwickTree(int n) {
            tree = new long[n+1];
        }
        
        public void update(int i, long val){
            i++;
            while(i < tree.length){
                tree[i] += val;
                i += (i & -i);
            }
        }
        public long sum(int n){
            n++;
            long result = 0;
            while(n > 0){
                result += tree[n];
                n &= (n-1);
            }
            return result;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        penwickTree tree = new penwickTree(N);
        long[] arr = new long[N];

        for (int i = 0; i < N; ++i) {
            arr[i] = Long.parseLong(in.readLine());
            tree.update(i, arr[i]);
        }

        for(int i = 0; i < M+K; i++){
            st = new StringTokenizer(in.readLine());
            int a = Integer.parseInt(st.nextToken());

            if (a == 1) {
                int b = Integer.parseInt(st.nextToken());
                long c = Long.parseLong(st.nextToken());
                tree.update(b-1, c-arr[b-1]);
                arr[b-1] = c;
            }
            else {
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                System.out.println(tree.sum(c - 1) - tree.sum(b - 2));
            }
        }
    }
}