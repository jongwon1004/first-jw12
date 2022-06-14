package Jkad;
import java.util.Scanner;

public class Jkad14A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ここはECC苦情処理センターです！");
        System.out.println("優秀なスタッフが対応します！");
        while(true){
            int random = (int)(Math.random()*100);
            System.out.println("苦情番号：" + random + "を受け付けた！");
            System.out.print("どうしますか？（1：対応する、それ以外：もうやだ）＞");
            int num = sc.nextInt();
            if( num == 1){
                nobita(random);
            }else {
                System.out.println(" お疲れ様でした！");
                break;
            }
        }sc.close();
    }
    public static void nobita(int n){
        System.out.println("のび太 「ぼくにまかせて！」");
        if(n < 20) {
            System.out.println("のび太が対応しました！");
        }else {
            System.out.println("のび太 「・・・ジャイアン、お願い！」");
            jaian(n);
        }

    }
    public static void jaian(int n){
        System.out.println("ジャイアン「オレさまにまかせろ！」");
        if( n%5 ==0){
            System.out.println("ジャイアンが対応しました！");
        }else {
            System.out.println("ジャイアン　「・・・スネ夫、お前にゆずってやる！」");
            suneo(n);
        }
    }
    public static void suneo(int n){
        System.out.println("スネ夫「ぼくの出番だ！」");
        if( n%3 == 0){
            System.out.println("スネ夫が対応しました！");
        }else {
            System.out.println("スネ夫　「・・・出木杉！まかせた！」");
            dekisugi(n);
        }
    }
    public static void dekisugi(int n){
        System.out.println("出木杉　「こんなの簡単さ」");
        System.out.println("出木杉が対応しました！");
    }
}
