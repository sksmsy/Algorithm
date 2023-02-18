package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class BOJ16395 {
	
	static int n,k;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int arr[][] = new int[31][31];
		
		for (int i = 0; i < 31; i++) {
			arr[i][i] = 1;
			arr[i][0] = 1;
		}
		
		for (int i = 2; i < 31; i++) {
			for (int j = 1; j < 31; j++) {
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
		}
		
		n = Integer.parseInt(st.nextToken())-1;
		k = Integer.parseInt(st.nextToken())-1;
		
		System.out.println(arr[n][k]);
		
	}
}
