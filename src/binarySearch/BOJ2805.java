package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2805 {

	static int n,m,arr[],min,max;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		st = new StringTokenizer(br.readLine());

		min = max = 0;
		for (int i = 0; i < m; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		while(min<max) {
			int mid = (min+max)/2;
			long sum=0;
			
			for (int height : arr) {
				
				if(height - mid > 0) {
					sum += (height - mid);
				}
			}
			
			if(sum < m) {
				max = mid;
			}else {
				min = mid + 1;
			}
		}
		
		
		System.out.println(min - 1);
		
		
	}
	
	public static void bs() {
		
	}
}
