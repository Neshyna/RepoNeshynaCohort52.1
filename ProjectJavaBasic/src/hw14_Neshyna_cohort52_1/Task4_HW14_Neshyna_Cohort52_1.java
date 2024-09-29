package hw14_Neshyna_cohort52_1;

import java.util.Scanner;

public class Task4_HW14_Neshyna_Cohort52_1 {
    /*Task 4 * (Опционально)
    Подсчет гласных и согласных
    Напишите программу, которая просит пользователя ввести слово и
     подсчитывает количество гласных и согласных букв в этом слове.
     */
    public static void main(String[] args) {

        System.out.println("count vowels: " + countVowels(insertWord()));

    }
    public static String insertWord(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = scanner.nextLine();
        System.out.println("Word inserted: " + word);
        return word;
    }
    public static int countVowels (String word){

        int countVowels = 0;
        int countConsonants = 0;

        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'};

        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            for (int j = 0; j < vowels.length; j++){
                if (c == vowels[j]){
                    countVowels++;

                }
            }
        }
        countConsonants = word.length() - countVowels;
        System.out.println("count consonants: " + countConsonants);

        return countVowels;
    }
}
