package Jkad;

import java.util.Scanner;

public class Jkad14C2 {
    public static void main(String[] args) {
        System.out.println("ジャックは豆をまいた！");
        System.out.println("次の日、天まで届く豆の木に成長した！");
        System.out.println("ここを登ればきっと宝物があるに違いない！！");
        claimBeanTree();
        System.out.println("めでたし、めでたし。");
    }

    public static void claimBeanTree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ジャックは豆の木を登った！");
        System.out.print("どうしますか？（1：登る、それ以外：もう疲れた）＞");
        int num = sc.nextInt();
        if( num == 1) {
            claimBeanTree();
        }
        System.out.println("ジャックは豆の木を降りた！");
        sc.close();
    }
}
