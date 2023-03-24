package divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1802 {

	static int t;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			String str = br.readLine();
			
			int leng = str.length();
			if(leng == 1) {
				sb.append("YES").append("\n");
				continue;
			}
			
			int idx = leng/2;
			boolean chk = false;
			while(idx != 0) {
				
				int left = 0;
				int right = leng-1;
				
				while(left < idx || right > leng-1) {
					
					if(str.charAt(left) == str.charAt(right)) {
						chk = true;
						break;
					}
					left++;
					right--;
				}
				
				if(chk) break;
				leng/=2;
				idx/=2;
			}
			
			if(chk) sb.append("NO").append("\n");
			else sb.append("YES").append("\n");
		}
		System.out.println(sb);
	}
	
}
