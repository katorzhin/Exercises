package strings;

import java.util.Arrays;
import java.util.Scanner;

public class LongestLine {
    public static String getLongestString(String[] array) {
        int maxLength = 0;
        String longestString = null;
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > maxLength) {
                maxLength = array[i].length();
                longestString = array[i];
            }
        }
        return longestString;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Объявляем Scanner
        System.out.println("enter the length of String array ");
        int size = sc.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        String[] array = new String[size]; // Создаём массив int размером в size
        System.out.println("Insert array elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            array[i] = sc.next(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.println("longest string: "+getLongestString(array));
        System.out.println(Arrays.toString(array));
    }
}
