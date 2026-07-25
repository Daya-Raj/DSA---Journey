

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums.length == 0 || nums.length == 1)
            return nums;

        int left = 0;
        int right = 0;
        int index = 0;

        int[] ans = new int[nums.length - k + 1];

        Deque<Integer> dq = new LinkedList<>();

        while (right < nums.length) {
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[right]) {
                dq.pollLast();
            }

            dq.offerLast(right);
            if (dq.peekFirst() < left) {
                dq.pollFirst();
            }
            if (right - left + 1 == k) {
                ans[index++] = nums[dq.peekFirst()];
                left++;
            }

            right++;
        }

        return ans;
    }
}