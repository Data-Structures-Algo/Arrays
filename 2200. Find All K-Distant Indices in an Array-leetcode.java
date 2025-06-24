class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> keyIndices = new ArrayList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                keyIndices.add(i);
            }
        }

        // |i - j| <= k
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            while (j < keyIndices.size() && keyIndices.get(j) < i - k) {
                j++; // skip keys too far left
            }

            // Check if this key index is close enough
            if (j < keyIndices.size() && Math.abs(keyIndices.get(j) - i) <= k) {
                result.add(i);
            }
        }

        return result;
    }
}
