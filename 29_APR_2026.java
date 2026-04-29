//Q.no.3536  https://leetcode.com/problems/maximum-product-of-two-digits/


class Solution {
    public int maxProduct(int n) {
        int max = 0;
        int secondMax = 0;
        int digits;
        while(n>0){
            digits = n % 10;
            if(digits > max){
                secondMax = max;
                max = digits;
            }
            else if(digits > secondMax){
                secondMax = digits;
            }
           n = n / 10;
        }
        return max * secondMax ;
    }
}