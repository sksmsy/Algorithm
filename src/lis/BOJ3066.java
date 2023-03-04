package lis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ3066 {

	static int t, arr[], arr2[], lis[], max;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			
			int n = Integer.parseInt(br.readLine());
			
			arr = new int[n];
			lis = new int[n];
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(br.readLine());
			}
			
			lis[0] = arr[0];
			max = 0;
			
			for (int j = 1; j < n; j++) {
				if(lis[max] < arr[j]) {
					lis[++max] = arr[j];
				}else {
					fn(arr[j]);
				}
			}
			
			sb.append(max+1).append("\n");
		}
		System.out.println(sb);
		
	}
	public static void fn(int key) {
		int s = 0;
		int e = max;
		
		while(s<=e) {
			int mid = (s+e)/2;
			
			if(lis[mid] < key) {
				s = mid + 1;
			}else {
				if(lis[mid] == 0) {
					return;
				}
				e = mid - 1;
			}
		}
		lis[s] = key;
	}
}
