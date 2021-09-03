import java.util.Scanner;

public class Solution02 {
    /*
     *  UCF COP3330 Fall 2021 Assignment 1 Solution 02
     *  Copyright 2021 Ross Springstead
     */
    /*
    prompt the user to enter a string
    assign the value the user gave to a string named name
    create a while loop that runs while name equals an empty string
        reprompt the user for a string
        assign the input given to name
        keep in this loop until user gives an input with characters
     create an int and assign the amount of character in name
     print an output using concatanation

     */



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Hey please enter a string\n");
        String name = input.nextLine();
        while (name.equals("")){
            System.out.printf("Please enter a string\n");
            name = input.nextLine();
        }
        int number = name.length();
        System.out.printf(name + " has " + number + " characters." );

    }
}
