import java.util.Scanner;
public class Jungol134 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        int count2 =0;
        for(int i = 0; i < 10; i++){
            int num = sc.nextInt();
            if(num %2 == 0){
                count++;
            }else count2++;
        }System.out.printf("%s %d\n" , "even :" , count);
        System.out.printf("%s %d" , "odd :" , count2);
        sc.close();
        
    }
}

/*
10개의 정수를 입력받아 입력받은 수들 중 짝수의 개수와 홀수의 개수를 각각 구하여 출력하는 프로그램을 작성하시오.


입력 예
10 20 30 55 66 77 88 99 100 15
출력 예
even : 6
odd : 4
*/