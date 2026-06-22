class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indicesTracker = new HashMap<>();
        for(int index = 0; index<nums.length; index++) {
            int complement = target - nums[index];
            if(indicesTracker.containsKey(complement)){
                return new int[] {indicesTracker.get(complement), index};
            }
            indicesTracker.put(nums[index], index);
        }
        return new int[]{};
    }
}