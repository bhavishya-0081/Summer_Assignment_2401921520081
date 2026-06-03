// import java.util.*;

public class ContainerWithMostWater {

   public static int maxArea(int[] height) {
      int mArea = 0;
      int left = 0;
      int right = height.length - 1;

      while (left < right) {

         int currArea = Math.min(height[left], height[right]) * (right - left);
         mArea = Math.max(mArea, currArea);

         if (height[left] < height[right]) {
            left++;
         } else {
            right--;
         }
      }

      return mArea;
   }

   public static void main(String[] args) {
      int[] height1 = {1,8,6,2,5,4,8,3,7};
      int[] height2 = {1,1};

      System.out.println(maxArea(height1)); // 49
      System.out.println(maxArea(height2)); // 1
   }
}
