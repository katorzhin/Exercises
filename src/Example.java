@interface ExampleAnnotation {
    String info() default "hello";
}
class ExampleClass{
    @ExampleAnnotation
    void test(){

    }

    public static void main(String[] args) {
        ExampleClass test= new ExampleClass();
        test.test();
    }
}