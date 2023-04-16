package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1213 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int alp[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			int idx = str.charAt(i)-'A';
			alp[idx]++;
		}
		
		int chk = 0;
		for (int i = 0; i < alp.length; i++) {
			if(alp[i]%2!=0) chk++;
		}
		
		String res = "";
		StringBuilder sb = new StringBuilder();
		
		if(chk > 1) {
			res+= "I'm Sorry Hansoo";
		}else {
			for (int i = 0; i < alp.length; i++) {
				for (int j = 0; j < alp[i]/2; j++) {
					sb.append((char)(i+65));
				}
			}
			res += sb.toString();
			String end = sb.reverse().toString();
			
			sb = new StringBuilder();
			for (int i = 0; i < alp.length; i++) {
				if(alp[i]%2 == 1) {
					sb.append((char)(i+65));
				}
			}
			res += sb.toString()+end;
			
		}
		System.out.println(res);
		
		
	}
}
