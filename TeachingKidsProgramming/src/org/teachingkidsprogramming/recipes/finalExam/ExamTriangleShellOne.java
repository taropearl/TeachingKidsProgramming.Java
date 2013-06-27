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
    int shellSize = MessageBox.askForNumericalInput("Pick a number.");
    if (shellSize < 200)
    {
      MessageBox.askForNumericalInput("Size of the shell is too small to be seen" + "...So pick a bigger number.");
    }
    else
    {
      for (int i = 1; i <= shellSize; i++)
      {
        Tortoise.setPenColor(Colors.getRandomColor());
        //          Set the value of the large length to the size of the shell divided by 100
        int largeLength = length / 100;
        //          Add the value of the large length to the current length
        parse largeLength = length;
      }
      //      If the value of the large length is less than zero
      {
        //      Set the value of the length to the length plus 3
        //         Otherwise, Call the drawTriangle method (recipe below)      
        //          Set the value of the number of rotations to 6
        //          Turn the tortoise 360 times the number of rotations, then divide that by the size of the shell 
      }
    }
    //    Repeat 
  }
  //------------- Recipe for drawTriangle
  //      Do the following 2.5 times 
  //          Move the tortoise the current length 
  //          Turn the tortoise 1/3.5 of 360 degrees 
  //    Repeat 
  //------------- End of drawTriangle recipe
}