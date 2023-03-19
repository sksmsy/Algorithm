package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2512 {

	static int n,arr[],m;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int left = 0 , right = -1;
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			right = Math.max(right, arr[i]);
		}
		
		m = Integer.parseInt(br.readLine());
		
		while(left<=right) {
			int mid = (left+right)/2;
			long budget = 0;
			for (int i = 0; i < n; i++) {
				
				if(arr[i]>mid) {
					budget += mid;
				}else {
					budget += arr[i];
				}
			}
			if(budget<=m) {
				left = mid+1;
			}else {
				right = mid-1;
			}
		}
		System.out.println(right);
		
	}
}