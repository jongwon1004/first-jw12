package Jkad;

public class Jkad16Av2 {
    public static void main(String[] args) {
        int[] scores = {30, 50, 100, 70, 95};
        System.out.println("最高得点を探します！");
        int max = scores[0];
        for( int i = 0; i < scores.length; i ++ ){
            if(max < scores[i]){
                max = scores[i];
            }
        }System.out.println("最高得点は" + max + "点です！");
    }
}
