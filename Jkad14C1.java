package Jkad;

public class Jkad14C1 {
    public static void main(String[] args) {
        System.out.println("はじめてのおつかい！");
        System.out.println("のび太がケーキを買いに行きます");
        gotoPark();
        System.out.println("無事戻ってきました！");
    }   
    
    public static void gotoPark(){
        System.out.println("公園に着きました！");
        gotoPostOffice();
        System.out.println("公園に戻ってきました！");
    }
    public static void gotoPostOffice(){
        System.out.println("郵便局に着きました！");
        gotoBank();
        System.out.println("郵便局に戻ってきました！");
    }
    public static void gotoBank(){
        System.out.println("銀行に着きました！");
        gotoCakeShop();
        System.out.println("銀行に戻ってきました！");
    }

    public static void gotoCakeShop(){
        System.out.println("ケーキ屋に着きました！");
        System.out.println("***ケーキを買いました！***");
        System.out.println("戻ります！");
    }
}
