import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine(), " ");
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        int[] oper = new int[r];
    
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(in.readLine(), " ");
            for(int j=0; j<m; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(in.readLine(), " ");
        for(int i=0; i<r; i++) {
            oper[i] = Integer.parseInt(st.nextToken());
        }

        int[][] temp = new int[n][m];

        for(int o=0; o<r; o++) {
            n = arr.length;
            m = arr[0].length;

            switch (oper[o]) {
                case 1: 
                    for(int i=0; i<n; i++) {
                        for(int j=0; j<m; j++) {
                            temp[n-i-1][j] = arr[i][j];
                        }
                    }
                    break;
                case 2:
                    for(int i=0; i<n; i++) {
                        for(int j=0; j<m; j++) {
                            temp[i][m-j-1] = arr[i][j];
                        }
                    }
                    break;
                case 3:
                    temp = new int[m][n];
                    for(int i=0; i<n; i++) {
                        for(int j=0; j<m; j++) {
                            temp[j][n-i-1] = arr[i][j];
                        }
                    }
                    break;
                case 4:
                    temp = new int[m][n];
                    for(int i=0; i<n; i++) {
                        for(int j=0; j<m; j++) {
                            temp[m-j-1][i] = arr[i][j];
                        }
                    }
                    break;
                case 5:
                    for(int i=0; i<n; i++) {
                        for(int j=0; j<m; j++) {
                            if (i < n/2 && j < m/2) {
                                temp[i][j+m/2] = arr[i][j];
                            } else if (i < n/2 && j >= m/2) {
                                temp[i+n/2][j] = arr[i][j];
                            } else if (i >= n/2 && j >= m/2) {
                                temp[i][j-m/2] = arr[i][j];
                            } else if (i >= n/2 && j < m/2) {
                                temp[i-n/2][j] = arr[i][j];
                            }
                            
                        }
                    }
                    break;
                case 6:
                    for(int i=0; i<n; i++) {
                        for(int j=0; j<m; j++) {
                            if (i < n/2 && j < m/2) {
                                temp[i+n/2][j] = arr[i][j];
                            } else if (i < n/2 && j >= m/2) {
                                temp[i][j-m/2] = arr[i][j];
                            } else if (i >= n/2 && j >= m/2) {
                                temp[i-n/2][j] = arr[i][j];
                            } else if (i >= n/2 && j < m/2) {
                                temp[i][j+m/2] = arr[i][j];
                            }
                            
                        }
                    }
                    break;
            }

            arr = new int[temp.length][];
            for(int i=0; i<temp.length; i++) {
                arr[i] = Arrays.copyOf(temp[i], temp[i].length);
            }
        }

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
	}
}