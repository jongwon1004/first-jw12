import java.util.Scanner;

public class Jkad13X2 {
    public static boolean ifFizz(int i){     //わん！
        if(i%3 == 0){
            return true;
        }else return false;
    }

    public static boolean ifFizz2(int i){  //わん！
        if(i/10 == 3){
            return true;
        }else return false;
    }
    
    public static boolean ifFizz3(int i){  //にゃん！
        if(i%5 ==0){
            return true;
        }else return false;
    }


    public static boolean ifFizz5(int i){  //わん！
        if(i%10 == 3){
            return true;
        }return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("いくつまで叫びますか？");
        int i = sc.nextInt();
        
        String str1 = "わん！";
		String str2 = "にゃん！";
		String str3 = "わにゃん！";
        
        
        for( int a = 1; a <= i; a++){

            if(ifFizz(a)&&ifFizz3(a) || ifFizz2(a)&&ifFizz3(a)) System.out.println(str3);
            else if(ifFizz(a)) {
                System.out.println(str1);
            }else   if(ifFizz3(a)) {
                System.out.println(str2);
            }else if(ifFizz5(a)) {
                System.out.println(str1);
            }else if(ifFizz2(a)){
                System.out.println(str1);
            }else   System.out.println(a);
        
        }

        sc.close();

     }
    }


