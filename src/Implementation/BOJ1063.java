package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1063 {

	static String k,s;
	static int n;
	static int arr[][] = new int[8][8];
	static int xx[] = {-1,-1,0,1,1,1,0,-1};
	static int yy[] = {0,1,1,1,0,-1,-1,-1};
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb=  new StringBuilder();
		
		k = st.nextToken();
		s = st.nextToken();
		n = Integer.parseInt(st.nextToken());
		
		int ky = 7-(k.charAt(0)-'A');
		int kx = (k.charAt(1)-48-1);
		
		int sy = 7-(s.charAt(0)-'A');
		int sx = s.charAt(1)-48-1;
	
		
		for (int i = 0; i < n; i++) {
			String move = br.readLine();
			
			int kmx = 0;
			int kmy = 0;
			
			int smx = 0;
			int smy = 0;
			
			
			switch (move) {
			case "R": 
				kmx = kx;
				kmy = ky+1;
				smx = sx;
				smy = sy+1;
				if(kmx >0 && kmy > 0 && kmx < 8 && kmy <8) {
					
					kx = kmx;
					ky = kmy;
					
					if(kmx == sx && kmy == sy) {
						if(smx > 0 && smy > 0 && smx < 8 && smy < 8) {
							sx = smx;
							sy = smy;
						}
					}
				}
				break;
			case "L":
				kmx = kx;
				kmy = ky-1;
				smx = sx;
				smy = sy-1;
				if(kmx >0 && kmy > 0 && kmx < 8 && kmy <8) {
					
					kx = kmx;
					ky = kmy;
					
					if(kmx == sx && kmy == sy) {
						if(smx > 0 && smy > 0 && smx < 8 && smy < 8) {
							sx = smx;
							sy = smy;
						}
					}
				}
				break;
			case "B":
				kmx = kx+1;
				kmy = ky;
				smx = sx+1;
				smy = sy;
				if(kmx >0 && kmy > 0 && kmx < 8 && kmy <8) {
					
					kx = kmx;
					ky = kmy;
					
					if(kmx == sx && kmy == sy) {
						if(smx > 0 && smy > 0 && smx < 8 && smy < 8) {
							sx = smx;
							sy = smy;
						}
					}
				}
				break;
			case "T":
				kmx = kx-1;
				kmy = ky;
				smx = sx-1;
				smy = sy;
				if(kmx >0 && kmy > 0 && kmx < 8 && kmy <8) {
					
					kx = kmx;
					ky = kmy;
					
					if(kmx == sx && kmy == sy) {
						if(smx > 0 && smy > 0 && smx < 8 && smy < 8) {
							sx = smx;
							sy = smy;
						}
					}
				}
				break;
			case "RT":
				kmx = kx-1;
				kmy = ky+1;
				smx = sx-1;
				smy = sy+1;
				if(kmx >0 && kmy > 0 && kmx < 8 && kmy <8) {
					
					kx = kmx;
					ky = kmy;
					
					if(kmx == sx && kmy == sy) {
						if(smx > 0 && smy > 0 && smx < 8 && smy < 8) {
							sx = smx;
							sy = smy;
						}
					}
				}
				break;
			case "LT":
				kmx = kx-1;
				kmy = ky-1;
				smx = sx-1;
				smy = sy-1;
				if(kmx >0 && kmy > 0 && kmx < 8 && kmy <8) {
					
					kx = kmx;
					ky = kmy;
					
					if(kmx == sx && kmy == sy) {
						if(smx > 0 && smy > 0 && smx < 8 && smy < 8) {
							sx = smx;
							sy = smy;
						}
					}
				}
				break;
			case "RB":
				kmx = kx+1;
				kmy = ky+1;
				smx = sx+1;
				smy = sy+1;
				if(kmx >0 && kmy > 0 && kmx < 8 && kmy <8) {
					
					kx = kmx;
					ky = kmy;
					
					if(kmx == sx && kmy == sy) {
						if(smx > 0 && smy > 0 && smx < 8 && smy < 8) {
							sx = smx;
							sy = smy;
						}
					}
				}
				break;
			case "LB":
				kmx = kx+1;
				kmy = ky-1;
				smx = sx+1;
				smy = sy-1;
				if(kmx >0 && kmy > 0 && kmx < 8 && kmy <8) {
					
					kx = kmx;
					ky = kmy;
					
					if(kmx == sx && kmy == sy) {
						if(smx > 0 && smy > 0 && smx < 8 && smy < 8) {
							sx = smx;
							sy = smy;
						}
					}
				}
				break;
			default:
			}
		}
		kx += 1;
		ky += 1;
		sx += 1;
		sy += 1;
		
		char tmpX = (char) (kx+64-7);
		sb.append(tmpX).append(ky).append("\n");
		tmpX = (char) (sx+64-7);
		sb.append(tmpX).append(sy);
		System.out.println(sb);
	}
}
