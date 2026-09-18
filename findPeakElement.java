public class findPeakElement {

    public static int FindPeakElement(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                // We are going uphill
                left = mid + 1;
            } else {
                // We are going downhill
                right = mid;
            }
        }

        return left;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        System.out.println(FindPeakElement(nums));
    }

}
