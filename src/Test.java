import java.util.Scanner;

public class Test {
    public static void multiplicationTable(int number) {
        for (int i = 1; i < number; i++) {
            for (int j = 1; j < number; j++) {
                System.out.print(i * j + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        int b = scanner.nextInt();
        if (a%b==0){
            System.out.println("делиться без остатков");
        }else {
            System.out.println(a+"не делится без остатков на "+b);
            System.out.println("остаток "+a%b);
        }
        System.out.println(a/b);

//        int secondEnter = scanner.nextInt();
//        int thirdEnter = scanner.nextInt();

//        System.out.println("was entered : first enter - " + firstEnter + "; second enter - " + secondEnter);
//        tmp = firstEnter;
//        firstEnter = secondEnter;
//        secondEnter = tmp;
////        System.out.println(tmp);
////        System.out.println(firstEnter);
////        tmp=secondEnter;
////        secondEnter=firstEnter;
//        System.out.println("swap\nwas entered : first enter - " + firstEnter + "; second enter - " + secondEnter);

    }
}


//    int firstNumber = 110;
//        int secondNumber = 113;
//        for (int i = firstNumber; i < secondNumber; i++) {
////            System.out.print("->"+i);
//                if (i%2==0){
//                    i=i/2;
//                }else {
//                    i=(i*3+1)/2;
//                    System.out.println(i);
//                }
//            }