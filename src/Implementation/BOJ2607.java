package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BOJ2607 {

	static int n,cnt;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, String> map= new HashMap<>();
		
		
		n = Integer.parseInt(br.readLine());
		cnt = 0;
		String str = br.readLine();

		
		for (int i = 0; i < n-1; i++) {
			String tmp = br.readLine();
			int a[] = new int[26];
			for (int j = 0; j < str.length(); j++) {
				a[str.charAt(j)-'A']++;
			}
			int inCnt =0;
			for (int j = 0; j < tmp.length(); j++) {
				if(a[tmp.charAt(j)-'A'] > 0) {
					inCnt++;
					a[tmp.charAt(j)-'A']--;
				}
			}
			
            if(str.length() == tmp.length() && (str.length() ==inCnt || str.length()-1 == inCnt)) {   
                cnt++;
            }else if (str.length() == tmp.length()+ 1 && tmp.length()==inCnt) {   
            	cnt++;
            }else if (str.length() == tmp.length()-1 && tmp.length()-1 == inCnt) {   
            	cnt++;
            } 
		}
		
		System.out.println(cnt);
	}
}
