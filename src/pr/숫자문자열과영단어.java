package pr;

public class 숫자문자열과영단어 {
	public static void main(String[] args) {
		String a = "one4seveneight";
		System.out.println(solution(a));
	}
	
	 public static int solution(String s) {
	        int answer = 0;
	        String strArr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
	        String tmp = "";
	        for(int i=0; i<s.length(); i++){
	            char n = s.charAt(i);
	            
	            if(Character.isDigit(n)) {
	            	tmp+=n;
	            }
	      
	            String temp = String.valueOf(n);
	            for(int j=i+1; j<s.length(); j++){
	                temp+= s.charAt(j);
	                
	                for(int k=0; k<strArr.length; k++){
	                    if(strArr[k].equals(temp)){
	                        tmp += k;
	                        i = j;
	                        break;
	                    }
	                }
	                
	            }
	            
	        }
	        answer = Integer.parseInt(tmp);
	        
	        
	        return answer;
	    }
}
