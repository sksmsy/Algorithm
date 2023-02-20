package review.dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16173 {
	
	static int n, arr[][];
	static String result = "Hing";
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		fn(0,0);
		
		System.out.println(result);
	}
	
	public static void fn(int x, int y) {
		if(arr[x][y] == 0 ) return;
		if(arr[x][y] == -1) {
			result = "HaruHaru";
			return;
		}
		
		if(0 < x+arr[x][y] && x + arr[x][y] < n) {
			fn(x+arr[x][y], y);
		}
		if(0 < y+arr[x][y] && y+arr[x][y] < n) {
			fn(x,y+arr[x][y]);
		}
	}
}
