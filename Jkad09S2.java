import java.util.Scanner;

public class Jkad09S2{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("のび太の点数を入力してください＞");

        int num1 = sc.nextInt();

        System.out.print("しずかちゃんの点数を入力してください＞");

        int num2 = sc.nextInt();

        System.out.print("ジャイアンの点数を入力してください");

        int num3 = sc.nextInt();

        System.out.print("スネ夫の点数を入力してください＞");

        int num4 = sc.nextInt();

        System.out.print("出木杉くんの点数を入力してください＞");

        int num5 = sc.nextInt();


        int result = 0;   //一番大きい数を入れるために作る
        // Math.max( a, b )
        result =    Math.max(num1,  (Math.max(num2 , Math.max(num3 , Math.max(num4 , num5)))));
        int jw1 = result , jw2 = result , jw3 = result , jw4 = result , jw5 = result; //変わらないmax値を保存
        //一番大きい数を０に初期化
        if( jw1 == num1) num1 = 0;
        if( jw2 == num2) num2 = 0;
        if( jw3 == num3) num3 = 0;
        if( jw4 == num4) num4 = 0;
        if( jw5 == num5) num5 = 0;
        //初期化した数をまたresultに最大値を初期化
        result = Math.max(num1 , Math.max(num2 , Math.max(num3 , Math.max(num4 , num5))));

        System.out.println("二番目高い点数は" + result + "点です！");

        sc.close();
    }
}

/*
가장 큰 수를 넣기위해 변수result사용 

최대값 찾아서 result에 넣음 

만약에 최대값result가 num1라면 0 
만약에 최대값result가 num2라면 0
만약에 최대값result가 num3라면 0
만약에 최대값result가 num4라면 0
만약에 최대값result가 num5라면 0
// 최대값을 찾아 0으로 만들어 버림

0으로 만들어버리고 남은 수 중에서 최대값을 찾음

최대값을 찾아 result 에 넣고 출력 

*/ 

