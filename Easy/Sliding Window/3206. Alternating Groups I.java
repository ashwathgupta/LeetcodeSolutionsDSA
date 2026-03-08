class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int a, b, c;
        a = 0;
        b = 1;
        c = 2;
        int sz = colors.length;
        int res = 0;
        for (int i = 0; i < sz; i++) {
            if (colors[b] != colors[a] && colors[b] != colors[c]) {
                res++;
            }
            a=(a+1)%sz;
            b=(b+1)%sz;
            c=(c+1)%sz;
        }

        return res;

    }
}


//ChatGPT solution
// class Solution {
//     public int numberOfAlternatingGroups(int[] colors) {
//         int n = colors.length;
//         int res = 0;

//         for (int i = 0; i < n; i++) {
//             int prev = colors[(i - 1 + n) % n];
//             int curr = colors[i];
//             int next = colors[(i + 1) % n];

//             if (curr != prev && curr != next) {
//                 res++;
//             }
//         }

//         return res;
//     }
// }