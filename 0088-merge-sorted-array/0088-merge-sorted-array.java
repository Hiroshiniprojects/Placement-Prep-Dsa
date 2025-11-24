class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        mergeRec(nums1, nums2, m - 1, n - 1, m + n - 1);
    }

    private void mergeRec(int[] nums1, int[] nums2, int i, int j, int k) {
        if (j < 0) return; // nums2 fully merged

        if (i >= 0 && nums1[i] > nums2[j]) {
            nums1[k] = nums1[i];
            mergeRec(nums1, nums2, i - 1, j, k - 1);
        } else {
            nums1[k] = nums2[j];
            mergeRec(nums1, nums2, i, j - 1, k - 1);
        }
    }
}
