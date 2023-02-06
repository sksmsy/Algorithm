package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1969 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st  = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		char arr [][] = new char[n][m];
		char ch[] = {'A','C','G','T'};
		
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = line.charAt(j);
			}
		}
		int min = 0;
		String result = "";
		for (int i = 0; i < m; i++) {
			int chCnt[] = new int[4];
			for (int j = 0; j < n; j++) {
				
				if(arr[j][i] == 'A') {
					chCnt[0] ++;
				}else if(arr[j][i] == 'C') {
					chCnt[1] ++;
				}else if(arr[j][i] == 'C') {
					chCnt[2] ++;
				}else {
					chCnt[3] ++;
				}
				
				
				
				for (int k = 0; k < chCnt.length; k++) {
					
				}
			}
		}
		
		
		
	}
}
