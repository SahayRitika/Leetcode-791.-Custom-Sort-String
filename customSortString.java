class Solution {
    public String customSortString(String order, String s) {
       Map<Character, String> map= new HashMap<>();
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           map.put(ch, map.getOrDefault(ch,"")+ch);
       }
       String ans="";
       for(int i=0;i<order.length();i++){
           char c=order.charAt(i);
           if(map.containsKey(c)){
               ans+=map.get(c);
               map.remove(c);
           }
       }
       for(String st: map.values()){
           ans+=st;
       }
       return ans;
    }
}
