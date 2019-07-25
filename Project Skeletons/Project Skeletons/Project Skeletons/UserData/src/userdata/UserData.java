package userdata;

import java.util.Scanner;
public class UserData {


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "What is your name?" );
        String name = keyboard.nextLine();
      System.out.println("Hey " + name + "! How old are you?");
      int age = keyboard.nextInt();
      System.out.println("What day were you born?");
      int birthday = keyboard.nextInt();
      System.out.println("What month were you born?");
      String birthmonth = keyboard.nextLine();
      System.out.println("What year were you born?");
      int birthyear = keyboard.nextInt();
      System.out.println("What is your favorite book?");
      String favoriteBook = keyboard.nextLine();
      System.out.println("Where is your hometown?");
      String hometown = keyboard.nextLine();
      System.out.println("What is your lucky number?");
      float luckynumber = keyboard.nextFloat();
      System.out.println("What is your shoe size?");
      float shoesize = keyboard.nextFloat();
      System.out.println("On a scale of 1 to 5, how excited are you to learn about Java?");
      float excitedness = keyboard.nextFloat();
      System.out.println(" Name a cool fact about yourself: ");
      String fact = keyboard.nextLine();
      System.out.println(name + ", age " + age + ", was born on " + birthmonth + " " + birthday + ", " + birthyear + ". From " + hometown + ", " + name); 
      System.out.println(" has a lucky number of " + luckynumber + " and a shoe size of " + shoesize + ". On a scale from 1 to 5, " + name + " is this excited to ");
      System.out.println("learn about Java: " + excitedness + "! A fun fact about " + name + " is:" + fact);
      
      
      int agein5years = age + 5;
     float yee = shoesize * excitedness;
     System.out.println(agein5years);
     System.out.println(yee);
              
       }
    }
   
    