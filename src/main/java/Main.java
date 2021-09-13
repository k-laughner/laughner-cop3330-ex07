/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;

public class Main {
  // constant
  public class constant {
   public static final double conv = 0.09290304;
  }
  public static void main(String[] args) {
    System.out.println("What is the length of the room in feet?");
    Scanner input = new Scanner(System.in);
    int length = input.nextInt();

    System.out.println("What is the width of the room in feet?");
    Scanner input2 = new Scanner(System.in);
    int width = input2.nextInt();

    int feet = length*width;
    double meters = feet*constant.conv;

    System.out.println("You entered dimensions of " + length + " by " + width + " feet.");

    System.out.println("The area is " + feet + " square feet or " + meters + " square meters.");
  }
}
