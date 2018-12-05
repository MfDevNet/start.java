package com.MfDevNet.www;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class EnumTestkey {
  enum Answers {
    YES, NO, SOON, LATE, MAYBE, NEVER;
  }

  static void answer(Answers result) {
    switch (result) {

      case LATE:
        System.out.println("late");
        break;
      case NO:
        System.out.println("no");
        break;
      case YES:
        System.out.println("yes");
        break;
      case SOON:
        System.out.println("soon");
        break;
      case MAYBE:
        System.out.println("maybe");
        break;
      case NEVER:
        System.out.println("never");
        break;
    }
  }
  public static void main(String[] args) {
    Question q = new Question();
    answer(q.ask());
    answer(q.ask());
    answer(q.ask());
    answer(q.ask());
    answer(q.ask());
  }
}

class Question {
  Random rand = new Random();

  EnumTestkey.Answers ask() {
    int prob = (int) (100 * rand.nextDouble());
    if (prob < 15)
      return EnumTestkey.Answers.MAYBE;
    else if (prob < 30)
      return EnumTestkey.Answers.NO;
    else if (prob < 60)
      return EnumTestkey.Answers.YES;
    else if (prob < 75)
      return EnumTestkey.Answers.LATE;
    else if (prob < 98)
      return EnumTestkey.Answers.SOON;
    else
      return EnumTestkey.Answers.NEVER;
  }
}