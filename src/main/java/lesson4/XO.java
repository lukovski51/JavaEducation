package lesson4;

import java.util.Random;
import java.util.Scanner;

public class XO {
    public static int SIZE = 3;
    public static char[][] MAP = new char[SIZE][SIZE];
    public static int DOTS_TO_WIN = 3;
    public static final char EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args){
        initMap();
        printMap();
        while (true){
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил игрок");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья");
                break;
            }
            pcTurn();
            printMap();
            if (checkWin(DOT_O)){
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья");
                break;
            }

        }
        System.out.println("Игра закончена");


    }
    public static void initMap(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = EMPTY;

            }
        }
    }
    public static void printMap(){
        for (int i = 0; i <= SIZE ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void humanTurn(){
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        }
        while (!isCallValid(x, y));
        MAP[x][y] = DOT_X;




    }
    public static boolean isCallValid (int x, int y){
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (MAP[x][y] == EMPTY) return true;
        return false;
    }
    public static void pcTurn(){
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCallValid(x,y));
        MAP[x][y] = DOT_O;
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
    }
    public static boolean checkWin (char step){
        int winHuman = 0;
        int winPc = 0;


        for (int i = 0; i < SIZE ; i++) {
            int winColumn = 0;
            int winRow = 0;
            for (int j = 0; j < SIZE; j++) {
                if(MAP[i][j] == step) winRow ++;
                if(MAP[j][i] == step) winColumn++;
            }
            if (winColumn == DOTS_TO_WIN || winRow == DOTS_TO_WIN) return true;
            if (MAP[i][i] == step)  winHuman++;
            if (MAP[i][MAP[i].length-i-1] == step) winPc ++;
        }
        if(winHuman == DOTS_TO_WIN || winPc == DOTS_TO_WIN) return true;
        return false;
    }
    public static boolean isMapFull(){
        for (int i = 0; i  < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (MAP[i][j] == EMPTY) return false;
            }
        }
        return true;
    }
}












