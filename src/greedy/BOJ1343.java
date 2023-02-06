package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1343 {
	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String b = br.readLine();

		String result = "";
		int cnt = 0;
		for (int i = 0; i < b.length(); i++) {
			
			char c = b.charAt(i);
			
			if(c == 'X') {
				cnt++;
				if(cnt == 4) {
					result+="AAAA";
					cnt = 0;
				}
			}else {
				if(cnt == 2 || i == b.length()-1) {
					result +="BB";
				}else if(cnt == 3) {
					result = "-1";
					break;
				}
			}
			
		}
		
		System.out.println(result);
	}
}
