import java.util.*;
/*
 * 문제 > 배열 회전시키기
 * 설명 > "direction" 매개변수에 따른 배열 회전시키기
 * 
 */
public class arrRotation {
    public static void main(String[] args) {
        int[] num = {1,2,3};    //right 3 1 2
        int[] num2 = {10,9,6};  //left  9 6 10
        System.out.println(Arrays.toString(rightShift(num)));   
        System.out.println(Arrays.toString(leftshift(num2)));
    }

    //오른쪽 shift함수
    public static int[] rightShift(int[] numbers){
        int tempRight = numbers[numbers.length-1];
        if("".equals(numbers))
        for(int i=numbers.length-1; i>=1; i--){        
            numbers[i] = numbers[i-1];
        }
        numbers[0] = tempRight;

        return numbers;
    }
    //왼쪽 shift함수
    public static int[] leftshift(int[] numbers){
        int tempRight = numbers[0];
        
        for(int i=0; i<=numbers.length-2; i++){        
            numbers[i] = numbers[i+1];
        } 
        numbers[numbers.length-1] = tempRight;

        return numbers;
    }

}