class Solution {
    public String convert(String s, int numRows) {
        if (numRows==1 || numRows>=s.length()){
            return s;
        }
        StringBuilder[] rows=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();

        }
        int cr=0;
        int d=1;
        for(char c:s.toCharArray()){
            rows[cr].append(c); if(cr==0){d=1;}
            else if (cr==numRows-1){
                d=-1;}
                cr+=d;
            }
            StringBuilder result=new StringBuilder();
            for(StringBuilder row:rows){
                result.append(row);
            }
            return result.toString();
        }
}
