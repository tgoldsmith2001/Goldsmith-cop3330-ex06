/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Tyler Goldsmith
 */
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Date d= new Date();
        System.out.print("What is your current age? ");
        String Str1=input.nextLine();
        System.out.print("at what age would you like to retire? ");
        String Str2=input.nextLine();
        int a= Integer.parseInt(Str1);
        int b= Integer.parseInt(Str2);
        //gets current year starting from 1900
        int year= 1900+ d.getYear();
        System.out.println("You have "+(b-a)+" years until you can retire");
        System.out.println("It's "+year+", so you can retire in "+(year+b));
    }
}