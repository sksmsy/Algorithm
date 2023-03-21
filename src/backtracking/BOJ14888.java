package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14888 {

	static int n,arr[],oper[];
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		oper = new int[4];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			oper[i] = Integer.parseInt(st.nextToken());
		}
		fn(arr[0],1);
		System.out.println(max);
		System.out.println(min);
		
		
	}
	
	public static void fn(int num, int idx) {
		if(idx == n) {
			max = Math.max(max, num);
			min = Math.min(min, num);
			return;
		}
		
		
		for (int i = 0; i < 4; i++) {
			
			if(oper[i]>0) {
				oper[i]--;
				
				switch(i) {
				
					case 0:
						fn(num+arr[idx], idx+1);
						break;
					case 1:
						fn(num-arr[idx], idx+1);
						break;
					case 2:
						fn(num*arr[idx], idx+1);
						break;
					case 3:
						fn(num/arr[idx], idx+1);
						break;
				}
				oper[i]++;
			}
		}
		
	}
}
