class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Boolean> map=new HashMap<>();
        int res=0;

        for(int num:nums){
            map.put(num,Boolean.FALSE);
        }

        for(int num : nums){
            int curlen=1;
            //forward
            int nextnum=num+1;
            while(map.containsKey(nextnum) && map.get(nextnum)==false){
                curlen++;
                map.put(nextnum,Boolean.TRUE);
                nextnum++;
            }

            int prevnum=num-1;
            while(map.containsKey(prevnum) && map.get(prevnum)==false){
                curlen++;
                map.put(prevnum,Boolean.TRUE);
                prevnum--;

            }
            res=Math.max(curlen,res);
        }
        return res;
    }
}