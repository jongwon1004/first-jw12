package Jkad;
import java.util.Scanner;
public class Jkad16B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] name = {"ピタゴラス" , "アルキメデス" , "ユークリッド" , " エラトステネス" , "フィボナッチ"};
        while(true){
            System.out.print("何号室を見ますか？");
            int bango = sc.nextInt();
            if(bango < 0 || bango > 4) {
                System.out.println("そんな部屋番号はありません！");
            }else{
            
                System.out.println(name[bango]+ "が住んでいます！");
                break; //<<없앨것 에러 없앨려고 임시로 넣어놓음
            }
            sc.close();   //<<없앨것  에러 없앨려고 임시로 넣어놓음
        }
        
    }
}

