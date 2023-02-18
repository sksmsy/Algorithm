package dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ13699 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		long arr[] = new long[36];
		
		arr[0] = 1;
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				arr[i] += (arr[j] * arr[i - 1 -j]);
			}
		}
		
		System.out.println(arr[n]);
	}
}

