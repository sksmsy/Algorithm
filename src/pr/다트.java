package pr;

public class 다트 {

	public static void main(String[] args) {
		System.out.println(solution("1D#2S*3S"));
	}
    public static int solution(String dartResult) {
        int answer = 0;
        
        //1S2D*3T*    1*2 + 4*2*2 + 27*2 
        //1S2D3T* 
        int arr[] = new int[3];
        
        int idx = 0;
        int k = 0;
        int befScr = 0;
        while(idx<dartResult.length()){
            String num = dartResult.charAt(idx)+"";
            int s = Integer.parseInt(num);
            String typ = dartResult.charAt(idx+1)+"";
            if(isNumeric(typ)) {
            	num+=typ;
            	
            	s = Integer.parseInt(num);
            	idx+=1;
            }
            char p = dartResult.charAt(idx+1);
            
            int score = 0;
            if(p == 'S'){
                score = s*1;
            }else if(p == 'D'){
                score = s*s;
            }else{
                score = s*s*s;
            }
            
     
            if(idx+2 < dartResult.length() &&(dartResult.charAt(idx+2) =='*' || dartResult.charAt(idx+2) =='#')){
                
                if(dartResult.charAt(idx+2) =='*'){
                    score *=2;
                    arr[k] = score;
                    if(k != 0) {
                    	
                    	score+= arr[k-1];
                    }
                }else{
                	score -= score*2;
                	arr[k] = score;
                }
                
                idx+=3;
            }else{
                idx += 2;
                arr[k] = score;
            }   
            answer += score;
            k+=1;
        }
        
        return answer;
    }
	private static boolean isNumeric(String typ) {
		try {
			Integer.parseInt(typ);
			return true;
		}catch(NumberFormatException ex){
			return false;
		}
	}
}
