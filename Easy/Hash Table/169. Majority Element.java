// import java.util.HashMap;

class Solution {
    public int majorityElement(int[] nums) {

        int maj = nums.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int e : nums) {
            if (map.containsKey(e))
            {
               map.replace(e, map.get(e)+1);
               if(map.get(e)>maj){
                return e;
               }
            }
            else if(map.containsKey(e) == false)
            {
                map.put(e, 1);
                if(map.get(e)> maj){
                    return e;
                }
            }
            
        }
        return maj;
    }

}