package Jkad;

public class Jkad26S2 {
    public static void main(String[] args) {
        // 素数の判定格納用
        boolean isPrime[] = new boolean[101]; // 配列は０スタート
        // 初期化falseなので全部trueにする
        for (int i = 0; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        int count = 0;
            

        for(int i = 2; i < isPrime.length; i++){
            if(isPrime[i]){
                System.out.print(i + " ");
            }
        }

        // for(int i = 2; i < isPrime.length; i++){
        // System.out.print(i + " ");
        // }
    }
}
