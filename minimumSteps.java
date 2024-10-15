//2938. Separate Black and White Balls

class Solution {
    public long minimumSteps(String s) {
        int last = 0;
        long count = 0;
        for (int current = 0; current < s.length(); current++) {
            if (s.charAt(current) == '0') {
                count += (current - last);
                last++;
            }
        }
        return count;
    }
}