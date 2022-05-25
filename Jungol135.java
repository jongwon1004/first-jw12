import java.util.Scanner;

public class Jungol135 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int count = 0;
        int sum = 0;
        int change = 0;
        if( num1 > num2){
            change = num2;
            num2 = num1;
            num1 = change;
        }
        for(int i = num1; i <= num2; i++){
            if( i%3 == 0){
                count++;
                sum+=i;
            }else if( i%5 == 0){
                count++;
                sum+=i;
            }
        }
        System.out.printf("%s %d\n" , "sum :" , sum);
        System.out.printf("%s %.1f" , "avg :" , (double)sum/count);
        sc.close();
    }
    
}

/*
문제
두 개의 정수를 입력받아 두 정수 사이(두 정수를 포함)에 3의 배수이거나 5의 배수인 수들의 합과 평균을 출력하는 프로그램을 작성하시오.

(평균은 반올림하여 소수 첫째자리까지 출력한다.)


입력 예
10 15
출력 예
sum : 37
avg : 12.3
*/
