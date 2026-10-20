class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
     int l=1;
     int r=0;
     for(int q:quantities){
        r=Math.max(r,q);
     }   
     int ans=r;
     while(l<=r){
        int m=l+(r-l)/2;
        int store=0;
        for(int q:quantities){
            store+=(q+m-1)/m;
        }
        if(store<=n){
            ans=m;
            r=m-1;
        }
        else{
            l=m+1;
        }
     }
     return ans;
    }
}