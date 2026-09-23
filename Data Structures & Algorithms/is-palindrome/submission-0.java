class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase().replaceAll("[^a-z0-9]","");
        String reverse= new StringBuilder(str).reverse().toString();
        if(str.equals(reverse)){
            return true;
        }else{
            return false;
        }
    }
}
