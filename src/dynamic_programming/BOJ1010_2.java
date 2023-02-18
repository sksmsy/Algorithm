package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1010_2 {

	static int t,n,m;
	static int arr[][] = new int[30][30];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			
			System.out.println(fn(m,n));
		}
		
	}
	
	public static int fn(int n, int r) {
		if(arr[n][r] > 0) return arr[n][r];
		
		
		if(n == r || r == 0) return arr[n][r] =1;
		
		return arr[n][r] = fn(n-1,r-1) + fn(n-1,r);
	
	}
}
