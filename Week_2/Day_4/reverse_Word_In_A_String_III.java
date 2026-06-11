class Solution {
    public String reverseWords(String s) {

        //M-1 (290ms)
        // String ans="";
        // int i=0,j=0,n=s.length();
        // while(j<n){
        //     if(s.charAt(j)==' '){
        //         int temp=j-1;
        //         while(temp>=i)   ans+=s.charAt(temp--);  //time consumption here
        //         ans+=" ";
        //         j++;
        //         i=j;
        //     }
        //     else j++;
        // }
        // int temp=j-1;
        // while(temp>=i)   ans+=s.charAt(temp--);
        // return ans;

        //M-2 (289ms)
        // String ans="";
        // int i=0,j=0,n=s.length();
        // while(j<n){
        //     if(s.charAt(j)==' '){
        //         String word=s.substring(i,j);  //this consumes time
        //         int k=word.length()-1;
        //         while(k>=0) ans+=word.charAt(k--);
        //         ans+=" ";
        //         j++;
        //         i=j;
        //     }
        //     else j++;
        // }
        // int temp=j-1;
        // while(temp>=i)   ans+=s.charAt(temp--);
        // return ans;

        // M-3 Using SB is much much faster  (7ms)
        // StringBuilder ans=new StringBuilder();
        // int i=0,j=0,n=s.length();
        // while(j<n){
        //     if(s.charAt(j)==' '){
        //         String word=s.substring(i,j);
        //         int k=word.length()-1;
        //         while(k>=0) ans.append(word.charAt(k--));
        //         ans.append(" ");
        //         j++;
        //         i=j;
        //     }
        //     else j++;
        // }
        // int temp=j-1;
        // while(temp>=i)   ans.append(s.charAt(temp--));
        // return ans.toString();

        // (6ms)
        // StringBuilder ans=new StringBuilder();
        // int i=0,n=s.length();
        // while(i<n){
        //    int j=i;
        //    while(j<n && s.charAt(j)!=' ') j++;   //move till end of word
        //    for(int k=j-1;k>=i;k--) ans.append(s.charAt(k));
        //    if(j<n) ans.append(" ");
        //    i=j+1;
        // }
        // return ans.toString();

        // (5ms) 
        // char[] string=s.toCharArray();
        // StringBuilder ans=new StringBuilder();
        // int i=0,n=s.length();
        // while(i<n){
        //    int j=i;
        //    while(j<n && string[j]!=' ') j++;   //move till end of word
        //    for(int k=j-1;k>=i;k--) ans.append(string[k]);
        //    if(j<n) ans.append(" ");
        //    i=j+1;
        // }
        // return ans.toString();

        //(4ms)
        String[] words = s.split(" ");
       StringBuilder result = new StringBuilder();
       for(String word : words){
        StringBuilder reversedword = new StringBuilder(word).reverse();
        result.append(reversedword).append(" "); 
       }
       result.deleteCharAt(result.length()-1);
       return result.toString(); 
    }
}