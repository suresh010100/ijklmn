import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class SimpleSwingApp {
    public static void main(String[] args) {
        // Ensure the GUI creation is done on the Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Create the frame (window)
                JFrame frame = new JFrame("Simple Swing Application");

                // Set the default close operation
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                // Create a label with a message
                JLabel label = new JLabel("Hello, this is a simple Swing application!", JLabel.CENTER);

                // Add the label to the frame's content pane
                frame.getContentPane().add(label);

                // Set the size of the frame
                frame.setSize(400, 200);

                // Make the frame visible
                frame.setVisible(true);
            }
        });
    }
}
