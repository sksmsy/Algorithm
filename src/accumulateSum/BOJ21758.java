package accumulateSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;

/*
 * 
 * 
 */
public class BOJ21758 {

	public static void main(String[] args)throws IOException {
		int n, max, arr[], sum[];
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n+1];
		sum = new int[n+1];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			sum[i] = sum[i-1]+ arr[i];
		}
		max = 0;
		for (int i = 1; i <= n; i++) {
			int aMax = 0;
			int bMax = 0;
			
			for (int j = 1; j <= n; j++) {
				max += 
			}
			
			max = Math.max(aMax+bMax,max);
		}
		
		
	}
}
