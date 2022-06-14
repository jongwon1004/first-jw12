package Jkad;

import java.util.Scanner;

public class Jkad14B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("直角二等辺三角形の面積を求めます！");
        System.out.print("斜辺の長さを入力してください＞");
        int num = sc.nextInt();
        System.out.print("誰に計算させますか？（1：出木杉、2：しずか）＞");
        int who = sc.nextInt();
        if( who == 1) dekisugi(num);
        if( who == 2) sizuka(num);
        sc.close();
    }

    public static void dekisugi(int length){
        System.out.println();
        System.out.println("三角形の面積は底辺×高さ÷2だから");
        System.out.println("底辺と高さを求めればいいんだ！");
        double d = (double)(length/1.41421356);
        System.out.println("底辺が" + d + "、高さも同じだから");
        System.out.println("直角二等辺三角形の面積は" + (d*d/2) + "だよ！");
    }

    public static void sizuka(int length){
        System.out.println();
        System.out.println("直角二等辺三角形が4つで正方形になるから");
        System.out.println("正方形の面積を求めて4で割ればいいんだわ！");
        System.out.println("正方形の面積は" + (length*length) + "だから");
        System.out.println("直角二等辺三角形の面積は" + (double)(length*length)/4 +"ね!");
    }
}
