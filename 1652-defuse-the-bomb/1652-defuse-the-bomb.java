class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] arr = new int[n];

        // Case 1: if  k > 0 
        if (k > 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j) % n];
                }
                arr[i] = sum;
            }
            return arr;
        } 
         // Case 2: if  k = 0 
        else if (k == 0) {
            for(int i = 0; i < n; i++){
                arr[i] = 0;
            }
        }
         // Case 1: if  k < 0 → previous |k| elements
        else{
            int K = Math.abs(k);
            for(int i = 0; i < n; i++){
                int sum = 0;
                for(int j = 1; j <= K; j++){
                    sum += code[(i - j + n) % n];
                }

                arr[i] = sum;
            }
            return arr;
        }
        
        return arr;
    }
}