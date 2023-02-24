package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1003 {

	static int t,n;
	static long cnt0,cnt1;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			cnt0 = 0;
			cnt1 = 0;
			n = Integer.parseInt(br.readLine());
			
			fn(n);
			
			sb.append(cnt0+" "+cnt1+"\n");
			
		}
		System.out.println(sb);
	}
	
	public static int fn(int n) {
		if(n == 0) {
			cnt0++;
			return 0;
		}else if(n==1) {
			cnt1++;
			return 1;
		}else {
			return fn(n-1) + fn(n-2);
		}
	}
}
