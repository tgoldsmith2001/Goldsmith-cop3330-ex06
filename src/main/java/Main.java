/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("What is your current age? ");
        String Str1=input.nextLine();
        System.out.print("at what age would you like to retire? ");
        String Str2=input.nextLine();
        int a= Integer.parseInt(Str1);
        int b= Integer.parseInt(Str2);
        int year= LocalDate.now().getYear();
        if(a>b)
            System.out.println("Congratulations you can retire already!");
        else {
            System.out.println("You have " + (b - a) + " years until you can retire");
            System.out.println("It's " + year + ", so you can retire in " + (year + (b - a)));
        }
    }
}
