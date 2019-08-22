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

public class Date
{
  private int month;
  private int day;
  private int year;
  
  // Constructor that initializes the three instance variables
  public Date(int newMonth, int newDay, int newYear)
  {
    month = newMonth;
    day = newDay;
    year = newYear;
  }
  
   // month set method
  public void setMonth(int newMonth)
  {
   month = newMonth;
  }
  
  // month get method
  public int getMonth()
  {
    return month;
  }
  
  // day set method
  public void setDay(int newDay)
  {
   day = newDay;
  }
  
  // day get method
  public int getDay()
  {
    return day;
  }
  
  // year set method
     public void setYear(int newYear)
   {
      year = newYear;
   }
 
  // monthly salary get method
  public int getYear()
  {
    return year;
  }
  
  // display of the date method
  public void displayMessage()
  {
     System.out.printf("\n%d/%d/%d\n", getMonth(), getDay(), getYear());
  }
} 