package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ15904 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String ucpc ="UCPC";
		
		String str = br.readLine();
		int cnt = 0;
		int j = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ucpc.charAt(j)) {
				cnt++;
				j++;
			}
			
			if(j == 4) {
				break;
			}
		}
		
		
		if(cnt == 4) {
			System.out.println("I love UCPC");
		}else {
			System.out.println("I hate UCPC");
		}
		
	}
}
