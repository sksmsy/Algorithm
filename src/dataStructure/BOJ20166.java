package dataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class BOJ20166 {

	static int n,m,k,maxLen;
	static char[][] arr;
	static int mx[] = {-1,0,1,0,1,-1,1,-1};
	static int my[] = {0,1,0,-1,1,-1,-1,1};
	static Map<String, Integer> map = new HashMap<String, Integer>();
	static String list[];
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		arr = new char[n][m];
		list = new String[k];
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			arr[i] = str.toCharArray();
		}
		maxLen = 0;
		for (int i = 0; i < k; i++) {
			String input = br.readLine();
			maxLen = Math.max(maxLen, input.length());
			map.put(input, 0);
			list[i] = input;
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				String s="";
				s+=arr[i][j];
				dfs(i,j,1,s);
			}
		}
		
		for (int i = 0; i < k; i++) {
			sb.append(map.get(list[i])).append("\n");
		}
		System.out.println(sb);
	}
	
	public static void dfs(int x, int y,int len, String str) {
		if(map.containsKey(str)) {
			int c = map.get(str)+1;
			map.put(str, c);
		}
		if(len < maxLen) {
			
			for (int i = 0; i < 8; i++) {
				int xx = x+mx[i];
				int yy = y+my[i];
				if(xx > n-1) xx = 0;
				if(xx < 0)	xx = n-1; 
				if(yy > m-1) yy = 0;
				if(yy < 0) yy = m-1;
				
				dfs(xx,yy,len+1,str+arr[xx][yy]);
			}
		}
	}
}
