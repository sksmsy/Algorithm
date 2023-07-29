package bitMasking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1497 {

	static int n,m;
	static String gts[];
	static int yn[];
	static boolean visit[];
	static int min = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		gts = new String[n];
		yn = new int[n];
		visit = new boolean[n];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			String gt = st.nextToken();
			gts[i] = gt;
			String tmp = st.nextToken();
			for (int j = 0; j < m; j++) {
				if(tmp.charAt(j) == 'Y'){
					yn[i] |= (1<< m-j-1);
				}
			}
		}
		com(0,0,yn[0]);
		System.out.println(min);
	}
	
	public static void com(int idx, int idx2,int sum) {
		
//		if(sum == (1<<m)-1) {
//			min = idx2;
//			return;
//		}
		
		for (int i = idx; i < n; i++) {
			com(idx+1,idx2+1,sum+yn[i]);
		}
	}
}
