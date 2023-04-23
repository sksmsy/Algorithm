package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ1347 {

	static int n;
	static List<List<Integer>> list = new ArrayList<List<Integer>>();
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int rls = 0;
		
		int xx[] = {1,0,-1,0};
		int yy[] = {0,-1,0,1};
		
		for (int i = 0; i < n+1; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		list.get(0).add(0);
		list.get(0).add(0);
		

		int mx = 0;
		int my = 0;
		int minX = 0;
		int minY = 0;
		
		int j =0;
		for (int i = 0; i < n; i++) {
			char t = str.charAt(i);

			if(t == 'R') {
				rls+=1;
			}else if(t == 'L') {
				rls+=3;
			}else if(t == 'F') {
				int x = list.get(j).get(0);
				int y = list.get(j).get(1);
				
				j++;

				x += xx[rls%4];
				y += yy[rls%4];
				
				list.get(j).add(x);
				list.get(j).add(y);
				
				mx = Math.max(x, mx);
				my = Math.max(y, my);
				
				minX = Math.min(x, minX);
				minY = Math.min(y, minY);
				
			}
		}

			
		int mapX = mx-minX+1;
		int mapY = my-minY+1;
			
		int map[][] = new int[mapX][mapY];
		
		
		for (int i = 0; i < j+1; i++) {
			int x = list.get(i).get(0)-minX;
			int y = list.get(i).get(1)-minY;
			
			map[x][y] = 1;
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < mapX; i++) {
			for (int k = 0; k < mapY; k++) {
				if(map[i][k] == 1) {
					sb.append(".");
				}else {
					sb.append("#");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

}


