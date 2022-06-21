package less1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //gameWords();
        //gameNumber();
        //arrOdd();
        //arrInput();
        //randomArr();
    }

    static void gameNumber() {
        int range = 10;
        int randomNumber = (int) (Math.random() * range);
        Scanner scr = new Scanner(System.in);

        int userNumber;
        int count = 0;

//        while (true) {
//            System.out.println("Угадайте цифру от 0 до " + range);
//            userNumber = scr.nextInt();
//            if (userNumber == randomNumber) {
//                System.out.println("Вы Угадали");
//                break;
//            } else if (userNumber > randomNumber) {
//                System.out.println("Введенная цифра больше загаданной.");
//            } else {
//                System.out.println("Введенная цифра меньше загаданной.");
//            }
//        }

        do {
            System.out.println("Угадайте цифру от 0 до 10. У вас три попытки - ");
            userNumber = scr.nextInt();
            if (userNumber < randomNumber) {
                System.out.println("Введенная цифра меньше загаданной.");
                count++;
            } else if (userNumber > randomNumber) {
                System.out.println("Введенная цифра больше загаданной.");
                count++;
            } else {
                System.out.println("Вы выиграли");
                break;
            }
            if (count == 3)
                System.out.println("Закончились попытки. Вы проиграли. Цифра была " + randomNumber);
        } while (count < 3);
        System.out.println("Повторить игру еще раз? (1 – повторить, 0 – нет) - ");
        int reload = scr.nextInt();
        if (reload == 1)
            gameNumber();
        System.out.println("Игра окончена!");
    }

    static void gameWords() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
        };

        Random rdm = new Random();
        int index = rdm.nextInt(words.length);
        //System.out.println(words[index]);

        Scanner scr = new Scanner(System.in);
        System.out.println("Угадайте слова из списка - ");
        String userWords = scr.nextLine().toLowerCase();

        while (!words[index].equals(userWords)) {
            System.out.println("Не угадали. Повторите ещё раз");
            userWords = scr.nextLine();
        }
        System.out.println("Угадали!");

    }

    static void arrOdd() {
        int[] array = {0, 5, 2, 4, 7, 1, 3, 19};
        int isOddNum = 0;
        for (int i : array) {
            if (i % 2 != 0)
                isOddNum++;
        }
        System.out.println(isOddNum);
    }

    static void arrInput() {
        final int SIZE;
        int numberInput;
        Scanner scr = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        SIZE = scr.nextInt();

        int[] arr = new int[SIZE];
        System.out.println("Введите значение элементов массива: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ведите значение " + (i + 1) + "-го элемента");
            arr[i] = numberInput = scr.nextInt();
        }
        System.out.println(Arrays.toString(arr));

    }

    static void randomArr() {
        int[] arr = new int[15];
            for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 16);
        }

        int[] arr1 = new int[arr.length * 2];
        System.arraycopy(arr,0,arr1,0,15);
        int index = 0;
        for (int i = 15; i < arr1.length; i++) {
            arr1[i] = arr[index] * 2;
            index++;

        }

        System.out.println("Массив arr - " + Arrays.toString(arr));
        System.out.println();
        System.out.println("Массив arr1 - " + Arrays.toString(arr1));




    }
}
