package Jkad;

public class Jkad16Dv2 {
    public static void main(String[] args) {
        int [] a = {1 , 2 , 3};
        for(int i = 0; i < a.length; i ++){
            System.out.println("a[" + i + "] : " + a[i]);
        }
        System.out.println("a[0]とa[2]を入れ替えます！");
        int change;
        change = a[0];
        a[0] = a[2];
        a[2] = change;
        for(int i = 0; i < a.length; i ++){
            System.out.println("a[" + i + "] : " + a[i]);
        }
    }
}
