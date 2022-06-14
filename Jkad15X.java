package Jkad;
import java.util.Scanner;

public class Jkad15X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("板チョコを割っていきます");
		System.out.println("縦のブロックはいくつですか");
		int tate = sc.nextInt(); 
		System.out.println("横のブロックはいくつですか");
        int yoko = sc.nextInt(); 
		System.out.println("誰が試合を計算しますか(1:出木杉くん, それ以外:しずか)");
		int num = sc.nextInt(); 
        if( num == 1){
            dekisugi(tate,yoko);
        }else sizuka(tate,yoko);
        sc.close();

    }

    public static void dekisugi(int v , int h){
        System.out.println("これはなかなか手ごわいぞ！");
        System.out.println("とりあえず1回割って、それぞれをまた割って、全部で" + breakOff(v, h));

    }

    public static void sizuka(int v , int h){
        System.out.println("そんなの簡単よ！");
        System.out.println("一回割れば");
        System.out.println("全部で" + (v*h) + "にするには");


    }

    public static int breakOff(int v , int h){
        int count = 0;
        //int vv= v;
        if( v > 1 ){
            while(v > 1){
                count++;
                v/=2;
                
            }
        }
        if( h > 1){
            while( h > 1){
                count++;
                h/=2;
                
            }
        }
        return count;
    }
    
}

