package strings;

public class RemovingDuplicateCharacters {
    public static boolean contains(char[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String string = "cpu gpu mb cooler";

        char[] a = string.toCharArray();
        char[] b = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            if (!contains(b, a[i])) {
                b[i] = a[i];
            }
        }
        String myStr = new String(b);
        System.out.println(myStr);

      while (myStr.contains(" ")){
          String replace = myStr.replace(" ","");
          myStr=replace;
      }
        System.out.println(myStr);


//        System.out.println(Arrays.toString(b));
//        String c = "a b c d e";
//        String d = c.replaceAll(" ", "");
//        System.out.println(d);

    }
}


