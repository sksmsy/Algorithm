package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ15720 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		int bArr[] = new int[3];
		int cArr[] = new int[3];
		int dArr[] = new int[3];
		
		int tot =0;
		int sale = 0;
		for (int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			
			bArr[i] = Integer.parseInt(st.nextToken());
			cArr[i] = Integer.parseInt(st.nextToken());
			dArr[i] = Integer.parseInt(st.nextToken());
		
			
			if(bArr[i] == 0
				|| cArr[i] == 0
				|| dArr[i] == 0) {
				tot += bArr[i]+cArr[i]+dArr[i];
			}else {
				tot += bArr[i]+cArr[i]+dArr[i];
				sale += tot;
			}
		}
		System.out.println(tot);
		System.out.println((sale*0.9)+tot);
	}
}
