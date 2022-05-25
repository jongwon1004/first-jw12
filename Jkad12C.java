import java.util.Scanner;
public class Jkad12C {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("1より大きい整数を入力してください＞");
        
        int num = sc.nextInt();
        System.out.println("1から" + num + "まで加算します！");
        
        int a = 0; int sum = 0;
        while( a < num){
            a++;
            sum+=a;
        }System.out.println("合計は"+sum+"です！");
        sc.close();

    }
    
}
