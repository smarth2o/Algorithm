import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(in.readLine());

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<N; i++) {
            int x = Integer.parseInt(in.readLine());
            if (x > 0) maxHeap.offer(x);
            else if (maxHeap.isEmpty()) System.out.println(0);
            else System.out.println(maxHeap.poll());
        }
    }
}