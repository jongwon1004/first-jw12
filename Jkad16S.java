package Jkad;
public class Jkad16S {
    public static void main(String[] args) {
        int[] heights = {160, 155, 170, 150, 175, 180, 165};  //indexは６まである
        System.out.println("一番背の高い人を一番後ろにします！");
        int change = 0;
        for(int i = 0 ; i < heights.length-1; i++){   //height[i+1] まで表示するため
            if( heights[i+1] < heights[i]){
                change = heights[i];
                heights[i] = heights[i+1];
                heights[i+1] = change;
            }
        }

        for( int i = 0; i < heights.length; i ++){
            System.out.print(heights[i] + " ");
        }
    }
}
    
