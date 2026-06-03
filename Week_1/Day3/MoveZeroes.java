import java.util.*;

public class MoveZeroes {
   
   public static void moveZeroes(int[] nums) {
      int insertPos = 0;

      for (int num : nums) {
         if (num != 0) {
            nums[insertPos] = num;
            insertPos++;
         }
      }

      while (insertPos < nums.length) {
         nums[insertPos] = 0;
         insertPos++;
      }
   }

   public static void main(String[] args) {
      int[] nums1 = {0,1,0,3,12};
      int[] nums2 = {0};

      moveZeroes(nums1);
      moveZeroes(nums2);

      System.out.println(Arrays.toString(nums1));
      System.out.println(Arrays.toString(nums2));
   }
}
