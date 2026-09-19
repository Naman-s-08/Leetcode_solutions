class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }

        Arrays.sort(intervals,Comparator.comparingInt(i -> i[0]));

        List<int[]> list=new ArrayList<>();

        int[] newInterval=intervals[0];
        list.add(newInterval);

        for( int[] interval:intervals){
            if(interval[0]<=newInterval[1]){
                newInterval[1]=Math.max(interval[1],newInterval[1]);
            }else{
                newInterval=interval;
                list.add(newInterval);
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}