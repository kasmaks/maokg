import java.awt.*;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Picture2 extends JPanel{

    private static int maxWidth;
    private static int maxHeight;

    private void paintFence(Graphics2D g2d) {

        GeneralPath gp1 = new GeneralPath();
        gp1.moveTo(50, 250);
        g2d.setColor(Color.black);
        for(int i = 0; i < 8; i++) {
            gp1.lineTo(50 + 50 * i, 100);
            gp1.lineTo(75 + 50 * i, 50);
            gp1.lineTo(100 + 50 * i, 100);
            gp1.lineTo(100 + 50 * i, 250);
            gp1.moveTo(100 + 50 * i, 250);
        }
        gp1.closePath();
        GradientPaint gradientPaint = new GradientPaint(5 ,25, Color.yellow, 20, 7, Color.lightGray, true);
        g2d.setPaint(gradientPaint);
        g2d.fill(gp1);

        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(2));
        for(int i = 0; i < 8; i++) {
            g2d.drawLine(50 + 50 * i, 250, 50 + 50 * i, 100);
            g2d.drawLine(100 + 50 * i, 250, 100 + 50 * i, 100);
            g2d.drawLine(50 + 50 * i, 100, 75 + 50 * i, 50);
            g2d.drawLine(75 + 50 * i, 50, 100 + 50 * i, 100);
        }
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

        paintFence(g2d);
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.add(new Picture2());
        frame.setVisible(true);

        Dimension size = frame.getSize();
        Insets insets = frame.getInsets();
        maxWidth = size.width - insets.left - insets.right - 1;
        maxHeight = size.height - insets.top - insets.bottom - 1;
    }
}
