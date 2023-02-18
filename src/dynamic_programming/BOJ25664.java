package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ25664 {
	static int n,max;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		for (int i = 1; i < n; i++) {
			int k = Integer.parseInt(st.nextToken());
			
			if(k <= s) {
				s = k;
			}else {
				max = Math.max(max, k-s);
			}
		}
		
		System.out.println(max);
	}
}