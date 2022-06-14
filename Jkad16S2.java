package Jkad;
public class Jkad16S2 {
    public static void main(String[] args) {
            //순서 바꾸기
        int[] cards = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};    

        for(int i = 0; i < cards.length; i ++){
            int n = (int)(Math.random() * 10);    //0~9
            int tmp = cards[i];          //배열 첫번째 인덱스를  변수ｔｍｐ에 저장  
            cards[i] = cards[n];         
            cards[n] = tmp;
        }
        for( int i = 0; i < cards.length; i ++){
            System.out.println("cards[" +i + "] : " + cards[i]);
        }   
    }
}
