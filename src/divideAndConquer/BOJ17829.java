package divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ17829 {
	static int n ;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[n][n];
		
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int tmp[][] = null;
		
		while(n>1) {
			
			n /=2;
			tmp = new int[n][n];
			
			
			for (int i = 0; i < n*2; i+=2) {
				for (int j = 0; j < n*2; j+=2) {
					int ndArr[] = new int[4];
					ndArr[0] = arr[i][j]; 
					ndArr[1] = arr[i][j+1];
					ndArr[2] = arr[i+1][j];
					ndArr[3] = arr[i+1][j+1]; 
					
					Arrays.sort(ndArr);
					tmp[i/2][j/2] = ndArr[2];
				}
				
			}
			arr = tmp;
			
		}
		System.out.println(tmp[0][0]);
		
	}
}
