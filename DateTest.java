/*********************************************************************
 *                                                                   *
 *  CSCI 470               Assignment 2           Fall 2018          *
 *                                                                   *
 *  Developer(s):   Antony Pierson                                   *
 *                                                                   *
 *  Section:        1                                                *
 *                                                                   *
 *  Due Date/Time:  9/14/18 11:59p.m.                                *
 *                                                                   *
 *  Purpose:        A java program for a class called Date that a    *
 *                  person might use to represent the date           *
 ********************************************************************/

import java.util.Scanner;                                // import the Scanner class to read input data

public class DateTest
{
  public static void main(String[] args)
  {
    int month;                                            // used to hold month
    int day;                                              // used to hole day
    int year;                                             // used to hold year
    
    Scanner keyScan = new Scanner(System.in);            // scanner to gets keyboard input from user.
    Date myDate = new Date(0, 0, 0);                     // initialize scanner object
    
    System.out.print("Enter month: ");                   // print statment to prompt user input
    month = keyScan.nextInt();                           // Use method nextInt to read an input month
    myDate.setMonth(month);                              // set month
    
    System.out.print("Enter day: ");                     // print statment to prompt user input
    day = keyScan.nextInt();                             // Use method nextInt to read an input day
    myDate.setDay(day);                                  // set day
    
    System.out.print("Enter year: ");                    // print statment to prompt user input
    year = keyScan.nextInt();                            // Use method nextInt to read an input year
    myDate.setYear(year);                                // set year
    
    myDate.displayMessage();                             // call displayMessage to display date
    
    keyScan.close();                                     // close the scanner
  }
} 