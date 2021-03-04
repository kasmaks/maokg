import java.awt.*;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Picture1 extends JPanel{

    private static int maxWidth;
    private static int maxHeight;

    private void paintBug(Graphics2D g2d) {

        int[] x1 = {100, 190, 140, 50};
        int[] y1 = {20, 55, 80 ,60};
        GeneralPath gp1 = new GeneralPath();
        gp1.moveTo(x1[0], y1[0]);
        for (int i = 1; i < x1.length; i++) {
            gp1.lineTo(x1[i], y1[i]);
        }
        gp1.closePath();
        g2d.setColor(new Color(0,255,1 ));
        g2d.fill(gp1);

        int[] x2 = x1.clone();
        int[] y2 = y1.clone();
        x2[0] = x2[3] + 30;
        x2[1] = x2[2] + 15;
        y2[0] = y2[3] + 60;
        y2[1] = y2[2] + 30;

        GeneralPath gp2 = new GeneralPath();
        gp2.moveTo(x2[0], y2[0]);
        for (int i = 1; i < x1.length; i++) {
            gp2.lineTo(x2[i], y2[i]);
        }
        gp2.closePath();
        g2d.fill(gp2);
        g2d.draw(gp2);

        GeneralPath gp3 = new GeneralPath();
        gp3.moveTo(x1[1] - 10, y1[1] + 17);
        gp3.lineTo(x1[2] + 10, y2[2]);
        gp3.lineTo(x2[1] + 7, y2[1] - 10);
        gp3.closePath();
        g2d.setColor(Color.yellow);
        g2d.fill(gp3);

        g2d.setColor(new Color(4, 126, 6));
        g2d.fillRect(80, 80 , 7, 7);
        g2d.fillRect(90, 50 , 7, 7);

        g2d.setStroke(new BasicStroke(3));
        g2d.setColor(Color.black);
        g2d.drawLine(x1[2], y1[2], x1[3], y1[3]);

        g2d.setStroke(new BasicStroke(5));
        g2d.drawLine(63, 90, 30, 100);
        g2d.drawLine(63, 47, 30, 15);

    }

    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        rh.put(RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHints(rh);

        g2d.setBackground(new Color(0, 128, 129));
        g2d.clearRect(0, 0, maxWidth, maxHeight);

        paintBug(g2d);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.add(new Picture1());
        frame.setVisible(true);

        Dimension size = frame.getSize();
        Insets insets = frame.getInsets();
        maxWidth = size.width - insets.left - insets.right - 1;
        maxHeight = size.height - insets.top - insets.bottom - 1;
    }
}
