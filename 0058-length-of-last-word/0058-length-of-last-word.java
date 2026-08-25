class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        s=s.stripTrailing();
        int j=s.length()-1;
        while(j>=0 && s.charAt(j)!=' '){
            count++;
            j--;
        }
        return count;
    }
}