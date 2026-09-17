// class Solution 
// {
//     public int maxArea(int[] height) 
//     {
//     int left=0;//start from 1st line
//     int right=height.length-1;//start from lst line
//     int maxWater=0;//it will store max water found

//     while(left<right)//keep checking of left right not meet
//     {
//         int width=right-left;//dis between 2 lines
//         int h=Math.min(height[left],height[right]);//water height  is decided by shorter line
//         int area=width*h;//calc water 
//         maxWater=Math.max(maxWater,area);//save bigger value between old and curr max water

//         //move left one step if left line is small
//         if(height[left]<height[right]){
//             left++;
//         }
//         else{
//             right--;
//         }
//     }  
//     return maxWater;
//     }
// }

// /* To solve this efficiently in O(n) time, use the Two Pointer approach.
// Start with two pointers:
// left = 0; right = n - 1
// Calculate area:
// width = right - left
// height = min(height[left], height[right])
// Move the pointer with the smaller height, because moving the taller one cannot increase area. */ 

class Solution{
public int maxArea(int[] height) {
    int l = 0, r = height.length - 1;
    int maxArea = 0;
    while (l < r) {
        int area = Math.min(height[l], height[r]) * (r - l);
        maxArea = Math.max(maxArea, area);
        if (height[l] < height[r]) {
            l++;
        } else {
            r--;
        }
    }
    return maxArea;
}
}

