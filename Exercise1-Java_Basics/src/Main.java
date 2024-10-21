import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.ROOT);
/*
1.Develop a program that takes the weight (in kilograms) and height
(in meters) as input and calculates the BMI, then prints it.Input: Weight (kg) = 70,
Height (m) = 1.75 Expected Output: BMI = 22.861. Develop a program that takes
the weight (in kilograms) and height (in meters) as input and calculates the BMI,
then prints it. Input: Weight (kg) = 70, Height (m) = 1.75 Expected Output: BMI = 22.86
*/
        System.out.println("please enter the weight (in kilograms) : ");
        double weight = input.nextDouble();
        System.out.println("please enter the height (in meters) : ");
        double height = input.nextDouble();
        height = height * height;
        double result = weight / height ;
        System.out.println("The output of BMI equal = " + result);

/*
2- Write a program that takes the obtained marks and total marks as input
and calculates the percentage, then prints it.
Input: Obtained Marks = 85, Total Marks = 100 Expected Output: Percentage = 85.0%
*/

        System.out.println("please enter the obtained marks : ");
        double obtained_marks = input.nextInt();
        input.nextLine();
        System.out.println("please enter the total marks : ");
        double total_marks = input.nextInt();
        input.nextLine();
        double Percentage = (obtained_marks / total_marks ) *100;
        System.out.println("Your Percentage is "+Percentage +"%");

         /*
3- Create a program that takes an amount in one currency and an exchange rate
as input, then converts and prints the amount in another currency.
Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
Expected Output: Amount in EUR = 85.0
         */

        System.out.println("please enter the amount in USD = ");
        double usd = input.nextDouble();
        input.nextLine();
        System.out.println("please enter the Exchange Rate (USD to EUR) = ");
        double rate = input.nextDouble();
        input.nextLine();
        double eur = usd * rate;
        System.out.println(eur);

/*
4-Create a program that takes a string as input, calculates its length, and then reverses
the string using the StringBuilder class, finally printing both the length and reversed string.
Input: "Hello, World!"
Expected Output: Length of the string: 13 And Reversed string: "!dlroW ,olleH"
 */
        System.out.println("Please enter the sentence you want to reverse : ");
        String statmeant_revers = input.nextLine();
        StringBuilder to_revers =new StringBuilder(statmeant_revers);
        System.out.println("Length of the string: "+statmeant_revers.length() +" And Reversed string: "+to_revers.reverse());
/*
5-Develop a program that takes a sentence as input and extracts a substring from it
, then prints the extracted substring.
Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index = 10,
End Index = 20 = Expected Output: "brown fox"
 */
        System.out.println("please enter the sentence : ");
        String sentence_substring = input.nextLine();
        System.out.println("please enter the start index : ");
        int start_index = input.nextInt();
        System.out.println("please enter the last index : ");
        int last_index  = input.nextInt();
        System.out.println("The substring you chose is : "+ sentence_substring.substring(start_index,last_index).trim());
/*
6-Write a program that takes a sentence and a keyword as input, then check if the keyword
is present in the sentence and prints the result.                                            input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword = "jumps"
Expected Output: Keyword "jumps" is present in the sentence.
 */
        input.nextLine();
        System.out.println("please enter the sentence : ");
        String sentence_key = input.nextLine();
        System.out.println("please enter the keyword : ");
        String keyword = input.nextLine();
        System.out.println("the keyword is present in the sentence ؟  "+sentence_key.contains(keyword));

/*
7- Develop a program that takes a sentence and a word to replace as input,
then replace all occurrences of the word with another word and prints the modified sentence.
Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to Replace = "fox", Replacement Word = "cat"
Expected Output: "The quick brown cat jumps over the lazy dog"
 */
        System.out.println("please enter the sentence : ");
        String sentence_to_replace = input.nextLine();
        System.out.println("Word to Replace = ");
        String word = input.nextLine();
        System.out.println("Replacement Word = ");
        String Replacement_word = input.nextLine();
        System.out.println(sentence_to_replace.replaceAll(word,Replacement_word));

/*
8-Write a program that takes two strings as input and check if they are equal,
ignoring the case, then prints whether they are equal or not.
Input: String 1 = "Hello", String 2 = "hello"
Expected Output: Strings are equal (ignoring case).
 */
        System.out.println("please enter the first sentence : ");
        String first_sentence = input.nextLine();
        System.out.println("please enter the second sentence : ");
        String second_sentence = input.nextLine();
        System.out.println("Strings are equal : "+first_sentence.equalsIgnoreCase(second_sentence));
    }
    }
