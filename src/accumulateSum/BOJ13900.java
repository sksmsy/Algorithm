package accumulateSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ13900 {

	
	public static void main(String[] args) throws IOException{
		
		int n;
		int arr[];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		arr = new int[n+1];
		st = new StringTokenizer(br.readLine());
		
		long sum= 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		long an=0;
		for (int i = n-1; i >=0; i--) {
			an += arr[i]*sum;
			sum = sum+arr[i];
		}
		System.out.println(an);
	}
}
