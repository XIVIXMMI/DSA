/**
 * MERGE SORTED ARRAY
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
 * order, and two integers m and n, representing the number of elements in nums1
 * and nums2 respectively
 * 
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order
 * 
 * The final sorted array should not be returned by the function, but instead be
 * stored inside the array nums1 To accommodate this, nums1 has a length of m +
 * n, where the first m elements denote the elements that should be merged, and
 * the last n elements are set to 0 and should be ignored nums2 has a length of
 * n
 */

public class Solution {
  public static void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1; // pointer for nums1
    int j = n - 1; // pointer for nums2
    int k = m + n - 1; // fill position from the end

    while (j >= 0) {
      if (i > 0 && nums1[i] >= nums2[j]) {
        nums1[k] = nums1[i];
        i--;
      } else {
        nums1[k] = nums2[j];
        j--;
      }
      k--;
    }

    for (int num : nums1) {
      System.out.println(num);
    }
  }

  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 3, 0, 0, 0 };
    int[] nums2 = { 2, 5, 6 };
    int m = 3;
    int n = 3;
    merge(nums1, m, nums2, n);
  }
}
