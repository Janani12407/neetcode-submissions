class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        HashSet<List<Integer>> triple= new HashSet<>();
        for(int i=0;i<n-1;i++){
            HashSet<Integer> hs=new HashSet<>();
            for(int j=i+1; j<nums.length; j++){
                int third = -nums[i] - nums[j];
                if(hs.contains(third)){
                    List<Integer> al= new ArrayList<>();
                    al.add(nums[i]);
                    al.add(nums[j]);
                    al.add(third);
                    Collections.sort(al);
                    triple.add(al);
                }
                hs.add(nums[j]);
            }
        }
            List<List<Integer>> ans = new ArrayList<>(triple);
            return ans;
        
    }
}
