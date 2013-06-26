package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class PentagonCrazy
{
  public static void main(String[] args)
  {
    //Color Wheel
    ColorWheel.addColor(Colors.Blues.SteelBlue);
    ColorWheel.addColor(Colors.Purples.DarkOrchid);
    ColorWheel.addColor(Colors.Blues.DarkSlateBlue);
    ColorWheel.addColor(Colors.Blues.Teal);
    ColorWheel.addColor(Colors.Purples.Indigo);
    //default code
    Tortoise.setSpeed(10);
    Tortoise.setPenColor(ColorWheel.getRandomColorFromWheel());
    int penwidth = 1;
    Tortoise.setPenWidth(penwidth);
    //reset tortoise pen width
    if (penwidth > 4)
    {
      Tortoise.setPenWidth(1);
    }
    //Draw funky pentagon 200 times
    for (int i = 1; i <= 200; i++)
    {
      for (int j = 1; j <= 4; j++)
      {
        Tortoise.turn(360 / 5);
        Tortoise.move(70);
        Tortoise.setPenColor(ColorWheel.getNextColor());
      }
      Tortoise.turn(1);
      Tortoise.move(100);
      Tortoise.setPenWidth(penwidth + 1);
    }
  }
}
