import java.util.Scanner;

public class jungol117 {
    public static void main(String[] args) {
        double num1 , num2 , num3 = 0;

        Scanner sc = new Scanner(System.in);

        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();

        System.out.println("sum " +((int)num1+(int)num2+(int)num3));
        System.out.println("avg " +(int)(num1+num2+num3)/3);
        sc.close();
    }
}

/*
문제
실수로 된 3과목의 점수를 입력받아 총점은 정수부분의 합계를 출력하고 평균은 실수의 평균을 구한 뒤 정수부분만 출력하는 프로그램을 작성하시오.


입력 예
70.5 95.5 68.5
출력 예
sum 233
avg 78
*/