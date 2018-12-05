/* implement By MfDevNet
 Program For Validation Email with pattern
 MfDevNet@gmail.com
 Mohammad Farahani
  */

package com.MfDevNet.www;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailChecker {


  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    Pattern pat=Pattern.compile("([a-zA-Z0-9_\\-\\.]+)([.])[0-9]{1}[a-zA-z]{3}(@gmail\\.com$)");
    for (;;) {

      System.out.print("Enter Email For Check : ");
      String email = input.next();
      if (email.equalsIgnoreCase("exit"))
        break;

      Matcher mat = pat.matcher(email);
      if (mat.matches())
        System.out.printf("%s is Valid \n", email);
      else {
        System.out.printf("%s isNot Valid \n", email);
      }


    }


  }
}

