class Solution {
    public String simplifyPath(String path) {
        String arr[]=path.split("/");
        Stack<String> stack =new Stack<String>();

        for(int i=0;i<arr.length;i++){
            if(arr[i].equals("..") && !stack.empty()){
                stack.pop();
            }else if(!arr[i].equals("") && !arr[i].equals(".") && !arr[i].equals("..")){
                stack.push(arr[i]);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(String i:stack){
            sb.append("/");
            sb.append(i);
        }
        return sb.length()==0? "/" :sb.toString();
    }
}