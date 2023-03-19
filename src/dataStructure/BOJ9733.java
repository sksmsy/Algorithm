package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ9733 {

	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<String, Integer>();
		StringBuilder sb = new StringBuilder();
		String arr[] = {"Re","Pt","Cc","Ea","Tb","Cm","Ex"};
		
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], 0);
		}
		
		String str = br.readLine();
		int cnt = 0;
		while(str != null && !("".equals(str))) {
			StringTokenizer st = new StringTokenizer(str);
			
			int length = st.countTokens();
			for (int i = 0; i < length; i++) {
				String sts = st.nextToken();
				map.put(sts, map.containsKey(sts) ? map.get(sts)+1 : 1 );
				
				cnt++;
			}
			str = br.readLine();
		}
		
		for (int i = 0; i < arr.length; i++) {
			int val = map.get(arr[i]);
			sb.append(arr[i]).append(" ").append(val).append(" ").append(String.format("%.2f",(float) val/cnt)).append("\n");
		}
		
		sb.append("Total").append(" ").append(cnt).append(" 1.00");
		System.out.println(sb);
	}
}
