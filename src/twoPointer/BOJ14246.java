package twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14246 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int arr[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int k = Integer.parseInt(br.readLine());
		int idx1 = 0;
		int idx2 = 0;
		long cnt = 0;
		long sum = arr[0];
		
		while(true) {
			if (sum <= k) {
                if (idx2 == n-1) {
                    break;
                }
                sum += arr[++idx2];
            } else {
                cnt += n - idx2;
                sum -= arr[idx1++];
            }
			
			
		}
		System.out.println(cnt);
	}
}
