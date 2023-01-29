package accumulateSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11659 {

	
	public static void main(String[] args) throws IOException {

		int N,M,start,end;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		int[] res = new int[M];
		st = new StringTokenizer(br.readLine());
		
		int[] numArr = new int[N];
		for (int i = 0; i <N; i++) {
			numArr[i] = Integer.parseInt(st.nextToken());
		}
		
		int idx =0;
		for (int i = 0; i < M; i++) {
			
			st = new StringTokenizer(br.readLine());
			
			start = Integer.parseInt(st.nextToken())-1;
			end = Integer.parseInt(st.nextToken())-1;
			
			int temp = 0;
			for (int j = start; j <=end; j++) {
				temp += numArr[j];
			}
			res[idx] = temp;
			idx++;
		}
		
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

}
