package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ7795 {
	
	static int t,n,m,arrA[],arrB[],max;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		t = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for (int i = 0; i < t; i++) {
			max = 0;
			st = new StringTokenizer(br.readLine());
			
			n = Integer.parseInt(st.nextToken());
			m = Integer.parseInt(st.nextToken());
			
			arrA = new int[n];
			arrB = new int[m];
			
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < n; j++) {
				arrA[j] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			
			for (int j = 0; j < m; j++) {
				arrB[j] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(arrB);
			
			for (int j = 0; j < n; j++) {
				max += bs(arrA[j]);
			}
			
			sb.append(max).append("\n");
		}
		System.out.println(sb);
	}
	
	public static int bs(int key) {
		
		int start = 0;
		int end = m-1;
		while(start<=end) {
			int mid = (start + end) / 2;
			
			if(arrB[mid] < key) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		return start;
	}
}
