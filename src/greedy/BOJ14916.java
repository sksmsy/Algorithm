package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ14916 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int arr[] = {5,2};
		
		int chg = Integer.parseInt(br.readLine());
		int res=0;
		int j = 0;
		while(chg>0) {
			res += chg / arr[j];
			
		}
		
	}
}
