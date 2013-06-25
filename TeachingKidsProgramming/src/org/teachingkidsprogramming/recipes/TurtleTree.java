package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Turtle;

import com.spun.util.NumberUtils;

public class TurtleTree
{
  public static void main(String[] args)
  {
    Turtle turtle = new Turtle();
    // lower the y-coordinate by 100
    turtle.setY(turtle.getY() - (100));
    turtle.setSpeed(10);
    turtle.getBackgroundWindow().setBackground(Colors.Grays.Black);
    int length = 60;
    drawBranch(turtle, length);
  }
  private static void drawBranch(Turtle turtle, int length)
  {
    if (0 < length)
    {
      adjustColor(turtle, length);
      turtle.move(length);
      drawLowerBranches(turtle, length);
    }
  }
  private static void adjustColor(Turtle turtle, int length)
  {
    if (length <= 10)
    {
      turtle.setPenWidth(2);
      turtle.setPenColor(Colors.Pinks.LightPink);
    }
    else if (length <= 20)
    {
      turtle.setPenWidth(3);
      turtle.setPenColor(Colors.Pinks.HotPink);
    }
    else if (length <= 30)
    {
      turtle.setPenWidth(5);
      turtle.setPenColor(Colors.Pinks.DeepPink);
    }
    else if (length <= 40)
    {
      turtle.setPenWidth(6);
      turtle.setPenColor(Colors.Reds.Salmon);
    }
    else if (length <= 50)
    {
      turtle.setPenWidth(8);
      turtle.setPenColor(Colors.Reds.Red);
    }
    else if (length <= 60)
    {
      turtle.setPenColor(Colors.Reds.FireBrick);
      turtle.setPenWidth(10);
    }
  }
  private static void drawLowerBranches(Turtle turtle, int length)
  {
    int rightangle = NumberUtils.getRandomInt(20, 40);
    turtle.turn(rightangle);
    drawShorterBranch(turtle, length);
    int leftangle = NumberUtils.getRandomInt(10, 60);
    turtle.turn(leftangle - rightangle);
    drawShorterBranch(turtle, length);
    turtle.turn(-leftangle);
    adjustColor(turtle, length);
    turtle.move(-length);
  }
  private static void drawShorterBranch(Turtle turtle, int length)
  {
    int difference = NumberUtils.getRandomInt(10, 30);
    drawBranch(turtle, length - difference);
  }
}
