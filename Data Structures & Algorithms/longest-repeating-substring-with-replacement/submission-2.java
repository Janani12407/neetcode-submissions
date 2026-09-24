class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int max=0;
        int result=0;
        HashMap<Character,Integer> hm= new HashMap<>();
        for(int right=0;right<s.length();right++){
            hm.put(s.charAt(right),hm.getOrDefault(s.charAt(right),0)+1);
            max=Math.max(max,hm.get(s.charAt(right)));
            while((right-left+1)-max>k){
                hm.put(s.charAt(left),hm.get(s.charAt(left))-1);
                left++;
            }
            result=Math.max(result,right-left+1); 
        }
        return result;
    }
}
