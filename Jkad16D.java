package Jkad;
public class Jkad16D{
	public static void main(String[] args){
		int[] a = {1,2,3};
		
		System.out.println("a[0] : " + a[0]);
		System.out.println("a[1] : " + a[1]);
		System.out.println("a[2] : " + a[2]);
		
		System.out.println("a[0]とa[2]を入れ替えます！");
		
		int tmp; 
		tmp = a[0];
		a[0] = a[2];
		a[2] = tmp;
		
		System.out.println("a[0] : " + a[0]);
		System.out.println("a[1] : " + a[1]);
		System.out.println("a[2] : " + a[2]);
	}
}