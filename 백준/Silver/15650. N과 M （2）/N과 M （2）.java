import java.util.Scanner;

public class Main {

    static int[] numbers;
    static boolean[] visited;
    static int N, M;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        
        numbers = new int[M];
        visited = new boolean[N+1];
        comb(0, 1);
    }
    
    public static void comb(int cnt, int start) {

        if (cnt==M) {
            for(int i=0; i<M; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i=start; i<=N; i++) {
            if(visited[i]) continue;
            numbers[cnt] = i;
            visited[i] = true;
            comb(cnt+1, i+1);
            visited[i] = false;
        }
    }
}