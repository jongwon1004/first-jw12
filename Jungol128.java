import java.util.Scanner;
public class Jungol128{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int count1 = 0; int count2 = 0;  
    int count3 = 0;

    while(true){
        int num = sc.nextInt();

        if( num > 0){
            count3++;
            if(num%3 ==0){
            count1++;
        }else if(num%5 == 0){
            count2++;
        }
        }else break;
        
        sc.close();
    }System.out.println(count3 - (count1+count2));
    }
}