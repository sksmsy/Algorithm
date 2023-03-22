package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1026 {

	static int n,arrA[],arrB[],res;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		arrA = new int[n];
		arrB = new int[n];
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arrA[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arrB[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arrA);
		Arrays.sort(arrB);
		res = 0;
		for (int i = 0; i < n; i++) {
			res+= arrA[i] * arrB[n-i-1];
			
		}
		System.out.println(res);
		
	}
}
