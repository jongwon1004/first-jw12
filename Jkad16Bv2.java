package Jkad;

import java.util.Scanner;

public class Jkad16Bv2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] name = {"ピタゴラス" ,"アルキメデス" ,
                          "ユークリッド" ,"エラトステネス" ,"フィボナッチ"};
        while(true){
            System.out.print("何号室を見ますか？");
            int num = sc.nextInt();
            if(num >= 0 && num <= 4){
                System.out.println(name[num] + "が住んでいます！");
            }else System.out.println("そんな部屋番号はありません！");
            sc.close(); // 에러없앨려고 넣음
        }
    }
}
