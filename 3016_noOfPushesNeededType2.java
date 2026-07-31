class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int[] charFreq=new int[26];

        for(char c:word.toCharArray()){
            charFreq[c-'a']++;
    }
        List<Integer> freqs=new ArrayList<>();
        for(int f: charFreq){
            if(f>0) freqs.add(f);
        }
        freqs.sort(Collections.reverseOrder());

        int totalPushes = 0;
        for (int i = 0; i < freqs.size(); i++) {
            int pressCost = (i / 8) + 1;
            totalPushes += freqs.get(i) * pressCost;
        }

        return totalPushes;
    }
}
