package Jkad;
public class Jkad16X {
    public static void main(String[] args) {
        int[] heights = {160, 155, 170, 150, 175, 180, 165};
        System.out.println("一番背の高い人を一番後ろにします！");
        int change = 0;
        
        for(int j = 0; j < heights.length; j++){
            for(int i = 0 ; i < heights.length-1; i++){
                if( heights[i+1] < heights[i]){
                    change = heights[i];
                    heights[i] = heights[i+1];
                    heights[i+1] = change;
                }
            }
        }

        for( int i = 0; i < heights.length; i ++){
            System.out.println(heights[i]);
        }
    }
}