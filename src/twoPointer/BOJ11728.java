package twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11728 {
	
	static int n,m,arr[],arr2[],idx1,idx2;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb=  new StringBuilder();
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		arr2 = new int[m];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		idx1 = 0;
		idx2 = 0;
		
		while(idx1< n && idx2 < m) {
			if(arr[idx1] > arr2[idx2]) {
				sb.append(arr2[idx2++]).append(" ");
			}else {
				sb.append(arr[idx1++]).append(" ");
			}
		}
		
		for (int i = idx1; i < n; i++) {
			sb.append(arr[i]).append(" ");
		}
		for (int i = idx2; i < m; i++) {
			sb.append(arr2[i]).append(" ");
		}
		
		System.out.println(sb);
	}
}
