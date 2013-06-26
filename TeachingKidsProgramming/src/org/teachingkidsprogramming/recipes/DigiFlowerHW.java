package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class DigiFlower
{
  public static void main(String[] args)
  {
    //Color Wheel
    ColorWheel.addColor(Colors.Reds.Red);
    ColorWheel.addColor(Colors.Oranges.DarkOrange);
    ColorWheel.addColor(Colors.Yellows.Gold);
    ColorWheel.addColor(Colors.Yellows.Yellow);
    //default code
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.setPenWidth(3);
    Tortoise.setPenColor(ColorWheel.getRandomColorFromWheel());
    //Drawing octagon
    for (int i = 1; i <= 8; i++)
    {
      Tortoise.move(50);
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.turn(360 / 8);
      Tortoise.move(50);
      Tortoise.turn(360 / 15);
    }
  }
}