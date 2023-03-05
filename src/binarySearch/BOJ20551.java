package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ20551 {

	static int n,m,a[];
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
	
		a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(a);
		
		for (int i = 0; i < m; i++) {
			int num = Integer.parseInt(br.readLine());
			
			fn(num);
		}
		System.out.println(sb);
	}
	
//	public static void fn(int key) {
//		int start = 0;
//		int end = n-1;
//		while(start<=end) {
//			int mid = (start+end)/2;
//			
//			if(a[mid] < key) {
//				start = mid + 1;
//			}else {
//				if(a[mid] == key) {
//					int k = -1;
//					for (int i = 0; i < n; i++) {
//						if(key == a[i]) {
//							k = i;
//							break;
//						}
//					}
//					sb.append(k+"\n");
//					return;
//				}
//				end = mid - 1;
//			}
//		}
//		sb.append(-1+"\n");
//	}
	
	
	public static void fn(int key) {
		int start = 0;
		int end = n-1;
		while(start<=end) {
			int mid = (start+end)/2;
			
			if(a[mid] < key) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		
        if (start >= n || a[start] != key) {
        	sb.append(-1+"\n");
		}
        else {
        	sb.append(start+"\n");
        }
		
	}
}
