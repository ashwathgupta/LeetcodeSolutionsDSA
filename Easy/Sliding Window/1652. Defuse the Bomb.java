class Solution {
    public int[] decrypt(int[] code, int k) {
        if (k == 0) {
            return new int[code.length];

        }
        int sz = code.length;
        if (sz == 1) {
            if (k == 0) {
                code[0] = 0;
            } else {
                code[0] = code[0] * k;
            }
        }

        int res[] = new int[sz];

        if (k > 0) {
            int sum = 0, i = 1, start = i;
            while (i <= k) {
                sum += code[i % sz];
                i++;
            }
            for (int j = 0; j < sz; j++) {
                res[j] = sum;
                sum = sum - code[start % sz] + code[i % sz];
                start++;
                i++;
            }

        }

          if (k < 0) {
            int sum = 0, i = sz-1, start = sz+k;
            while (i >= start) {
                sum += code[i];
                i--;
            }
            i=sz;
            for (int j = 0; j < sz; j++) {
                res[j] = sum;
                sum = sum - code[start % sz] + code[i % sz];
                start++;
                i++;
            }

        }
        return res;
    }
}


/*
* ChatGPT optimized solution
*
*/


// class Solution {
//     public int[] decrypt(int[] code, int k) {
//         int n = code.length;
//         int[] res = new int[n];
//         if (k == 0) return res;

//         int sum = 0;

//         if (k > 0) {
//             // sum of next k elements for index 0: code[1]..code[k]
//             for (int i = 1; i <= k; i++) {
//                 sum += code[i % n];
//             }
//             for (int i = 0; i < n; i++) {
//                 res[i] = sum;
//                 // slide window: drop code[i+1], add code[i+k+1]
//                 sum -= code[(i + 1) % n];
//                 sum += code[(i + k + 1) % n];
//             }
//         } else { // k < 0
//             int kk = -k;
//             // sum of previous kk elements for index 0: code[n-1]..code[n-kk]
//             for (int i = 1; i <= kk; i++) {
//                 sum += code[(n - i) % n];
//             }
//             for (int i = 0; i < n; i++) {
//                 res[i] = sum;
//                 // slide window backwards: drop code[i-kk], add code[i]
//                 sum -= code[(i - kk + n) % n];
//                 sum += code[i];
//             }
//         }

//         return res;
//     }
// }
