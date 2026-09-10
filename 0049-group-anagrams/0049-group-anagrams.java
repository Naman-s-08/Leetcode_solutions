class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String,List<String>> hm=new HashMap<>();
       for(String chars : strs){

        String currWord=sortWord(chars);

        if(hm.containsKey(currWord)){
            List<String> existingGroup=hm.get(currWord);
            existingGroup.add(chars);
            hm.put(currWord,existingGroup);
        }else{
            List<String> newGroup=new ArrayList<>();
            newGroup.add(chars);
            hm.put(currWord,newGroup);
        }
       }
       List<List<String>> res=new ArrayList<>();
       for(List<String> str:hm.values()){
        res.add(str);
       }
       return res;
    }
    private String sortWord(String currWord){
        char[] charArray=currWord.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}