//leetcode problem no:319  Bulb Switcher
class Solution {
    public int bulbSwitch(int n) {
        int i=1;
        while(i*i<=n){
            System.out.println(i);
            i++;
        }
       return(i-1);
    }
}