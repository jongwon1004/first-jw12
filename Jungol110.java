import java.util.Scanner;

public class Jungol110 {
    public static void main(String[] args) {

        double yard = 91.44;
        Scanner sc = new Scanner(System.in);

        System.out.print("yard? ");
        double num = sc.nextDouble();
        System.out.print(num + "yard = ");
        System.out.printf("%.1f", yard * num);
        System.out.print("cm");

        sc.close();

    }

}