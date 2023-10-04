import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        char[] T = in.readLine().toCharArray();
        char[] P = in.readLine().toCharArray();

        int[] pi = new int[P.length];
        int j = 0;
        for (int i = 1; i < P.length; i++) {
            while(j>0 && P[i]!=P[j])
                j = pi[j-1];
            if(P[i]==P[j]) {
                j++;
                pi[i] = j;
            }
        }

        j = 0;
        int i = 0, cnt = 0;
        StringBuilder sb = new StringBuilder();
        while (i < T.length) {
            if (T[i] == P[j]) {
                i++;
                j++;
            } else if (j > 0) {
                j = pi[j - 1];
            } else {
                i++;
            }
            if (j == P.length) {
                cnt++;
                sb.append(i - P.length + 1).append(" ");
                j = pi[j - 1];
            }
        }
        
        System.out.println(cnt);
        System.out.println(sb.toString());
    }
}