package lec6.assn;

import java.awt.Graphics;

public class StraightMover extends Artifact implements Mover {
    /** Create a Bouncer that positions sprite at (startX, startY). */
    public StraightMover(int startX, int startY, Sprite sprite) {
        super(startX, startY, sprite);
    }

    @Override
    public void draw(Graphics graphics) {
        sprite.draw(graphics, x, y);

        // Move the center of the object each time we draw it
        x += xDirection;
        y += yDirection;
    }
}
