package com.MfDevNet.www;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class NewTest {

  enum WinWhos{
    Persolice,Esteghlal,Mosavi;
  }
  @Test
  public static void main(String[] val) {

    NewClass newClass = new NewClass();

    for (String arg : val) {
      newClass.oscar(arg);
//
////      NewTest newTest=new NewTest();
////      newTest.arrayTest(2,4,6);
  }
    }

  @Test
  void arrayTest(int... ok) {
    System.out.println(Arrays.toString(ok).replaceAll(",", ":"));

  }
  @Test
  void footBallTest(){
    int perspolice=1,esteghlal=1;

    if (perspolice>esteghlal)
      System.out.println(WinWhos.Persolice);
     else if (perspolice<esteghlal)
      System.out.println(WinWhos.Esteghlal);
     else if (perspolice==esteghlal)
      System.out.println(WinWhos.Mosavi);


  }
  enum ledGuiad{
    red,green,yellow;
  }

  @Test
  void name() {
  }

  @Test
  void ledTest(){
ledGuiad ledguiad;

ledGuiad[] led=ledGuiad.values();
for (ledGuiad ledd:led)
  System.out.println(ledd);

ledguiad=ledGuiad.valueOf("red");
    System.out.println(ledguiad);
    }
  }





