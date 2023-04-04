package twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2003 {

	static int n,m,arr[],idx1,idx2,sum,cnt;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr = new int[n];
		
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		idx1 = idx2 = sum = 0;
		while(true) {
			if(sum > m) {
				sum -= arr[idx1++];
			}else if(idx2 >= arr.length) {
				break;
			}else {
				sum += arr[idx2++];
			}
			
			if(sum == m) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
