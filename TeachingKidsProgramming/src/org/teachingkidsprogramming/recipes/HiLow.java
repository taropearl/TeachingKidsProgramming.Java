package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.utils.Sounds;
import org.teachingextensions.windows.MessageBox;

import com.spun.util.NumberUtils;

public class HiLow
{
  public static void main(String[] args)
  {
    int correctnumber = NumberUtils.getRandomInt(1, 100);
    for (int i = 1; i <= 8; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number between 1 and 100");
      if (guess == correctnumber)
      {
        Sounds.playBeep();
        MessageBox.showMessage("You won the game!!");
        System.exit(0);
      }
      else if (guess > correctnumber)
      {
        MessageBox.showMessage("The number is too high");
      }
      else if (guess < correctnumber)
      {
        MessageBox.showMessage("The number is too Low");
      }
    }
    MessageBox.showMessage("You lose :(");
  }
}
