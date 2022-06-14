package Jkad;

public class Jkad16S2v2 {
    public static void main(String[] args) {
        int [] cards = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int random = (int)(Math.random()*9);
        int change = 0;
        for(int i = 0; i < cards.length; i ++){
            change = cards[i];
            cards[i] = cards[random];
            cards[random] = change;
        }
        for(int i = 0; i < cards.length; i ++){
            System.out.println("cards[" + i + "] : " + cards[i]);
        }
    }
}
