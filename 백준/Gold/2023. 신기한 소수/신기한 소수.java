import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static int N;
    static StringBuilder sb;
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        sb = new StringBuilder();
        for(int x=2; x<=9; x++) {
            prime(x);
        }
        System.out.println(sb.toString());
    }

    private static void prime(int x) {

        for(int i=2; i*i<=x; i++) {
            if (x % i == 0) return;
        }
        
        if (Integer.toString(x).length() == N) {
            sb.append(Integer.toString(x)).append('\n');
            return;
        }
        for(int j=1; j<=9; j++) {
            prime(x*10+j);
        }
    }
}