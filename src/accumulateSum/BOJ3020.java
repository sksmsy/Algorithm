package accumulateSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

public class BOJ3020 {
	
	
	public static void main(String[] args) throws IOException{
		
		int n,h;
		int arr[][];
		int sum[][];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		n = Integer.parseInt(st.nextToken());
		h = Integer.parseInt(st.nextToken());
		
	    arr= new int[h][n];
		//1 5 3 3 5 1
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int t = Integer.parseInt(st.nextToken());
			

		}
		
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " " );
			}
			System.out.println();
			
		}
		
	}
}
