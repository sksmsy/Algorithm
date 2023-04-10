package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15658 {

	
	static int n,arr[],oper[];
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		oper = new int[4];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			oper[i] = Integer.parseInt(st.nextToken());
		}
		fn(1,arr[0]);
		System.out.println(max);
		System.out.println(min);
	}
	
	public static void fn(int idx, int num) {
		if(idx == n) {
			max = Math.max(max, num);
			min = Math.min(min, num);
			return;
		}
		
		for (int i = 0; i < 4; i++) {
			if(oper[i] == 0) continue;
			oper[i]--;
			
			if(i == 0) {
				fn(idx+1,num+arr[idx]);
			}else if(i == 1) {
				fn(idx+1,num-arr[idx]);
			}else if(i == 2) {
				fn(idx+1,num*arr[idx]);
			}else{
				fn(idx+1,num/arr[idx]);
			}
			oper[i]++;
		}
	}
}
