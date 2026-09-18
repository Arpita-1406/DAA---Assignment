public class search_in_RotatedSortedArray {
    public static int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[left] <= nums[mid]) {

                // Target is inside left sorted half
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } 
                // Target is in right half
                else {
                    left = mid + 1;
                }

            } 
            // Right half is sorted
            else {

                // Target is inside right sorted half
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } 
                // Target is in left half
                else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println(search(nums, target));
    }

}
