import java.util.Scanner;

public class Jkad12Dren {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
            int i = 1; int count = 0; int sum = 0;

        while(true){
            System.out.print(i +"人目の点数を入力してください＞");
            i++;
            int num = sc.nextInt();
            if(num >= 0){
                sum+= num;
                count++;
            }else break;
        }System.out.println((i-1)+"人の合計は"+ sum + "です！");
        System.out.println((i-1)+"人の平均は" + (double)sum/count + "です！");
        sc.close();
    }
}

 