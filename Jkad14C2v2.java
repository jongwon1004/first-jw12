package Jkad;

import java.util.Scanner;

public class Jkad14C2v2{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("ジャックは豆をまいた！");
		System.out.println("次の日、天まで届く豆の木に成長した！");
		System.out.println("ここを登ればきっと宝物があるに違いない！！");
		
		int count = 0;
		claimBeanTree();
		while(true){
			count++;
			System.out.print("どうしますか？（1：登る、それ以外：もう疲れた）＞");
		int num = sc.nextInt();
		if( num == 1 ){
			claimBeanTree();
		}else {
			for( int i = 0 ; i < count; i++){
				
			System.out.println("ジャックは豆の木を降りた！");
			}
			break;
		}
		}
		System.out.println("めでたし、めでたし。");
		sc.close();
	
	}
	
	public static void claimBeanTree(){
		System.out.println("ジャックは豆の木を登った！");
	}
}
    

