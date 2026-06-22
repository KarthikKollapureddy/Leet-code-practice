class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i<nums.length; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(right > left){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0){
                    result.add(List.of(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(right>left && nums[left]==nums[left-1]) left++;
                    while(right>left && nums[right]==nums[right+1]) right--;
                } else if( sum > 0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return result;
    }
}