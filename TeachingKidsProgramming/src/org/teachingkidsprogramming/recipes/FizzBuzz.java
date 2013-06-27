package org.teachingkidsprogramming.recipes;

public class FizzBuzz
{
  public static String convert(int i)
  {
    if (i % 15 == 0) { return "FizzBuzz"; }
    if (i % 3 == 0) { return "Fizz"; }
    if (i % 5 == 0)
    {
      return "Buzz";
    }
    else
    {
      return "" + i;
    }
  }
}
