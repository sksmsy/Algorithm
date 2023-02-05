package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/*
 *가위바위  
 * @author sksmsy
 *
 */

public class BOJ2930 {

	public static void main(String[] args) throws IOException{
		
		int r,n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		r = Integer.parseInt(br.readLine());
		
		//StringTokenizer st = new StringTokenizer(br.readLine());
		char ch[] = new char[r];
		
		String result = br.readLine();
		for (int i = 0; i < r; i++) {
			ch[i] = result.charAt(i);
		}
		
		n = Integer.parseInt(br.readLine());
		
		int score = 0;
		for (int i = 0; i < n; i++) {
			int tmp = 0;
			result = br.readLine();
			for (int j = 0; j < r; j++) {
				if(result.charAt(j) == 'P' && ch[j] == 'S') {
					score += 2;
				}else if(result.charAt(j) == 'R' && ch[j] == 'P'){
					score += 2;
				}else if(result.charAt(j) == 'S' && ch[j] == 'R') {
					score += 2;
				}else if(result.charAt(j) == ch[j]) {
					score +=1;
				}
				tmp = score;
			}
			score = Math.max(score, tmp);
		}
		
		System.out.println(score);
		
	}
}
