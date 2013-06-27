package org.teachingkidsprogramming.recipes.finalExam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellOne
{
  private static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int shell = MessageBox.askForNumericalInput("Please enter the size of the shell.");
    if (shell < 200)
    {
      MessageBox.showMessage("The shell size you have entered is too small to be seen.");
      shell = MessageBox.askForNumericalInput("Please enter a shell size larger than 200.");
      if (shell > 200)
      {
        drawDesign(shell);
      }
      else
      {
        MessageBox.showMessage("Sorry, you could not follow the directions, so you can't see the pretty design.");
      }
    }
    else
    {
      drawDesign(shell);
    }
  }
  private static void drawDesign(int shell)
  {
    for (int i = 1; i <= shell; i++)
    {
      Tortoise.setPenColor(Colors.getRandomColor());
      int largeLength = shell / 100;
      length = length + largeLength;
      if (largeLength < 0)
      {
        length = length + 3;
      }
      else
      {
        for (int i1 = 1; i1 <= 2.5; i1++)
        {
          Tortoise.move(length);
          Tortoise.turn(360 / 3.5);
          int rotations = 6;
          Tortoise.turn((360 * rotations) / shell);
        }
      }
    }
  }
}
