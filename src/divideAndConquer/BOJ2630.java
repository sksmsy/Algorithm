package divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2630 {
	
	static int n,arr[][],white,blue;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		fn(n,0,0);
		System.out.println(white);
		System.out.println(blue);
	}
	
	public static void fn(int n , int y , int x ) {
		
		for (int i = y; i < y + n; i++) {
			for (int j = x; j < x+n; j++) {
				if(arr[i][j] != arr[y][x]) {
					fn(n / 2 , y , x);
					fn(n / 2 , y + n/2 , x);
					fn(n / 2 , y , x + n/2);
					fn(n / 2 , y + n/2 , x + n/2);
					
					return;
				}
			}
		}
		
		if(arr[y][x] == 1) blue++;
		else white++;
	}
}
