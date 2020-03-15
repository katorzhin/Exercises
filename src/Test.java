import java.io.IOException;
import java.io.Serializable;

class Test implements Serializable {
public static  void test(){
    System.out.println("hello");
}

    public static void main(String[] args) throws IOException {
        System.out.println(1/0);
    }

} 