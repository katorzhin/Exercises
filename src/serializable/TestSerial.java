package serializable;

import java.io.*;

class TestSerial implements Serializable {
    public byte version = 100;
    public byte count = 0;

    public static void main(String args[]) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("temp.out");
        ObjectInputStream oin = new ObjectInputStream(fis);
        TestSerial ts = (TestSerial) oin.readObject();
        System.out.println("version =" + ts.version);
    }
}

abstract class ff {
    abstract void test();
    void hello(){
        System.out.println("hello");
    }
}
 abstract class aa extends ff{
     @Override
     abstract void hello() ;
 }
 interface first{
    abstract void test();
    default String second(int number){
        System.out.println("hello bitches");
        String one="null";
        return one;
    }
   abstract class second implements first {

//        @Override
//        public void test() {
//            System.out.println("hello");
//        }

        public static void main(String[] args) {


        }
    }
 }