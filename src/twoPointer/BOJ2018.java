package twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2018 {
	
	static int n,arr[],L,R,res;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = i+1;
		}
		
		L = R = res = 0;
		
		while(R <= n) {
			int sum = 0;
			
			for (int i = L; i < R ; i++) {
				sum += arr[i];
			}
			
			if(sum == n) {
				L++;
				res++;
			}else if(sum > n) {
				L++;
			}else if(sum < n) {
				R++;
			}
		}
		System.out.println(res);
		
	}
}
