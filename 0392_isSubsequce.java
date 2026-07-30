// class Solution {
//     public boolean isSubsequence(String s, String t) {

//         for (int i=0;i<t.length();i++){
//             for (int j=0;j<s.length();j++){
//                 if(t.charAt(i)==s.charAt(j)){
//                     i++;
//                 }
//                 else
//                     return false;
                  
//             }

//         }
//         return true;
//     }
// }
class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0; 
        int j = 0; 

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;
        }

        return i == s.length();
    }
}
