class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> w=new HashSet<>();
        int r=0,l=0,best=0;
        for(r=0;r<s.length();r++){
            char c=s.charAt(r);
            while(w.contains(c)){
                w.remove(s.charAt(l));
                l++;
            }
            w.add(c);
            best=Math.max(best,(r-l)+1);
        }
        return best;
    }
}