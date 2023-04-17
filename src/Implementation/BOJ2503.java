package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2503 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		boolean chk[]=new boolean[1000];
		for (int i = 123; i <1000; i++) {
			String str = Integer.toString(i);
			
			if(str.charAt(0) =='0' 
					|| str.charAt(1) == '0' 
					|| str.charAt(2) == '0') continue;
			
			if(str.charAt(0) == str.charAt(1)
					|| str.charAt(0) == str.charAt(2)
					|| str.charAt(1) == str.charAt(2)) continue;
			
			chk[i] = true;
		}
		
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int q = Integer.parseInt(st.nextToken());
			int s = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			for (int j = 123; j < 1000; j++) {
				if(chk[j]) {
					int ns = 0;
					int nb = 0;
					
					for (int k = 0; k < 3; k++) {
						char tmp = Integer.toString(q).charAt(k);
						
						
						for (int l = 0; l < 3; l++) {
							char jNum = Integer.toString(j).charAt(l);
							
							
							if(tmp == jNum && k == l) ns++;
							else if(tmp == jNum && k != l) nb++;
						}
					}
					
					if(ns == s && nb == b) chk[j] = true;
					else chk[j] = false;
				}
			}
			
		}
		int ans = 0;
		for (int i = 123; i < 1000; i++) {
			if(chk[i])ans++;
		}
		System.out.println(ans);
		
	}

}
