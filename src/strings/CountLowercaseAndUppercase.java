package strings;

public class CountLowercaseAndUppercase {
    public static void main(String[] args) {
        int countLowercase = 0;
        int countUppercase = 0;
        String string = "heLLo WOrld tEmp";
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))) {
                countUppercase++;
            } else if (Character.isLowerCase(string.charAt(i))){
                countLowercase++;
            }
        }
        System.out.println("Number of lowercase letters " + countLowercase);
        System.out.println("Number of uppercase letters " + countUppercase);
    }
}
