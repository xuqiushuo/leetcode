
/**
*Given a string s, find s longest back to the text string. You can assume that the maximum length of s is 1000.
*/
class Solution {
    public String longestPalindrome(String s) {
        Set<String> ans = new HashSet<>();
        s = s.trim();
        if(s.equals(new StringBuilder(s).reverse().toString())){
            return s;
        }else{
        
        for(int i=0;i<s.length();i++){
            for(int j=i=1;j<s.length();j++){
                String str = s.substring(i,j);
                if(str.equals(new StringBuilder(str).reverse().toString())){
                    ans.add(str);
                }
            }
        }
        Iterator<String> it = ans.iterator();
        String last = it.next();
        while(it.hasNext()){
            String tmp = it.next();
            if(last.length()<tmp.length()){
                last = tmp;
            }
        }
        return last;
        }
        
    }
}
