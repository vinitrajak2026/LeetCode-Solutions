class Solution
 {
    public int majorityElement(int[] nums)
     {
        //var to store max curr majority cand
      int candidate =0;
      //count keep tracks of candidate strength
      int count=0;
      //traverse every elem in array
      for(int num:nums)
      {
        //if c=0 we dont have a curr cand so choose curr no as new candidate
        if(count==0)
        {
            candidate=num;
        }//if curr no is same as cand inc it counts bcs it support cand
        if(num==candidate){
            count++;
        }
        else
        {
            count--;
        }
      }  
      return candidate;
    }
}
 
// Idea:
// If same number comes → increase count
// If different number comes → decrease count
// Different elements cancel each other
// Majority element survives at the end

//dry run:
//For nums = [2,2,1,1,1,2,2]
// | Current Number | Candidate | Count | Explanation                      |
// | -------------- | --------- | ----- | -------------------------------- |
// | 2              | 2         | 1     | Count was 0, choose 2            |
// | 2              | 2         | 2     | Same as candidate, count++       |
// | 1              | 2         | 1     | Different, count--               |
// | 1              | 2         | 0     | Different, count--               |
// | 1              | 1         | 1     | Count is 0, choose new candidate |
// | 2              | 1         | 0     | Different, count--               |
// | 2              | 2         | 1     | Count is 0, choose 2             |
