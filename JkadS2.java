package Jkad;
import java.util.Scanner;

public class JkadS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //sumNumber(num);
        System.out.println("桁の合計： "+ sumNumber(sumNumber(num)));
        if(isMultiple3(sumNumber(sumNumber(num)))){              //if(isMultiple3(sumNumber(sumNumber(num))))
            System.out.println("３の倍数です！！");
        }else System.out.println("３の倍数じゃないです！");
        sc.close();
    }

    public static boolean isMultiple3(int n){
        if(n == 3 || n == 6 || n == 9){
            return true;
        }else return false;
    }

    public static int sumNumber(int n){
        //int sum = 0;                  
            int a = n%10;          
            n /=10;
            //int b = n/10;     //123 / 10 = 12  >> b >> n   
           // n = b;                //179154
            //sum += a;              
            if(n != 0){
                //sumNumber(n);
                //return sum;

                return a + sumNumber(n);
            }else { 
                return a;          //<<<<< ? 
            }
            
        
    }
}
