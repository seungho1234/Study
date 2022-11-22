/*
 * 문제 > 피자 나눠 먹기(2)
 * 설명 > 한 판에 6조각인 피자를 n명이서 똑같이 나눠 먹기
 */

public class pizza2 {
    public static void main(String[] args) {
        int[] n = {6, 10, 4};
        
        System.out.println(solution(n[0]));
        System.out.println(solution(n[1]));
        System.out.println(solution(n[2]));
	}
    
    public static int solution(int n) {
      int answer = 0;
      for(int i=1; i<=100; i++){          
          if((n*i)%6==0){
              answer = (n*i)/6;
              break;
          }
      }        
      return answer;    
    }
}