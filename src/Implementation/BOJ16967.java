package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16967 {

	static int h,w,x,y,arr[][];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		h = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		
		arr = new int[h+x][w+y];
		
		for (int i = 0; i < h+x; i++) {
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < w+y; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		
	}
}
