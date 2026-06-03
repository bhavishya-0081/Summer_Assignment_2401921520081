import java.util.*;

public class SquareOfSortedArray {

   public static int[] sortedSquares(int[] nums) {
      int n = nums.length;
      int[] result = new int[n];
      int left = 0;
      int right = n - 1;
      int index = n - 1;

      while (left <= right) {
         int leftSqr = nums[left] * nums[left];
         int rightSqr = nums[right] * nums[right];

         if (leftSqr > rightSqr) {
            result[index] = leftSqr;
            left++;
         }
         else {
            result[index] = rightSqr;
            right--;
         }
         index--;
      }

      return result;
   }

   public static void main(String[] args) {
      int[] nums1 = {-7,-3,2,3,11};
      int[] nums2 = {-4,-1,0,3,10};

      int[] result1 = sortedSquares(nums1);
      int[] result2 = sortedSquares(nums2);

      System.out.println("Result 1: " + Arrays.toString(result1));
      System.out.println("Result 2: " + Arrays.toString(result2));
   }
}
