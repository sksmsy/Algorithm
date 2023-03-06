package lis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11568 {

	static int n, arr[], lis[], max;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		lis = new int[n];
		max = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		lis[0] = arr[0];

		for (int i = 1; i < n; i++) {
			if (lis[max] < arr[i])
				lis[++max] = arr[i];
			else
				bs(arr[i]);
		}
		System.out.println(max+1);
	}

	public static void bs(int key) {
		int start = 0;
		int end = max;

		while (start <= end) {
			int mid = (start+end) / 2;
			
			if(key < lis[mid]) {
				end = mid-1;
			}else {
				if(key == lis[mid]) {
					lis[mid] = key;
					return;
				}
				start = mid+1;
			}
		}
		lis[start] = key;
	}
}
