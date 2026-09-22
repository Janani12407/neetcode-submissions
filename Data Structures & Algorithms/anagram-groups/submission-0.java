class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> hm= new HashMap<>();
        for(String s:strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String sorted=String.valueOf(c);
            if(!hm.containsKey(sorted)){
                hm.put(sorted,new ArrayList<>());
            }
            hm.get(sorted).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}
