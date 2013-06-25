package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors.Purples;
import org.teachingextensions.logo.Tortoise;

public class Spiral
{
  public static void main(String[] args)
  {
    //colorwheel
    ColorWheel.addColor(Purples.BlueViolet);
    ColorWheel.addColor(Purples.Violet);
    ColorWheel.addColor(Purples.Purple);
    //default code
    Tortoise.show();
    Tortoise.setSpeed(10);
    int linenumber = 0;
    //drawing
    for (int i = 1; i <= 75; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      //         Move the tortoise 5 times the current line number you are drawing --#5
      Tortoise.move(5 * linenumber++);
      Tortoise.turn(360 / 3);
    }
  }
  private static void linenumber()
  {
  }
}
