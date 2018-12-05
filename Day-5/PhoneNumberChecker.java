/* implement By MfDevNet
 Program For Validation Phone number tehran
 MfDevNet@gmail.com
 Mohammad Farahani
  */
package com.MfDevNet.www;
import java.util.Scanner;
public class PhoneNumberChecker {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String phone;
    for (; ; ) {
      /* declaring Menu */
      System.out.println("Format Valid : 021-##@@@@@@");
      System.out.println("##:(2-9)number repept || @:(0-9)");
      System.out.print("Enter Phone Number(Exit Type 00) : ");
      //Get Phone number of Console
      phone = input.next();
      //IF for Exit
      if (phone.equals("00")) break;
      //Validation  Phone with Regex and Display Output
      if (phone.matches("^021-(([2-9])\\2)([0-9]{6})$")) {
        System.out.printf("\u001B[31m" + "%s is Valid %n", phone);

        System.out.printf("\033[0m" + "--------------------------------------%n");
      } else {
        System.out.printf("\u001B[31m" + "%s is Not Valid %n", phone);
        System.out.printf("\033[0m" + "--------------------------------------%n");
      }


    }
  }
}

