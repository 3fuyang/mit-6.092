package lec6.assn;

import java.awt.Color;
import java.awt.Graphics;

public class Text implements Sprite {
  private int width;
  private int height;
  private String text;
  private Color color;

  public Text(String text, Color color, int width, int height) {
    this.text = text;
    this.color = color;
    this.width = width;
    this.height = height;
  }

  @Override
  public void draw(Graphics surface, int leftX, int topY) {
    surface.setColor(color);
    surface.drawString(text, leftX, topY);
  }

  @Override
  public int getWidth() {
    return width;
  }

  @Override
  public int getHeight() {
    return height;
  }
}
