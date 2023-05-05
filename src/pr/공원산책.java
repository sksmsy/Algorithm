package pr;

import java.util.StringTokenizer;

public class 공원산책 {

	public static void main(String[] args) {
		
		String a[] ={"OSO","OOO","OXO","OOO"};
		String b[] = {"E 2","S 3","W 1"};
		
		int[] ss = solution(a,b);
	}
	
    public static int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        
        answer = new int[2];
        
        int x=-1;
        int y=-1;
        String map[][] = new String[park.length][park[0].length()];
        for (int i = 0; i < park.length; i++) {
        	String str = park[i];
        	
        	for (int j = 0; j < str.length(); j++) {
        		if(str.charAt(j)=='S') {
        			x = i;
        			y = j;
        		}
        		
        		map[i][j] = str.charAt(j)+""; 
			}
		}
        StringTokenizer st;
        for (int i = 0; i < routes.length; i++) {
			st = new StringTokenizer(routes[i], " ");
			String r = st.nextToken();
			int len = Integer.parseInt(st.nextToken());
        	
			int tx = x;
			int ty = y;
			
			if(r.equals("E")) {
				ty+=len;
			}else if(r.equals("W")) {
				ty-=len;
			}else if(r.equals("S")) {
				tx+=len;
			}else {
				tx-=len;
			}
			
			if(tx >= 0 && ty >= 0 && tx < map.length && ty < map[0].length &&!("X".equals(map[tx][ty]))) {
				x = tx;
				y = ty;
			}else {
				continue;
			}
			
		}
        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }
    

}
