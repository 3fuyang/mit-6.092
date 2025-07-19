package lec6.assn;

import java.awt.Graphics;

interface Mover {
  void draw(Graphics surface);
  void setMovementVector(int xIncrement, int yIncrement);
}
