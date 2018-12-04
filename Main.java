package com.MfDevNet.www;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //practice1();

    practice2();


  }

  public static void practice2() {
    Scanner scanner = new Scanner(System.in);
    String input;
    do {
      System.out.println("1)Average String Number");
      System.out.println("2)Sum of String ");
      System.out.print("Choose Number :");
      int choose = scanner.nextInt();
      System.out.println("For Exit Enter exit");
      System.out.print("Enter Statement : ");
      input = scanner.next();
      System.out.println();
      switch (choose) {
        case 1:
          int avg = input.length() / 2;
          System.out.printf("Average is %d %n", avg);
          break;
        case 2:
          int[] sum = new int[3];
          sum[0] = input.length();
          System.out.println(sum[0]);
          sum[1] = (input.indexOf(input.charAt(0))) + (input.length());
          System.out.println(sum[1]);
          break;
        default:
          System.out.println("Enter Valid Number ");
          break;

      }
//      System.out.println(input.equals("exit"));
    } while (input != "EXIT");

  }


  public static void practice1() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter count number : ");
    int count = scanner.nextInt();
    int[] arrayNumber = new int[count];
    int sum = 0;
    for (int i = 0; i < count; i++) {
      System.out.print("Enter number : ");
      arrayNumber[i] = scanner.nextInt();
//      System.out.println();
      sum += arrayNumber[i];
    }
    System.out.printf("Sum is %d", sum);
  }
}
