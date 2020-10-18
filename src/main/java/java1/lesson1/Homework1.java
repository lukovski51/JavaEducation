package java1.lesson1;

public class Homework1 {
    //1.создание main
    public static void main(String[] args){

        //2.объявление и инициализация их значений
        byte small = 56;
        short number = 29992;
        int biggerNumber = 29051992;
        long biggestNumber = 9257057583L;
        float sven = 2.88f;
        double nevs = 8.22;
        char letter = 'l';
        boolean dunno = true;
        boolean dunno2 = false;
        //3.метод вычисляющий выражение
        calculation();
    }
    public static void calculation()
    {
        float a = 5f;
        float b = 7f;
        float c = 3f;
        float d = 4f;
        float e = a * (b + (c / d));
        System.out.println(e);}
    //4.метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    public static boolean between10and20(int n1, int n2) {
        int sum = n1 + n2;
        boolean isit = sum > 10 && sum <= 20;
        return isit;

    }

    //*5.Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    //положительное ли число передали или отрицательное.
    public static void isPositiveOrNegative(int r){
        if (r < 0) {
            System.out.println("Это отрицательное число");
        }
        else {
            System.out.println("Это положительное число");
        }
    }
    //6.Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    // если число отрицательное, и вернуть false если положительное.
    public static boolean isNegative(int num){
        if (num < 0){
            return true;
        }
        else {
            return false;
        }
    }
    //7.Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!»
    public static void printHelloName (String name){
        System.out.println("Привет"+name+"!");
    }

    //8.*Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void checkYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосный");
        }
    }
}
