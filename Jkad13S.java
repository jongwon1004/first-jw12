package Jkad;

import java.util.Scanner;

public class Jkad13S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("わたしは量子コンピュータECCトロピカルよ！");
        while(true){
            System.out.print("何の段を教えてほしいの？＞");
            int num = sc.nextInt();
            if( num >= 1 && num <= 9){
                for(int i = 1; i <= 9; i ++){
                    System.out.print("\t" +i*num);
                }
                System.out.println();
            }
            if( num > 9) System.out.println("そんな難しいの、わかんないわ！");
            if( num < 1) {
                System.out.println("さよなら！");
                break;
            }
        }sc.close();
    }
}
