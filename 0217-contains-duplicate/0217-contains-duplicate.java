class Solution {
    public boolean containsDuplicate(int[] nums) {
       //hashset store only unique elem
       HashSet<Integer> s=new HashSet<>();
       //traverse every elem in array
       for(int num :nums)//value based
       {
//add(num) returns:
 // true  -> if num is not already present else false
 if(!s.add(num)){
    //number already present so dublicate found
    return true;
 }
       } 
       return false;
    }
}