package tasksCodeWars;

public class IsPalindrome {
    public static boolean isPalindrome(String numberAsString){
        boolean isPalindrome= true;
        int strLength = numberAsString.length()/2;
        for (int i = 0; i <strLength; i++) {
           if (numberAsString.charAt(i)!=numberAsString.charAt(numberAsString.length()-1-i)){
               return false;
           }
        }
        return isPalindrome;
    }
}
