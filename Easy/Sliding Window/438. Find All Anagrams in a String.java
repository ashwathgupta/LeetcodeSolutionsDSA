// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         int lenP = p.length();
//         int lenS = s.length();
//         int i = 0;

//         List<Integer> res = new ArrayList<>();
//         char parr [] = new char[p.length()];
//         parr = p.toCharArray();
//         Arrays.sort(parr);
//         int k = lenP;
//         for(i=0;i<lenS-lenP+1;i++){
//             String window = s.substring(i, k++);
//             char win [] = new char[lenP];
//             win = window.toCharArray();
//             Arrays.sort(win);
//             if(Arrays.equals(win,parr)){
//                 res.add(i);
//             }

//         }   
//         return res;

//     }
// }


//optimized chatGPT solution
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();

        if (s.length() < p.length()) return res;

        int[] count = new int[26];

        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0, right = 0;
        int needed = p.length();

        while (right < s.length()) {

            if (count[s.charAt(right) - 'a'] > 0) {
                needed--;
            }

            count[s.charAt(right) - 'a']--;
            right++;

            if (needed == 0) {
                res.add(left);
            }

            if (right - left == p.length()) {

                if (count[s.charAt(left) - 'a'] >= 0) {
                    needed++;
                }

                count[s.charAt(left) - 'a']++;
                left++;
            }
        }

        return res;
    }
}


//ChatGPT highly optimized
// class Solution {
//     public List<Integer> findAnagrams(String s, String p) {
//         List<Integer> res = new ArrayList<>();
//         int[] count = new int[26];

//         for (char c : p.toCharArray()) count[c - 'a']++;

//         int left = 0, right = 0, need = p.length();

//         while (right < s.length()) {
//             if (count[s.charAt(right++) - 'a']-- > 0) need--;

//             if (need == 0) res.add(left);

//             if (right - left == p.length() && count[s.charAt(left++) - 'a']++ >= 0) need++;
//         }
//         return res;
//     }
// }