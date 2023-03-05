package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2417 {

	static long n;
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Long.parseLong(br.readLine());
		
		long start = 0;
		long end = n;
		long min = Long.MAX_VALUE;
		
		while(start<=end) {
			long mid = (start+end)/2;
			long result = (long) Math.pow(mid, 2);
			/*
			 * mid를 제곱한 값 중 n보다 크지만 
			 * 가장 작은 값을 찾는것이기 때문에
			 * 제곱값이 n보다 큰 경우 min에 mid 값을 저장하고, 
			 * end의 범위를 줄여 재탐색한다.
			 */
			//System.out.println(mid);
			if(result>=n) {
				min = mid;
				end = mid - 1;
				// 제곱값이 n보다 작은 경우 start 범위를 키워 재탐색한다.
			}else {
				start = mid + 1;
			}
		}
		
		System.out.println(min);
	}
}
