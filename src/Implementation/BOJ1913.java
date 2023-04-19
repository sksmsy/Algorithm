package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1913 {
	
	static int n,num,arr[][];
	static int xx[] = {1,0,-1,0};
	static int yy[] = {0,1,0,-1};

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		n = Integer.parseInt(br.readLine());
		num = Integer.parseInt(br.readLine());
		
		arr = new int[n][n];
		
		arr[0][0] = n*n;

		int i = 0, x = 0, y = 0;
		while(i < 4) {
			int mx = x+xx[i];
			int my = y+yy[i];
			
			if(mx >= 0 && my >= 0 && mx < n && my < n && arr[mx][my] == 0) {
				arr[mx][my] = arr[x][y] -1;
				if(arr[mx][my] == 1) break;
				x = mx;
				y = my;
			}else {
				i++;
			}
			
			if(i > 3) {
				i = 0;
			}
		}
		
		for (int j = 0; j < n; j++) {
			for (int k = 0; k < n; k++) {
				if(arr[j][k] == num) {
					x = j+1;
					y = k+1;
				}
				
				sb.append(arr[j][k]).append(" ");
			}
			sb.append("\n");
		}
		sb.append(x).append(" ").append(y);
		System.out.println(sb);
		System.out.println(1%4);
	}
}
