package org.teachingkidsprogramming.recipes;

import java.util.Random;

import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

public class HiLow
{
  public static void main(String[] args)
  {
    int correctnumber = new Random().nextInt(100);
    int numberofguesses = 2;
    for (int i = 1; i <= numberofguesses; i++)
    {
      int chancesLeft = numberofguesses + 1 - i;
      int guess = MessageBox.askForNumericalInput("Guess a number between 1 and 100 (You have " + chancesLeft
          + " chances left)");
      //if the number is not valid then
      if (guess < 1 || 100 < guess)
      {
        MessageBox.showMessage("Your answer, " + guess + ", must be a number between1 and 100");
      }
      if (guess == correctnumber)
      {
        Sounds.playBeep();
        MessageBox.showMessage("You won the game. Yay!!");
        System.exit(0);
      }
      else if (correctnumber < guess)
      {
        MessageBox.showMessage("The number is too high");
      }
      else
      {
        MessageBox.showMessage("The number is too Low");
      }
    }
    MessageBox.showMessage("You lose,the correct answer is " + correctnumber);
  }
}
