import java.util.Scanner;

public class Jkad09S {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("のび太の点数を入力してください＞");

        int nobi = sc.nextInt();

        System.out.print("しずかちゃんの点数を入力してください＞");

        int sizu = sc.nextInt();

        System.out.print("ジャイアンの点数を入力してください");

        int jyai = sc.nextInt();

        System.out.print("スネ夫の点数を入力してください＞");

        int sune = sc.nextInt();

        System.out.print("出木杉くんの点数を入力してください＞");

        int deki = sc.nextInt();

        int max;
        int max2;

        if (sizu > nobi) {
            max = sizu;
            max2 = nobi;
        } else {
            max = nobi;
            max2 = sizu;
        }
        if (max2 < jyai) {
            if (max < jyai) {
                max2 = max;
                max = jyai;
            } else {
                max2 = jyai;
            }
        }
        if (max2 < sune) {
            if (max < sune) {
                max2 = max;
                max = sune;
            } else {
                max2 = sune;
            }
        }
        if (max2 < deki) {
            if (max < deki) {
                max2 = max;
                max = deki;
            } else {
                max2 = deki;
            }
        }
        System.out.println(max2);
        sc.close();
    }
}
