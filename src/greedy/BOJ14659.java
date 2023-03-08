package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14659 {
	
	public static void main(String[] args) throws IOException {
		
		int n;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		int arr[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			int cnt = 0;
			for (int j = i+1; j < n; j++) {
				if(arr[i] > arr[j]) {
					cnt++;
				}else {
					break;
				}
			}
			max = Math.max(max, cnt);
		}
		System.out.println(max);
	}
}
