class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Long> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            maxHeap.add((long) num);
        }
        long score = 0;
        while (k-- > 0) {
            long curr = maxHeap.poll();
            score += curr;
            curr = (long) Math.ceil((double) curr / 3);
            maxHeap.add(curr);
        }
        return score;
    }
}