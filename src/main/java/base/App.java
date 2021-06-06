/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Fazlur Shofiquel
 */

package base;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner nameInput = new Scanner(System.in);
        Scanner quoteInput = new Scanner(System.in);
        String quote;
        String name;
        String outputString;

        System.out.print("What is the quote? ");
        quote = quoteInput.nextLine();
        System.out.print("Who said it? ");
        name = nameInput.nextLine();
        outputString = "" +name+ " says, \"" +quote+ "\"";

        System.out.println(outputString);
    }

}
