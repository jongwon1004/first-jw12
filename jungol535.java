import java.util.*;

public class jungol535 {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		double num = sc.nextDouble();
		
		switch((int)num){
			case 4:
			System.out.println("scholarship");
			break;
			case 3:
			System.out.println("next semester");
			break;
			case 2:
			System.out.println("seasonal semester");
			break;
			case 1:
			System.out.println("retake");
			break;
		}

        sc.close();
	}
}