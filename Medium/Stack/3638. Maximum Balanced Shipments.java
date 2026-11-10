class Solution {
    public int maxBalancedShipments(int[] weight) {

        Stack<Integer> stk = new Stack<>();
        for (int i = weight.length - 1; i >= 0; i--) {
            stk.push(weight[i]);
        }

        int res = 0,max=0;
        while (!stk.isEmpty()) {
            
            if (stk.peek() < max && max != 0) {
                res++;
                max = 0;
                stk.pop();
            } else if (stk.peek() < max) {
                stk.pop();
            }
            else {
                max = stk.pop();
            }
        }

        return res;

    }
}


//AI optimized solution. Leetcode placed it in stack section of problems but there is no need of stack.
// Even i was thinking why do we need a stack.

// class Solution {
//     public int maxBalancedShipments(int[] weight) {

//         int res = 0;
//         int max = 0;

//         for (int i = 0; i < weight.length; i++) {

//             if (weight[i] < max) {
//                 res++;
//                 max = 0;
//             } else {
//                 max = weight[i];
//             }
//         }

//         return res;
//     }
// }