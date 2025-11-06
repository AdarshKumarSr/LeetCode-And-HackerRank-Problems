// Last updated: 11/6/2025, 11:15:13 PM
class Solution {
    public boolean isPalindrome(String s) {
        String newString = "";
        
        for(int i=0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                newString += Character.toLowerCase(s.charAt(i));;
            }
        }

        for(int i=0, j=newString.length() -1; i<j; i++,j--){
            if(newString.charAt(i) != newString.charAt(j)){
                return false;
            }
        }
        return true;
    }
}