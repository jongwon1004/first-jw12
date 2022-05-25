import java.util.Scanner;

public class Jungol133 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int count = 0;
        if( num <= 100){
            for( int i = 0; i < num; i ++){
                int num2 = sc.nextInt();
                sum+= num2;
                count++;
            }
        }System.out.printf("%.2f" , (double)sum/count);
        sc.close();
        
    }
}

/*
문제
100 이하의 자연수 n을 입력받고 n개의 정수를 입력받아 평균을 출력하는 프로그램을 작성하시오.

(평균은 반올림하여 소수 둘째자리까지 출력하도록 한다.)


입력 예
3
99 65 30
출력 예
64.67
*/
