package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ15881 {

	
	public static void main(String[] args) throws IOException{
		
		int n;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		String line = br.readLine();
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			char a = line.charAt(i);
			
			if(a == 'p' && i < n -3) {
				if(line.substring(i,i+4).equals("pPAp")) {
					cnt++;
					i+=3;
				}
			}
		}
		System.out.println(cnt);
	}
}
