package lec6.assn;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    ArrayList<Mover> movers = new ArrayList<>();

    /** Initializes this class for drawing. */
    public DrawGraphics() {
        // box1 and text1 are are bouncers,
        // box2 and text2 are straight movers
        Rectangle box1 = new Rectangle(15, 20, Color.RED);
        Rectangle box2 = new Rectangle(30, 20, Color.YELLOW);

        Text text1 = new Text("Off we go!", Color.BLUE, 100, 100);
        Text text2 = new Text("Disco Elysium", Color.RED, 100, 100);

        Bouncer bouncer1 = new Bouncer(100, 170, box1);
        Bouncer bouncer2 = new Bouncer(200, 120, text1);

        bouncer1.setMovementVector(3, 1);
        bouncer2.setMovementVector(2, -2);

        movers.add(bouncer1);
        movers.add(bouncer2);

        movers.add(new StraightMover(60, 100, box2));
        movers.add(new StraightMover(200, 120, text2));
    }

    /** Draw the contents of the window on surface. */
    public void draw(Graphics surface) {
        for (Mover mover : movers) {
            mover.draw(surface);
        }
    }
}
