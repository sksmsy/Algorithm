package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10162 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int arr[] = {300,60,10};
		int arr2[] = {0,0,0};
		
		int res = 0;
		int i = 0;
		while(t > 0 && i < 3) {
			int j = t / arr[i]; 
			if(j > 0) {
				arr2[i] += j;
			}
			t %= arr[i++];
		}
		
		if(t == 0) {
			for (int j = 0; j < arr2.length; j++) {
				System.out.print(arr2[j] + " ");
			}
		}else {
			System.out.println(-1);
		}
		
	}
}
