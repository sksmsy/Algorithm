package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16953 {
	
	static int a,b,cnt;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		
		
		while(a<=b) {
			
			if(a==b) {
				System.out.println(cnt+1);
				return;
			}
			
			cnt++;
			
			if(b%10 ==1) {
				b/=10;
				continue;
			}
			
			if(b%2 !=0) {
				break;
			}
			b/=2;
		}
		System.out.println(-1);
	}
}
