package twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ3273 {

	static int n,x,arr[];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		x = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		int idx1 = 0;
		int idx2 = n - 1;
		int sum = 0;
		int cnt = 0;

		while(idx1 < idx2) {
			sum = arr[idx1] + arr[idx2];
			if(sum == x) cnt++;
			
			if(sum <= x) idx1++;
			else idx2--;
		}
		
		System.out.println(cnt);
	}
}
