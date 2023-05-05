package pr;

public class 덧칠하기 {
    public int solution(int n, int m, int[] section) {

        int rol = section[0];
        
        int start = 1;
        for(int i=1; i<section.length; i++){
            
            if(rol + m - 1 < section[i]){
                start++;
                rol = section[i];
            }
            
        }
        return start;
    }
}
