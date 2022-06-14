package Jkad;

import java.util.Scanner;

public class Jkad14S {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("あなたは勇者です！");
        System.out.println("がんばって城までたどり着いてください！！");
        gotoTown();

    }
    public static void gotoTown(){
        System.out.println("あなたは町にいます。");
        System.out.print("どちらへ進みますか？（1：草原、2：森）＞");
        int num = sc.nextInt();
        if( num == 1) gotoGrassland();
        if( num == 2) gotoForest();
        System.out.print("←町");

    }
    public static void gotoGrassland(){
        System.out.println("あなたは草原にいます。");
        System.out.print("どちらへ進みますか？（1：町、2：森）＞");
        int num = sc.nextInt();
        if( num == 1) gotoTown();
        if( num == 2) gotoForest();
        System.out.print("←草原");
    }
    public static void gotoForest(){
        System.out.println("あなたは森にいます。");
        System.out.print("どちらへ進みますか？（1：草原、2：荒地）＞");
        int num = sc.nextInt();
        if( num == 1) gotoGrassland();
        if( num == 2) gotoWasteland();
        System.out.print("←森");
    }
    public static void gotoWasteland(){
        System.out.println("あなたは荒地にいます。");
        System.out.print("どちらへ進みますか？（1：草原、2：洞窟）＞");
        int num = sc.nextInt();
        if( num == 1) gotoGrassland();
        if( num == 2) gotoCave();
        System.out.print("←荒地");
    }
    public static void gotoCave(){
        System.out.println("あなたは洞窟にいます。");
        System.out.print("どちらへ進みますか？（1：森、2：城）＞");
        int num = sc.nextInt();
        if( num == 1) gotoForest();
        if( num == 2) gotoCastle();
        System.out.print("←洞窟");

    }
    public static void gotoCastle(){
        System.out.println("城に着きました！");
        System.out.println("履歴を表示します！");
        System.out.print("城");
    }
}
