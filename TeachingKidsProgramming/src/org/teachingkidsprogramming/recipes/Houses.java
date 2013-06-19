package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawhouse(height);
    drawhouse(120);
    drawhouse(90);
    drawhouse(20);
  }
  private static void drawhouse(int height)
  {
    //   Change the color of the line the tortoise draws to lightGray --#15
    Tortoise.setPenColor(Colors.Grays.LightGray);
    Tortoise.move(height);
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
}
