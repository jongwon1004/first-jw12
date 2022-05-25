import java.util.Scanner;

public class Jkad12D {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("リンゴの数を入力してください＞");
        int apple = sc.nextInt();
        System.out.print("食べる人の数を入力してください＞");
        int person = sc.nextInt();

        int a = 0; 
        while(a < person){
            System.out.println("ひとり一つずつリンゴを食べた！");
            apple--;
            a++;
            
        }System.out.println("それぞれ" + a + "個のリンゴを食べました！");
        System.out.println("残ったリンゴは" + apple + "個です！");
        sc.close();
    }
}




