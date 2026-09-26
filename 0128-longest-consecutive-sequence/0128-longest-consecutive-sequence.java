import java.util.*;
class Solution{
    public int longestConsecutive(int nums[]){
        HashSet<Integer> s=new HashSet<>();
        //put all element into hashset 
        for(int num:nums){
            s.add(num);
        }
        int maxLength=0;
        //check every no. if n-1 not present thenit is sarting point of equence
        for(int num:s){
            if(!s.contains(num-1)){
                int current=num;
                int length=1;

                //find consecutive numbers like 1->2->3->4
                while(s.contains(current+1)){
                    current++;
                    length++;
                }
                //step 4:store the max length
                maxLength=Math.max(maxLength,length);
            }
        }
        return maxLength;
    }
}