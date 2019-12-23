package polymorphism.music;

public class MyString {
    String myStr ;
    MyString(String s){
        myStr= s;
    }

    @Override
    public String toString() {
        return myStr;
    }
}
class MyClass{
    String str = "MyClass";
    MyString mystr = new MyString("MyString");
}
class Main{
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        System.out.println(mc.str);
        System.out.println(mc.mystr);
    }
}
