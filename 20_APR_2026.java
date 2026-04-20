// Question Link: https://leetcode.com/problems/number-of-common-factors/

class Solution {
    public int commonFactors(int a, int b) {
        int i=1;
        int count=0;
        while (i<=a){
            if(a%i==0 && b%i==0){
                count+=1;
            }
        i+=1;    
        }
        return count; 

    }
}