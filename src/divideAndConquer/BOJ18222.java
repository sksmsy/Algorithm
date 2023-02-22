package divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ18222 {
	
	static long arr[];
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		arr = new long[64];
		
		arr[0] = 1;
		
		for (int i = 1; i < 64; i++) {
			arr[i] = arr[i-1]*2;
		}
		System.out.println(fn(n));
	}
	
	public static int fn(long n) {
		if(n == 1) {
			return 0;
		}
		for (int i = 0; i < 64; i++) {
			if(arr[i] >= n) return 1 - fn(n - arr[i-1]);
		}
		return 0;
	}
}
