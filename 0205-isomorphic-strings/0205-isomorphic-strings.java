class Solution {
    public boolean isIsomorphic(String s, String t) {
        List<Integer> L1=new ArrayList<>();
        List<Integer> L2=new ArrayList<>();
        for(char c:s.toCharArray()){
            L1.add(s.indexOf(c));
        }
        for(char c:t.toCharArray()){
            L2.add(t.indexOf(c));
        }
        return L1.equals(L2);

    }
}