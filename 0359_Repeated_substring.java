class Solution {
    public boolean repeatedSubstringPattern(String s) {

        int n = s.length();

        // Try every possible substring length
        for (int len = 1; len <= n / 2; len++) {

            // The substring length must divide the total length
            if (n % len == 0) {

                String part = s.substring(0, len);

                StringBuilder sb = new StringBuilder();

                // Repeat the substring
                for (int i = 0; i < n / len; i++) {
                    sb.append(part);
                }

                // Check if it becomes the original string
                if (sb.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }
}
