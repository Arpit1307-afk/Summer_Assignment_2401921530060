class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] alpha1=new int[26];
        int[] alpha2=new int[26];
        int n=ransomNote.length();
        int m=magazine.length();
        for(int i=0;i<n;i++) alpha1[ransomNote.charAt(i)-97]++;
        for(int i=0;i<m;i++) alpha2[magazine.charAt(i)-97]++;
        for(int i=0;i<26;i++){
            if(alpha1[i]>alpha2[i]) return false;
        }
        return true;
    }
}