package date9_19;

import javax.print.DocFlavor;

/**
 * Created by I334189 on 9/19/2016.
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 */
public class MostWater {

    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;
        if(height.length<=1)
            return 0;
        int base = j * (height[i] < height[j] ? height[i] : height[j]);
        while (i<j){
            int shortLine = height[i] < height[j] ? height[i] : height[j];
            int curr = shortLine * (j-i);
            if(curr > base){
                base = curr;
                if(height[i] < height[j]){
                    i++;
                }else{
                    j--;
                }
            }else{
                if(height[i] < height[j]){
                    i++;
                }else{
                    j--;
                }
            }
        }
        return base;
    }

    public static void main(String[] args){
        MostWater mostWater = new MostWater();
        int height[] = {1,3,3};
        System.out.print(mostWater.maxArea(height));
    }
}
