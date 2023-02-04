package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2810 {

	
	public static void main(String[] args) throws IOException{
		
		int n;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		String line = br.readLine();
		int cnt = 1;
		for (int i = 0; i < n; i++) {
			char a = line.charAt(i);
			
			if(a == 'L') {
				i++;
				cnt++;
			}else if(a == 'S') {
				cnt++;
			}
			
		}
		
		if(cnt > n)System.out.println(n);
		else System.out.println(cnt);
		
	}
}
