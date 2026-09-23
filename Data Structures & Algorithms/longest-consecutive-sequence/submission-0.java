class Solution {
    public int longestConsecutive(int[] nums) {
        int longest=0;
        int count=0;
        Set<Integer> hs= new HashSet<>();
        for(int n:nums){
            hs.add(n);
        }
        for(int nu:hs){
            if(!hs.contains(nu-1)){
                int x=nu;
                count=1;
            
            while(hs.contains(x+1)){
                x+=1;
                count+=1;
            }
            }
            longest=Math.max(longest,count);
        }
        return longest;
    }
}
