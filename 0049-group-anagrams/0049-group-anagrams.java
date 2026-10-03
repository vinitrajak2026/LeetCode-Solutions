class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> m=new HashMap<>();
        for(String s:strs){
            //convert string to character array
            char[] c=s.toCharArray();
            //sort the characters
            Arrays.sort(c);
            //convert sorted character back to string
            String k=new String(c);
            //if key doesn't exist create a new list
            if(!m.containsKey(k)){
                m.put(k,new ArrayList<>());
            }
            //add orig string to group
            m.get(k).add(s);
        }
        return new ArrayList<>(m.values());
        
    }
}