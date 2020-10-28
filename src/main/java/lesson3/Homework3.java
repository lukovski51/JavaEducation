package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {
    static int getNumberFromConsole(){
        Scanner scanner = new Scanner(System.in);

        do
            {
            if (scanner.hasNextInt())
            {
                return scanner.nextInt();
            }
                System.out.println("Введите целое число!");
            scanner.nextLine();
        }
        while (true);
    }

    static void guessNumber()
    {
        Random random = new Random();

        do {
            int expectedNumber = random.nextInt(10);
            for (int i = 2; i >= 0; i--) {
                int userNumber;
                do {
                    System.out.println("Введите число от 0 до 9");
                    userNumber = getNumberFromConsole();
                }
                while (!(0 <= userNumber && userNumber <= 9));

                if (userNumber == expectedNumber) {
                    System.out.println("Вы угадали!");
                    break;
                } else if (userNumber < expectedNumber) {
                    System.out.println("Загаданное число больше введённого");
                } else if (userNumber > expectedNumber) {
                    System.out.println("Загаданное число меньше введённого");
                }
                System.out.println("Вы не угадали, у Вас осталось попыток : " + i);
            }
            System.out.println("Попробовать ещё раз? (1 - да/ 0 - нет)");
        }
        while (getNumberFromConsole()!= 0);
    }
    public static void  guessWord()
    {
        Random random = new Random();

        String[] words =
                {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                        "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                        "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                        "pepper", "pineapple", "pumpkin", "potato"

                };
        int expectedWordIndex = random.nextInt(words.length);
        String expectedWord = words[expectedWordIndex];


        String userWord;
        Scanner scanner = new Scanner(System.in);
        do
        {
            userWord = scanner.nextLine();

            if (userWord.equals(expectedWord))
            {
                System.out.println("Вы угадали!");
            }
            else
            {
                doAdvise(userWord, expectedWord);
            }
        }
        while (!(userWord.equals(expectedWord)));
    }

    static void doAdvise (String userWord, String expectedWord) {
        String advise = "";
        for (int i = 0; i < 15; i++) {
            if (i >= userWord.length() || i >= expectedWord.length()) {
                advise += "#";
            } else if (userWord.charAt(i) == expectedWord.charAt(i)) {
                advise += userWord.charAt(i);
            } else {
                advise += "#";
            }
        }
        System.out.println(advise);
    }

        public static void main (String[]args)
        {
            System.out.println("1 - Угадываем номер, 2 - Угадываем слово");
            switch (getNumberFromConsole()) {
                case 1:
                    guessNumber();
                    break;
                case 2:
                    guessWord();
                    break;
            }
        }
    }