class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> ans = new ArrayList<>();

        int k=0;
        for(int i=0;i<nums.length;i++){
            k= Math.abs(nums[i]);

            if(nums[k-1]<0){
                ans.add(k);
            }
            else{
                nums[k-1]*=-1;
            }
        }
        return ans;
    }
}