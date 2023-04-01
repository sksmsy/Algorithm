package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ23349 {

	static int n;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		Map<String, String> map = new HashMap<String, String>();
		n = Integer.parseInt(br.readLine());
		
		
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			String name = st.nextToken();
			String area = st.nextToken();
			String stm = st.nextToken();
			String etm = st.nextToken();
			
			
			
		}
		
		
	}
}
