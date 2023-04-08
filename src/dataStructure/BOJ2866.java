package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ2866 {
	
	static int r,c,cnt;
	static char arr[][];
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		arr = new char[r][c];
		for (int i = 0; i < r; i++) {
			arr[i] = br.readLine().toCharArray();
		}
		
		ArrayList<String> list = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < c; i++) {
			sb.setLength(0);
			for (int j = 0; j < r; j++) {
				sb.append(arr[j][i]);
			}
			list.add(sb.toString());
		}
		int start = 0, end = r;
		cnt = 0;
		ArrayList<String> tList = new ArrayList<String>();
		
		while(start <= end) {
			tList.clear();
			int mid = (start+end)/2;
			for (int i = 0; i < list.size(); i++) {
				String tmp = list.get(i);
				tmp = tmp.substring(mid,tmp.length());
				
				if(!tList.contains(tmp)) {
					tList.add(tmp);
				}else {
					break;
				}
				
			}
			if(tList.size() != list.size()) {
				end = mid - 1;
			}else {
				start = mid + 1;
				cnt = mid;
			}
		}
		System.out.println(cnt);
	}
}
