package com.MfDevNet.www;

import com.sun.org.apache.xpath.internal.operations.And;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class EnumTest {

  enum Apple {
    Mohammad(10), Amirmahdi(200), Xaniar(40), Maryam(100);
    private int price;

    Apple(int val) {
      price = val;
    }

    int getPrice() {
      return price;
    }

  }

  @Test
  void TestEnum() {
    Apple ap;
//    System.out.printf("Price is %s:" + Apple.Maryam.getPrice()+"\n", Apple.Maryam);
    int s = 0;

    for (Apple app : Apple.values()) {

      System.out.printf("Code is :%d  %s Price is : %d %n", app.ordinal(), app, app.getPrice());

      if (app.getPrice() < s)
        s = s;
      else
        s = app.getPrice();
    }
    // System.out.println(s);
    for (Apple appp : Apple.values()) {


      if (appp.getPrice() == s)
        System.out.println(appp + " is Hiiiiigh " + appp.getPrice());
    }

  }





}