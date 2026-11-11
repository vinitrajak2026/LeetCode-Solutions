class Solution {
    public int numberOfPermutations(int n, int[][] requirements) 
    {
        int MOD=1_000_000_007;
        int [] req=new int[n];
        Arrays.fill(req,-1);
        int maxInv=0;
        for(int [] r:requirements){
            req[r[0]]=r[1];
            maxInv=Math.max(maxInv,r[1]);
        }
        
        int [] dp=new int[maxInv+1];
        dp[0]=1;
        for(int i =1;i<=n;i++){
            int[] newDp=new int [maxInv+1];
            long window=0;
            for(int j=0;j<=maxInv;j++){
                window+=dp[j];
                if(j>=i){
                    window -=dp[j-i];

                }
                newDp[j]=(int)((window %MOD+MOD)%MOD);
            }
            dp=newDp;
            if(req[i-1]!=-1){
                int required=req[i-1];
                for(int j=0;j<=maxInv;j++){
                    if(j!=required){
                        dp[j]=0;
                    }
                }
            }
        }
        return dp[req[n-1]];
    }
}