
package quiz;

import java.util.Scanner;

public class Quiz {
public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rightAnswers = 0;
        
        System.out.println("Here comes a quiz. No cheating!");
        
        System.out.println("Question 1: What is the capital of California?");
        System.out.println("\tA) San Francisco");
        System.out.println("\tB) Sacramento");
        System.out.println("\tC) Los Angeles");
        System.out.println("\tD) San Jose");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("b")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Sacramento!");
        }
        
        
        System.out.println("Your score is " + rightAnswers + " out of 1 question.");
        
         System.out.println("Question 2: What is the most eaten food?");
        System.out.println("\tA) Lettuce");
        System.out.println("\tB) Beans");
        System.out.println("\tC) Chicken");
        System.out.println("\tD) Rice");
        String answer2 = keyboard.nextLine();
        if (answer2.equals("d")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the correct answer is actually Rice!");
        }
             System.out.println("Your score is " + rightAnswers + " out of 2 question.");
             
             
              System.out.println("Your score is " + rightAnswers + " out of 1 question.");
        
         System.out.println("Question 3: What country is Barcelona in?");
        System.out.println("\tA) Mexico");
        System.out.println("\tB) United States");
        System.out.println("\tC) Spain");
        System.out.println("\tD) Croatia");
        String answer3 = keyboard.nextLine();
        if (answer3.equals("c")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the country is actually Spain!");
        }
             System.out.println("Your score is " + rightAnswers + " out of 3 question.");
             
              
         System.out.println("Question 4: What is the largest continent?");
        System.out.println("\tA) Asia");
        System.out.println("\tB) Africa");
        System.out.println("\tC) Australia");
        System.out.println("\tD) Antarctica");
        String answer4 = keyboard.nextLine();
        if (answer4.equals("a")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the largest continent is actually Asia!");
        }
             System.out.println("Your score is " + rightAnswers + " out of 4 question.");
        
         System.out.println("Question 5: Who was the first president?");
        System.out.println("\tA) Abraham Lincoln");
        System.out.println("\tB) Donald Trump");
        System.out.println("\tC) Donald Duck");
        System.out.println("\tD) George Washington");
        String answer5 = keyboard.nextLine();
        if (answer5.equals("d")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the first president was actually George Washington!");
        }
             System.out.println("Your score is " + rightAnswers + " out of 5 question.");
             
         System.out.println("Question 6: When did the dinosaurs  become extinct?");
        System.out.println("\tA) Whats a dinosaur?");
        System.out.println("\tB) 18 million years ago");
        System.out.println("\tC) 2 million years ago");
        System.out.println("\tD) 66 million years ago");
        String answer6 = keyboard.nextLine();
        if (answer6.equals("d")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the dinosaurs became extinct in 66 million years ago!");
        }
             System.out.println("Your score is " + rightAnswers + " out of 6 question.");
    }   