class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] sc = new int[2];
        sc[0] = -1;
        sc[1] = -1;
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (target <= nums[mid]) {
                sc[0] = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (sc[0] == -1 || nums[sc[0]] != target) {
            sc[0] = -1;
            return sc;
        }
        low = 0;
        high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        sc[1] = low - 1;
        return sc;
    }
}