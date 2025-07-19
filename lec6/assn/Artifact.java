package lec6.assn;

public class Artifact {
  protected int x;
  protected int y;
  protected Sprite sprite;
  protected int xDirection;
  protected int yDirection;

  /** Create an artifact that positions sprite at (startX, startY). */
  protected Artifact(int startX, int startY, Sprite sprite) {
    this.x = startX;
    this.y = startY;
    this.sprite = sprite;
  }

  public void setMovementVector(int xIncrement, int yIncrement) {
    xDirection = xIncrement;
    yDirection = yIncrement;
  }
}
