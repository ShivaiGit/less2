package TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static final int FIELD_SIZE = 3;

    static final char DOT_EMPTY = '*';
    static final char DOT_HUMAN = 'X';
    static final char DOT_AI = 'O';

    static final char HEAD_FIRST_SYMBOL = '#';
    static final String SPACE = " ";

    static final char[][] FIELD = new char[FIELD_SIZE][FIELD_SIZE];
    static final Random rnd = new Random();
    static final Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        startGame();
    }

    public static void startGame() {
        //инициализация поля
        initField();

        //печать поля в консоль
        printField();
    }


    private static void initField() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            for (int j = 0; j < FIELD_SIZE; j++) {
                FIELD[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        //печать заголовка
        printHeadField();

        //печать поля
        printBodyField();
    }


    private static void printHeadField() {
        System.out.print(HEAD_FIRST_SYMBOL + SPACE);
        for (int i = 0; i < FIELD_SIZE; i++) {
            printFieldNumber(i);
        }
        System.out.println();
    }

    private static void printFieldNumber(int i) {

        System.out.print(i + 1 + SPACE);
    }

    private static void printBodyField() {
        for (int i = 0; i < FIELD_SIZE; i++) {
            printFieldNumber(i);
            for (int j = 0; j < FIELD_SIZE; j++) {
                System.out.print(FIELD[i][j] + SPACE);
            }
            System.out.println();
        }
    }
}
