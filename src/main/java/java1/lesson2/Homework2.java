package java1.lesson2;

import java.util.Arrays;

public class Homework2 {
    public static void main (String[] Args) {
        /**
         * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
         * С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
        System.out.println("Задание 1.");
        int[] array1 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        System.out.println(Arrays.toString(array1));
        switchNumbers(array1);
        System.out.println(Arrays.toString(array1));
        /**
         * 2. Задать пустой целочисленный массив размером 8.
         * С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
         */
        System.out.println("Задание 2.");
        int[] zeroArr = new int[8];
        System.out.println(Arrays.toString(zeroArr));
        placeNumbers(zeroArr);
        System.out.println(Arrays.toString(zeroArr));
        /**
         * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
         *  пройти по нему циклом,и числа меньшие 6 умножить на 2;
         */

        System.out.println("Задание 3.");
        int[] array2 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(array2));
        multiplyNumbers(array2);
        System.out.println(Arrays.toString(array2));
        /**
         * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
         * с помощью цикла(-ов) заполнить его диагональные элементы единицами;
         */
        System.out.println("Задание 4.");
        int[][] square = new int[6][6];
        drawX(square);
        printSquare(square);
    }
    static void switchNumbers(int[] inputArray){      //метод для замены 0 на 1 и наоборот
        for (int i = 0; i < inputArray.length; i++){
            inputArray[i] = 1 - inputArray[i];
        }
    }
    static void placeNumbers(int[] inputArray){       // метод заполняет пустой массив значениями из задачи
        for (int i = 0; i < inputArray.length; i++)
        {
            inputArray[i] = i * 3;
        }

    }
    static void multiplyNumbers(int[] inputArray){   // метод для умножения чисел меньше 6 на 2
        for (int i = 0; i < inputArray.length; i++){
            if (inputArray[i] < 6)
            { inputArray[i] = inputArray[i] * 2;
            }
        }
    }
    static void printSquare(int[][] inputSquare)    // метод для вывода квадрата
    {
        for (int i = 0; i < inputSquare.length; i++)
        {
            System.out.println(Arrays.toString(inputSquare[i]));
        }

    }
    static void drawX(int[][] square)               // метод зполнения диагоналей еденичками
    {
        for (int i = 0; i < square.length; i++)
        {
            square[i][i] = 1;
            square[i][square[i].length - 1 - i] = 1;

        }
    }
}
