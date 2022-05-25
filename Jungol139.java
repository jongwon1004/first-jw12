import java.util.Scanner;

public class Jungol139{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		
		int num2 = sc.nextInt();
		
		if( num1 >= 1 && num2 >= 1 && num1 <= 9 && num2 <= 9){
		
		if(num1 > num2 ){
		
			for( int i = 1; i <= 9; i++) {
			
				for ( int j = num1; j >= num2;  j--){
					System.out.printf("%d * %d = %2d   " , j,i,j*i);
				}System.out.println();
			}
		}else 
		
			for( int i = 1; i <= 9; i++) {
				
				for ( int j = num1; j <= num2; j++){
					System.out.printf("%d * %d = %2d   " , j,i,j*i);
				}System.out.println();
			}
		}else System.out.println("正しい数字を入力してください");
        sc.close();
	}
}