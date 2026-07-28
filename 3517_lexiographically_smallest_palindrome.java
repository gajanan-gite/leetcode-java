class Solution {
    public String smallestPalindrome(String s) {
        int[] cnt=new int[26];
        for(char c:s.toCharArray()){
            cnt[c-'a']++;
        }

        StringBuilder half=new StringBuilder();
        String mid="";

        for (char c='a';c<='z';c++){
            int ind=c-'a';
            int half_count=cnt[ind]/2;
            for(int i=0;i<half_count;i++){
                half.append(c);
            }
            if(cnt[ind]%2==1){
                mid=String.valueOf(c);
                
            }
        }
        return half.toString() + mid + half.reverse().toString();

    }
}
// String s = "hello";
// char[] arr = s.toCharArray();
// arr[0] = 'H';
// Arrays.sort(arr);        // or manual swapping
// String newS = new String(arr);
