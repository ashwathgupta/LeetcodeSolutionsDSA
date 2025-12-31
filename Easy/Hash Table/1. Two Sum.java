// import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        for (int e : nums) {

            if (map.containsKey(e) && i != 0) {
                arr[0] = i;
                arr[1] = map.get(e);
                return arr;
            }
            map.put(target - e, i);
            i++;
        }

        return arr;
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();

//         for (int i = 0; i < nums.length; i++) {
//             int complement = target - nums[i];

//             if (map.containsKey(complement)) {
//                 return new int[] { map.get(complement), i };
//             }

//             map.put(nums[i], i);
//         }

//         return new int[] {};
//     }
// }
