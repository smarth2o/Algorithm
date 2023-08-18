import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    static int n, k;
    static HashSet<Integer> nums = new HashSet<>();
    static HashMap<Integer, Integer> cards = new HashMap<>();
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(in.readLine());
        k = Integer.parseInt(in.readLine());

        for(int i=0; i<n; i++) {
            int card = Integer.parseInt(in.readLine());
            if (cards.containsKey(card)) cards.put(card, cards.get(card)+1);
            else cards.put(card, 1);
        }
        comb(0, 0);
        
        System.out.println(nums.size());
    }

    private static void comb(int num, int cnt) {

        if(cnt == k) {
            nums.add(num);
            return;
        }

        for(int x : cards.keySet()) {
            if (cards.get(x) <= 0) continue;
            cards.put(x, cards.get(x)-1);
            comb((int) (num*Math.pow(10, (int)(Math.log10(x)+1)) + x), cnt+1);
            cards.put(x, cards.get(x)+1);
        }
        
    }
}