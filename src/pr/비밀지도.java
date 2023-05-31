package pr;

public class 비밀지도 {

	public static void main(String[] args) {
		int a1[] = {9,20,28,18,11};
		int a2[] = {30,1,21,17,28};
		String arr[] = solution(5,a1,a2);
	}
	
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++){
            
            String a = Integer.toBinaryString(arr1[i]);
            String b = Integer.toBinaryString(arr2[i]);
            
            if(a.length() < 5){
                for(int j=0; j<5-a.length(); j++){
                    a = "0"+a;
                }
            }
            if(b.length() < 5){
            	int length = 5-b.length();
                for(int j=0; j<5-b.length(); j++){
                    b = "0"+b;
                }
            }
            
           
            String tmp="";

            for(int k2=0; k2<5; k2++){
                char ca = a.charAt(k2);
                char cb = b.charAt(k2);

                if(ca == '1' || cb == '1'){
                    tmp+="#";
                }else{
                    tmp+= " ";
                }
            }
            answer[i] = tmp;

        }
        
        
        return answer;
    }
}
