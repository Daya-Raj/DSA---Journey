class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int ans = 0;
        Set<Integer> occupied = new HashSet<>();

        Arrays.sort(reservedSeats, (a, b) -> {
            if (a[0] == b[0]) {
                return a[1] - b[1];
            }
            return a[0] - b[0];
        });
        int[] row = new int[11];
        for (int i = 0; i < reservedSeats.length; i++) {
            row[reservedSeats[i][1]] = 1;
            occupied.add(reservedSeats[i][0]);
            if (i + 1 < reservedSeats.length
                    && reservedSeats[i + 1][0] == reservedSeats[i][0]) {
                row[reservedSeats[i + 1][1]] = 1;
                continue;
            }
            if (row[2] == 0 && row[3] == 0 && row[4] == 0 && row[5] == 0) {
                ans += 1;
                if (row[6] == 0 && row[7] == 0 && row[8] == 0 && row[9] == 0) {
                    ans += 1;
                }
            } else if (row[4] == 0 && row[5] == 0 && row[6] == 0 && row[7] == 0) {
                ans += 1;
            } else if (row[6] == 0 && row[7] == 0 && row[8] == 0 && row[9] == 0) {
                ans += 1;
            }
            row = new int[11];
        }

        ans += (n - occupied.size()) * 2;

        return ans;
    }
}