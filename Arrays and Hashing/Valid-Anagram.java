class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
      char[] ch=s.toCharArray();
      char[] hc=t.toCharArray();
      int k=0;
      for(int i=0;i<ch.length;i++){
        k=0;
        for(int j=0;j<ch.length;j++){
        if(ch[i]==hc[j])
           k=1;
        }
        if(k!=1)
              return false;
        }

      return true;
    }
}
