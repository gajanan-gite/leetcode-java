// class Solution {
//     public int minimumPushes(String word) {
//         int n=word.length();
//         int count=0;
//         if(n<=8) count=n;
//         else if(n<=16) count=8+(n-8)*2;
//         else if(n<=24) count=24+(n-16)*3;
//         else count =48+(n-24)*4;

//         return count;
        
//     }
// }
class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += (i / 8) + 1;   // cost of the letter at position i
        }
        return total;
    }
}
