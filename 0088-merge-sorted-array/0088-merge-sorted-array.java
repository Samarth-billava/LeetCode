class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        int i = m - 1;       
        int j = n - 1;     
        int k = m + n - 1;  
        while (i >= 0 && j >= 0) {
            if (num1[i] > num2[j]) {
                num1[k--] = num1[i--];
            } else {
                num1[k--] = num2[j--];
            }
        }

        while (j >= 0) {
            num1[k--] = num2[j--];
        }
    }
}
