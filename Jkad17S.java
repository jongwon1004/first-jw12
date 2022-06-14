package Jkad;
import java.util.Scanner;
public class Jkad17S{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i <  num; i++) {
            System.out.print(fibonacci(i) + " ");            
        }
        sc.close();
    }

    public static int fibonacci(int n){

        if( n == 0 || n == 1) return n;
        else{
        return fibonacci(n-1) + fibonacci(n-2);
        }
    
    }
}