import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String args[]) throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(in.readLine());

        int[] oper = new int[n];
        for(int i=0; i<n; i++) {
            oper[i] = Integer.parseInt(in.readLine());
        }

        PriorityQueue<Integer> pque = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            if (abs1==abs2) {
                return o1-o2;
            }
            return abs1-abs2;
        });

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) {
            if(oper[i]==0) {
                if(pque.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(pque.poll()).append("\n");
                }
            } else if(oper[i]!=0) {
                pque.add(oper[i]);
            }
        }

        System.out.println(sb.toString());
    }
}