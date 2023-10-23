import java.util.Scanner;



// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

                //Exercise 1


                Scanner input = new Scanner(System.in);

                System.out.println("BMI calculator");
                System.out.println("Please enter your weight in kilograms");
                double weight = input.nextDouble();
                System.out.println("Please enter your height in meters");
                double height = input.nextDouble();

                double bmi = weight/Math.pow(height,2.0);
                System.out.println("BMI = "+bmi);
                //

                //Exercise 2

                System.out.println("Enter obtained marks");
                double marks = input.nextDouble();
                System.out.println("Enter total marks");
                double totalMarks = input.nextDouble();
                System.out.println("percentage = "+((marks/100)*totalMarks)+"%");

                //Exercise 3

                System.out.println("Enter amount in USD to exchange to EUR");
                double usdAmount = input.nextDouble();
                // We can define a variable that stores exchange rate since exchange rate is not constant.
                double eurAmount = usdAmount*0.85;
                System.out.println("Amount in EUR = "+eurAmount);


                //Exercise 4

                System.out.println("Enter a sentence");
                String sentence0 = input.nextLine();

                StringBuilder str = new StringBuilder();
                System.out.println("Length of the string: "+sentence0.length()+" And reversed string: "+ str.reverse());


                //Exercise 5


                System.out.println("Type a sentence");
                String sentence = input.nextLine();
                System.out.println(sentence.substring(10,20));

                //Exercise 6


                System.out.println("Type a Sentence");
                String Sentence6 = input.nextLine();
                System.out.println("enter a keyword to check if it exists in the sentence");
                String sentence7 = input.next();
                if(Sentence6.contains(sentence7)) {
                    System.out.println("Keyword \""+sentence7+"\" is present in the sentence");
                }
                            else
                                System.out.println("Keyword \""+sentence7+"\" doesn't exist in the sentence");



                //Exercise 7


                System.out.println("Type a sentence");
                String sentence8 = input.nextLine();
                System.out.println("Enter a chosen word");
                String word1 = input.next();
                System.out.println("Enter a word from the sentence to be replaced with word \""+word1+"\"");
                String word2 = input.next();
                System.out.println(sentence8.replaceFirst(word2,word1));


                //Exercise 8



                System.out.println("Enter the first word");
                String word3 = input.next();
                System.out.println("Enter the second word");
                String word4 = input.next();
                if(word3.equalsIgnoreCase(word4)){
                    System.out.println("Strings are equal (ignoring case)");
                }
                else System.out.println("Strings are not equals");















    }
        }

