package divideAndConquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ4779 {
	
	static int n;
	static StringBuilder sb;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		while((str = br.readLine()) != null) {
			str = br.readLine();
			n = Integer.parseInt(br.readLine());
			sb = new StringBuilder();
			int len = (int) Math.pow(3, n);
			for (int i = 0; i < len; i++) {
				sb.append('-');
			}
			
			
			fn(0,len);
			System.out.println(sb);
		}
	}
	
	public static void fn(int start, int size) {
		if(size==1) { //문자열 사이즈가 1이되면 리턴
			return;
		}
		int newSize=size/3;
        // 3등분한 문자열의 2번째 부분 공백처리
		for(int i=start+newSize; i<start+2*newSize; i++) {
			sb.setCharAt(i, ' ');
		}
		
		fn(start, newSize); // 3등분한 문자열에서 첫번째 부분
		fn(start+2*newSize, newSize); // 3등분한 문자열의 세번째 부분 
	}
	
}
