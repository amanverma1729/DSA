class Solution {
    public int kthFactor(int n, int k) {
        int count = 0;
        int i = 1;

        while (i <= n) {
            if (n % i == 0) {
                count++;

                if (count == k) {
                    return i;   // return kth factor
                }
            }
            i++;
        }

        return -1; // if less than k factors
    }
}