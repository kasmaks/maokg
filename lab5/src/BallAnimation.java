import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.media.j3d.*;
import javax.swing.Timer;
import javax.vecmath.*;

public class BallAnimation implements ActionListener, KeyListener {
    private final TransformGroup ball;
    private final TransformGroup stairs;
    private final Transform3D transform3Dball = new Transform3D();

    private float height = 0.0f;
    private float sign = 1.0f; // going up or down
    private final Timer timer;
    private float xloc = -1.1f;
    private float zloc = -0.45f;

    public BallAnimation(TransformGroup ball,TransformGroup stairs) {
        this.ball = ball;
        this.stairs = stairs;

        Transform3D transform3DStairs = new Transform3D();
        this.stairs.getTransform(transform3DStairs);
        this.ball.getTransform(this.transform3Dball);

        timer = new Timer(50, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        height += .1 * sign;

        if (Math.abs(height * 2) >= 1)
            sign = -1.0f * sign;

        transform3Dball.setScale(new Vector3d(0.13, 0.13, 0.13));
        transform3Dball.setTranslation(new Vector3f(xloc, 0.5f * height + zloc, 0f));
        ball.setTransform(transform3Dball);
    }

    public void keyPressed(KeyEvent e) {
        // дія по натисненню на клавішу
        if (e.getKeyChar() == 'd') {
            xloc = xloc + .22f;
            zloc = zloc + .2f;

        }
        if (e.getKeyChar() == 'a') {
            xloc = xloc - .22f;
            zloc = zloc - .2f;
        }
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyReleased(KeyEvent ev) {
    }
}