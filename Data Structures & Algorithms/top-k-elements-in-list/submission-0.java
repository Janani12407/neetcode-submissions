class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int res[]=new int[k];
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> hm.get(a) - hm.get(b));
        for(int key:hm.keySet()){
            pq.offer(key);
            if(pq.size()>k){
                pq.poll();
            }
        }
        
        for(int i=k-1;i>=0;i--){
            res[i]=pq.poll();
        }
        return res;
    }
}
