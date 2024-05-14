import javax.swing.*;
import java.awt.event.*;

public class MouseEventExample extends JFrame {
    private JLabel label;

    public MouseEventExample() {
        setTitle("Mouse Event Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label = new JLabel("Hover over me!", JLabel.CENTER);
        label.setOpaque(true);

        label.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse pressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse released");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse entered the label");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse exited the label");
            }
        });

        label.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                System.out.println("Mouse dragged");
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("Mouse moved");
            }
        });

        add(label);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MouseEventExample();
            }
        });
    }
}
