import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(in.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for(int tc=1; tc<=T; tc++) {
            st = new StringTokenizer(in.readLine());
            int N = Integer.parseInt(st.nextToken());
            int V = Integer.parseInt(st.nextToken());

            String n = Integer.toBinaryString(N);
            String v = Integer.toBinaryString(V);

            int result = 0;
            if(V==1) {
                result += (n.length()-1);
            } else if(v.charAt(1)=='1') {
                result += (v.length()-1) + (n.length()-1);
            } else if(n.charAt(1)=='1') {
                result += (v.length()-1) + (n.length()-1);
            } else {
                result += (v.length()-1) + (n.length()-2);
            }
        
            sb.append("#"+tc+" "+result+"\n");
        }
        System.out.println(sb.toString());
    }
}