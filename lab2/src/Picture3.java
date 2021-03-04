import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Picture3 extends JPanel implements ActionListener {

    private static int maxWidth;
    private static int maxHeight;
    Timer timer;

    private int dx = 0;
    private int dy = 1;

    private double angle = 0;
    private int rectWidth = 20;
    private int rectHeight = 20;
    private int rectStartX = 90;
    private int rectStartY = 90;

    private static int frameWidth;
    private static int frameHeight;
    private int frameStartX = 100;
    private int frameStartY = 100;

    public Picture3() {
        timer = new Timer(10, this);
        timer.start();
    }

    private void paintPic(Graphics2D g2d) {

        g2d.setStroke(new BasicStroke(3, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL));
        Rectangle frame = new Rectangle(frameStartX, frameStartY, frameWidth, frameHeight);
        g2d.draw(frame);

        g2d.setColor(Color.orange);

        Rectangle rectangle = new Rectangle(rectStartX, rectStartY, rectWidth, rectHeight);
        g2d.fill(rectangle);


        g2d.rotate(angle, maxWidth/2, maxHeight/2);
        g2d.fillRoundRect(maxWidth/2, maxHeight/2, 30, 40, 5, 5);
    }

    public void paint(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);

        g2d.setBackground(new Color(120, 108, 129));
        g2d.clearRect(0, 0, maxWidth, maxHeight);

        paintPic(g2d);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.add(new Picture3());
        frame.setVisible(true);

        Dimension size = frame.getSize();
        Insets insets = frame.getInsets();
        maxWidth = size.width - insets.left - insets.right - 1;
        maxHeight = size.height - insets.top - insets.bottom - 1;
        frameWidth = maxWidth - 100 * 2;
        frameHeight = maxHeight - 100 * 2;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(rectStartX <= frameStartX - rectWidth / 2 ) {
            if(rectStartY <= frameStartY - rectHeight / 2) {
                dx = 0;
                dy = 1;
            }
            else if(rectStartY >= frameStartY + frameHeight - rectHeight / 2) {
                dx = 1;
                dy = 0;
            }
        }
        else if(rectStartX >= frameStartX + frameWidth - rectWidth / 2) {
            if(rectStartY >= frameStartY + frameHeight - rectHeight / 2) {
                dx = 0;
                dy = -1;
            }
            else if(rectStartY <= frameStartY - rectHeight / 2) {
                dx = -1;
                dy = 0;
            }
        }

        rectStartX += dx;
        rectStartY += dy;
        angle += 0.01;
        repaint();
    }
}
