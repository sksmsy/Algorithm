package lis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2550 {

	static int n,arr[],arr2[],lis[],result[],max;
	
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		max = 0;
		lis[0] = arr[0];
		
		for (int i = 1; i < n; i++) {
			
			if(lis[max] < arr[i]) {
				lis[++max] = arr[i];
			}else {
				fn(arr[i]);
			}
		}
		
		System.err.println(max);
		
	}
	
	public static void fn(int key) {
		int start = 0;
		int end = max;
		
		while(start <= end) {
			int mid = (start+end) / 2;
			
			if(lis[mid] < key) {
				start = mid + 1;
			}else {
				if(lis[mid] == key) {
					lis[mid] = key;
					return;
				}
				end = mid - 1;
			}
		}
		lis[start] = key;
	}
}
