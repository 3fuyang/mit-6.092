package lec5.assn;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<BouncingBox> boxes;

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        this.boxes = new ArrayList<>();
        BouncingBox box1 = new BouncingBox(200, 50, Color.RED);
        box1.setMovementVector(10, 10);
        BouncingBox box2 = new BouncingBox(50, 200, Color.BLUE);
        box2.setMovementVector(-8, -6);
        BouncingBox box3 = new BouncingBox(150, 75, Color.YELLOW);
        box3.setMovementVector(10, -4);

        this.boxes.add(box1);
        this.boxes.add(box2);
        this.boxes.add(box3);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        for (BouncingBox bouncingBox : this.boxes) {
            bouncingBox.draw(surface);
        }

        surface.setColor(Color.GREEN);
        surface.drawLine(50, 50, 50, 250);
        surface.drawArc(10, 100, 20, 40, 0, 0);
        surface.setColor(Color.PINK);
        surface.fillRect(150, 100, 50, 40);
        surface.setColor(Color.ORANGE);
        surface.drawString("Tequila Sunset", 100, 100);
    }
}