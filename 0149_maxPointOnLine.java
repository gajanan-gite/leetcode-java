class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) return n;

        int maxCount = 1;
        for (int i = 0; i < n; i++) {
            Map<String, Integer> slopes = new HashMap<>();
            int duplicates = 0;
            int localMax = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                int dx = points[j][0] - points[i][0];
                int dy = points[j][1] - points[i][1];
                if (dx == 0 && dy == 0) {
                    duplicates++;
                    continue;
                }
                int g = gcd(dx, dy);
                dx /= g;
                dy /= g;
                if (dx < 0) {
                    dx = -dx;
                    dy = -dy;
                } else if (dx == 0) {
                    dy = Math.abs(dy);
                }
                String key = dx + "_" + dy;
                slopes.put(key, slopes.getOrDefault(key, 0) + 1);
                localMax = Math.max(localMax, slopes.get(key));
            }
            maxCount = Math.max(maxCount, localMax + duplicates + 1);
        }
        return maxCount;
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        return b == 0 ? a : gcd(b, a % b);
    }
}
