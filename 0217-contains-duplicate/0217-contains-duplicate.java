class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();
        for(int n:nums){
            if(!seen.add(n))
               return true;
        }
        return false;
    }
}