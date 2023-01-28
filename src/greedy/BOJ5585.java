package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ5585 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int res = 0;
		
		int cost = 1000 - Integer.parseInt(br.readLine());
		int arr[] = {500,100,50,10,5,1};
		
		int i=0;
		while(cost > 0) {
			int j = cost / arr[i];
			res += j;
			cost %= arr[i++];
		}
		
		
		System.out.println(res);
	}
}
