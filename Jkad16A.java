package Jkad;
public class Jkad16A {
    public static void main(String[] args) {
        int [] score = {30 , 50, 100, 70, 95};
        System.out.println("最高得点を探します！");
        int max = score[0];

        for(int i = 0; i < score.length; i++){
            if( score[i] > max){
                max = score[i];
            }
        }System.out.println(max);
    }
    
}
