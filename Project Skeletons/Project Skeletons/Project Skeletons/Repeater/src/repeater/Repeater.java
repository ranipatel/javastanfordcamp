
package repeater;

import java.util.Scanner;

public class Repeater {

    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.print( "How many times do you want me to repeat 'hi'?" );
       int input = keyboard.nextInt();
       
       System.out.println("Here we go!");
       int count = 0;
       while (count < input ) {
           System.out.println("hi");
           count ++;
       }
    }
    
}
