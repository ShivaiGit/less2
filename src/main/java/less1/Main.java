package less1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        gameWords();
    }

    static void gameNumber() {
        int randomNumber = (int) (Math.random() * 20);
        Scanner scr = new Scanner(System.in);

        int userNumber;
        int count = 0;
        do {
            System.out.println("Угадайте цифру от 0 до 20. У вас три попытки - ");
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
        System.out.println(words[index]);

        Scanner scr = new Scanner(System.in);
        System.out.println("Угадайте слова из списка");
        String userWords = scr.nextLine();
        System.out.println(userWords);
    }
}



