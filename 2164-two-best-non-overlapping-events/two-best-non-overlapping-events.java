class Solution {
    public int maxTwoEvents(int[][] events) {

        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        int n = events.length;

        // suffix[i] = maximum value from i to n-1
        int[] suffix = new int[n];

        suffix[n - 1] = events[n - 1][2];

        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = Math.max(suffix[i + 1], events[i][2]);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {

            // Take only this event
            ans = Math.max(ans, events[i][2]);

            // Find first event whose start > current end
            int next = binarySearch(events, events[i][1]);

            if (next < n) {
                ans = Math.max(
                    ans,
                    events[i][2] + suffix[next]
                );
            }
        }

        return ans;
    }

    private int binarySearch(int[][] events, int end) {

        int low = 0;
        int high = events.length;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (events[mid][0] > end) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}