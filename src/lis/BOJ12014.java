package lis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ12014 {
	
	static int t,n,k,arr[],lis[],max;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		t = Integer.parseInt(br.readLine());
		int tc = 1; 
		while(t-->0) {
			st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			
			arr = new int[n];
			lis = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
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
			 
			sb.append("Case #").append(tc).append("\n");
			if(max+1 >= k) {
				sb.append(1);
			}else {
				sb.append(0);
			}
			sb.append("\n");
			tc++;
		}
		System.out.println(sb);
		
	}
	
	public static void fn(int key) {
		int start = 0;
		int end = max;
		
		while(start<=end) {
			int mid = (start+end) / 2;
			
			
			if(lis[mid] < key) {
				start = mid + 1;
			}else {
				if(lis[mid] == key) {
					return;
				}
				end = mid - 1;
			}
			
		}
		lis[start] = key;
	}
}
