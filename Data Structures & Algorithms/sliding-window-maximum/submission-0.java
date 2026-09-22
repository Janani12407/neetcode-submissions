class Solution {
    public int[] maxSlidingWindow(int[] arr, int k) {
        int n=arr.length;
        int res[]=new int[n-k+1];
        PriorityQueue<int[]>pq=new PriorityQueue<>((a, b)->Integer.compare(b[0], a[0]));
        for(int i=0;i<k;i++){
            pq.offer(new int[]{arr[i],i});
        }
        int id=0;
        res[id++]=pq.peek()[0];
        for(int i=k;i<n;i++){
            while(!pq.isEmpty() &&pq.peek()[1]<=i-k)pq.poll();
            pq.offer(new int[]{arr[i],i});
            res[id++]=pq.peek()[0];
        }
    return res;
    }
}
