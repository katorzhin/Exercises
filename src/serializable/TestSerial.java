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