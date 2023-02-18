package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ19947 {
	
	static int h,y;
	static int arr[];
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		h = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		
		arr = new int[y+1];
		arr[0] = h;
		
		for (int i = 1; i <= y; i++) {
			arr[i] = (int) (arr[i-1] * 1.05);
			
			if(i >= 3) {
				arr[i] = (int) Math.max(arr[i-3]*1.20, arr[i]);
			}
			
			if(i >= 5) {
				arr[i] = (int) Math.max(arr[i-5]*1.35, arr[i]);
			}
		}
		
		System.out.println(arr[y]);
	}
}
