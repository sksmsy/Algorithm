package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1920 {
	
	static int n,a[],m;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		a = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(a);
		
		m = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			if(fn(Integer.parseInt(st.nextToken()))) {
				sb.append(1).append("\n");
			}else {
				
				sb.append(0).append("\n");
			}
		}
		System.out.println(sb);
	}
	
	public static boolean fn(int key) {
		
		int s = 0;
		int e = n-1;
		
		while(s<=e) {
			int mid = (s+e)/2;
			
			if(a[mid] < key) {
				s = mid + 1;
			}else {
				if(a[mid] == key) {
					return true;
				}
				e = mid -1;
			}
		}
		return false;
	}
}
