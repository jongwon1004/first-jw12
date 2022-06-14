package Jkad;
import java.util.Scanner;

public class Jkad13X {
    public static boolean ifFizz(int i){
        return i % 3 == 0;
    }

    public static boolean ifFizz2(int i){
        return i / 10 == 3;
    }
    
    public static boolean ifFizz3(int i){
        return i % 5 == 0;
    }

    public static boolean ifFizz4(int i){
        return i % 15 == 0;
    }

    public static boolean ifFizz5(int i){
        return i % 10 == 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("いくつまで叫びますか？");
        int i = sc.nextInt();
        
        String str1 = "わん！";
		String str2 = "にゃん！";
		String str3 = "わにゃん！";
        
        
        for( int a = 1; a <= i; a++){

			if(ifFizz4(a)) {
                System.out.println(str3);
            }else   if(ifFizz2(a) && ifFizz3(a)){
                System.out.println(str3);
            }else   if(ifFizz(a)) {
                System.out.println(str1);
            }else  if(ifFizz3(a)) {
                System.out.println(str2);
            }else   if(ifFizz2(a)) {
                System.out.println(str1);
            }else   if(ifFizz5(a)){
                System.out.println(str1);
            }else   System.out.println(a);
            
            
        
        }

        sc.close();

     }
    }




