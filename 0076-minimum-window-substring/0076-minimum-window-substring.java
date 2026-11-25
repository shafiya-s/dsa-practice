class Solution {
    public String minWindow(String s, String t) {
        int[] smap=new int[256];
        int[] tmap=new int[256];
        for(int i=0;i<t.length();i++) tmap[t.charAt(i)]++;
        int l=0,r=0,minl=Integer.MAX_VALUE,start=0;
        for(r=0;r<s.length();r++){
            smap[s.charAt(r)]++;
            while(contains(smap,tmap)){
                if(r-l+1 < minl){
                    minl=r-l+1;
                    start=l;
                }
                smap[s.charAt(l)]--;
                l++;
            }
        }
        return minl==Integer.MAX_VALUE?"":s.substring(start,start+minl);
    }

    public static boolean contains(int []smap,int[] tmap){
        for(int i=0;i<256;i++){
            if(smap[i]<tmap[i])
                return false;
        }
        return true;
    }
}